package dev.naimsulejmani.locationservicegr2.entities.reports;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleGenderSummaryReport {
    private int roleId;
    private String roleName;
    private char gender;
    private long totalUsers;
}
