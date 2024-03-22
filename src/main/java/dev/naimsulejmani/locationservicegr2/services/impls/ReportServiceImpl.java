package dev.naimsulejmani.locationservicegr2.services.impls;


import dev.naimsulejmani.locationservicegr2.constants.ReportQueries;
import dev.naimsulejmani.locationservicegr2.entities.reports.RoleGenderSummaryReport;
import dev.naimsulejmani.locationservicegr2.infrastructure.data.DbDao;
import dev.naimsulejmani.locationservicegr2.services.ReportService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//JUST ENOUGH, JUST IN TIME
@Service
public class ReportServiceImpl implements ReportService {
    private final DbDao dbDao;

    public ReportServiceImpl(DbDao dbDao) {
        this.dbDao = dbDao;
    }

    @Override
    public List<RoleGenderSummaryReport> getRoleGenderSummaryReport(Integer roleId) {

        Map<String, Object> inParams = new HashMap<>();
        inParams.put("roleId", roleId <= 0 ? null : roleId);

        return dbDao.getResultFromQuery(
                ReportQueries.RPT_ROLE_GENDER_SUMMARY.getQuery(),
                inParams,
                RoleGenderSummaryReport.class);
    }
}








