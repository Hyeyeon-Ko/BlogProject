package project.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import project.blog.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
    // JPA Naming 전략
//    User findByUser_idAndUser_pw(String user_id, String user_pw);

    @Query(value = "SELECT * FROM user WHERE user_id = ? AND user_pw = ?;", nativeQuery = true)
    User login(String user_id, String user_pw);
}
