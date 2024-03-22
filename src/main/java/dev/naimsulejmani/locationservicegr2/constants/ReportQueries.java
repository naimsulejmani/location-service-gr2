package dev.naimsulejmani.locationservicegr2.constants;

public enum ReportQueries {
    RPT_ROLE_GENDER_SUMMARY (
            """
                  SELECT r.id AS roleId,
                          r.name AS roleName,
                          u.gender,
                          COUNT(*) AS totalUsers
                  FROM roles AS r
                        INNER JOIN users AS u ON r.id=u.role_id
                  WHERE COALESCE(:roleId, r.id) = r.id
                  GROUP BY r.id, r.name, u.gender
                """
    );


    private final String query;

    public String getQuery() {
        return query;
    }

    private ReportQueries(String query) {
        this.query = query;
    }
}
