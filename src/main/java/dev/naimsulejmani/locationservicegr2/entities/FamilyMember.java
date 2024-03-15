package dev.naimsulejmani.locationservicegr2.entities;

import dev.naimsulejmani.locationservicegr2.infrastructure.helpers.HasId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "family_members")
public class FamilyMember implements HasId<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family;


    private LocalDateTime requestDate = LocalDateTime.now();
    private LocalDateTime validTo = LocalDateTime.now().plusDays(7);
    private Boolean approved;
    private LocalDateTime approvedDate;

    @OneToMany(mappedBy = "familyMember", fetch = FetchType.LAZY)
    private List<Location> locations;

}
















