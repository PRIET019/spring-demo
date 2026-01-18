package es.fplumara.dam2.spring_demo.repositories;

import es.fplumara.dam2.spring_demo.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);
}