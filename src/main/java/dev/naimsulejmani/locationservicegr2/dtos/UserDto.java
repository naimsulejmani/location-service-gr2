package dev.naimsulejmani.locationservicegr2.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class UserDto {
    @Min(0)
    private long id;
    @NotBlank
    private String username;
    @NotBlank
    @Length(min = 8, max = 50)
    private String password;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    private LocalDate birthdate;
    private char gender;
    private String address;
    private LocalDateTime createdAt;
    private RoleDto role;
}
