package dev.naimsulejmani.locationservicegr2.dtos;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RoleDto {
    @Min(value = 0, message = "Vlera minimale eshte zero (0)!")
    private int id;
    @NotBlank(message = "Nuk lejohet vlera te zbrazura!")
    private String name;
    private String description;
}
