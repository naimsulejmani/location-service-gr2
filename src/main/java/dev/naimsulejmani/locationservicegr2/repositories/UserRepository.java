package dev.naimsulejmani.locationservicegr2.repositories;

import dev.naimsulejmani.locationservicegr2.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //SELECT * FORM users WHERE username = :username
    public Optional<User> findByUsername(String username);

    //SELECT * FORM users WHERE email = :email
    public Optional<User> findByEmail(String email);

    //@Query("SELECT u FROM users u WHERE u.email=?1 OR u.username=?1")
    @Query(
            value = "SELECT * FROM users AS u WHERE u.email=:emailOrUsername OR u.username=:emailOrUsername",
            nativeQuery = true
    )
    public Optional<User> findByEmailOrUsername(String emailOrUsername);
}








