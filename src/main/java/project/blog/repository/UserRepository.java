package project.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.blog.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
