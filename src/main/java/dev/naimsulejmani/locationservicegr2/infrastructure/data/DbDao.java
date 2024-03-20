package dev.naimsulejmani.locationservicegr2.infrastructure.data;

import java.util.List;
import java.util.Map;

public interface DbDao {
    <T> List<T> getResultFromProcedure(String procedureName,
                                       Map<String, Object> inParams,
                                       Map<String, Object> outParams,
                                       Class<T> className);

    <T> List<T> getResultFromQuery(String query,
                                   Map<String, Object> inParams,
                                   Class<T> className
    );
}
