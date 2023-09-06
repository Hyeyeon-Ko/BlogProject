package project.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.blog.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
