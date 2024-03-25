package dev.naimsulejmani.locationservicegr2.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageModel {
    private String from;
    private String text;
}
