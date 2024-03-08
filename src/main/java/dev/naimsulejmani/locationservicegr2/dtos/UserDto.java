package dev.naimsulejmani.locationservicegr2.dtos;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class UserDto {
    private long id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private char gender;
    private String address;
    private LocalDateTime createdAt;
    private RoleDto role;
}
