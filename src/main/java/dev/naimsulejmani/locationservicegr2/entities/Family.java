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
@Table(name = "families")
public class Family implements HasId<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "family", fetch = FetchType.LAZY)
    private List<FamilyMember> familyMembers;
}














