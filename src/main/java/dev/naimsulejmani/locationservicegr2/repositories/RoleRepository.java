package dev.naimsulejmani.locationservicegr2.repositories;

import dev.naimsulejmani.locationservicegr2.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
