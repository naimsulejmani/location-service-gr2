package dev.naimsulejmani.locationservicegr2.services;

import dev.naimsulejmani.locationservicegr2.entities.reports.RoleGenderSummaryReport;

import java.util.List;

public interface ReportService {
    public List<RoleGenderSummaryReport> getRoleGenderSummaryReport(Integer roleId);
}
