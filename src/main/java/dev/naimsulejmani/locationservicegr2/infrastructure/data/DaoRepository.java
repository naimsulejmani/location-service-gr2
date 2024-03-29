package dev.naimsulejmani.locationservicegr2.infrastructure.data;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class DaoRepository implements DbDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public <T> List<T> getResultFromProcedure(String procedureName, Map<String, Object> inParams, Map<String, Object> outParams, Class<T> className) {
        Session session = entityManager.unwrap(Session.class); // krijo sessionin me lidhje me db
        ProcedureCall procedureCall = session.createStoredProcedureCall(procedureName, className);// CALL sp_test (?,?)
        //qitu shtoj parametrat ne menyre dinamike
        addParameters(procedureCall, inParams, outParams);

        var resultSet = (List<T>) procedureCall.getResultList();

        session.close();

        return resultSet;
    }

    private void addParameters(ProcedureCall procedureCall, Map<String, Object> inParams, Map<String, Object> outParams) {
        addParameters(procedureCall, inParams, ParameterMode.IN);
        addParameters(procedureCall, outParams, ParameterMode.OUT);
    }

    private void addParameters(ProcedureCall procedureCall, Map<String, Object> params, ParameterMode mode) {
        if (params != null && !params.isEmpty()) {
            for (String key : params.keySet()) {
                Object value = params.get(key);
                if (value != null) {
                    procedureCall.registerParameter(key, value.getClass(), mode);
                    procedureCall.setParameter(key, value);
                }
            }
        }
    }

    @Override
    public <T> List<T> getResultFromQuery(String query, Map<String, Object> inParams, Class<T> className) {
        Session session = entityManager.unwrap(Session.class);
        TypedQuery<T> nativeQuery = session.createNativeQuery(query, className);
        if (inParams != null) {
            for (Map.Entry<String, Object> entry : inParams.entrySet()) {
                nativeQuery.setParameter(entry.getKey(), entry.getValue());
            }
        }

        var resultSet = nativeQuery.getResultList();

        session.close();

        return resultSet;
    }
}
