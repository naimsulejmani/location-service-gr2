package dev.naimsulejmani.locationservicegr2.dtos;

import lombok.Data;

@Data
public class UserSimpleDto {
    private long id;
    private String username;
    private String email;
    private String name;
    private String surname;
}
