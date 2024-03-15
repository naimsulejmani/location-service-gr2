package dev.naimsulejmani.locationservicegr2.entities;

import dev.naimsulejmani.locationservicegr2.infrastructure.helpers.HasId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@Entity
@Table(name = "locations")
public class Location implements HasId<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "family_member_id")
    private FamilyMember familyMember;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    private double latitude;
    private double longitude;
    private LocalDateTime reportDate;
}












