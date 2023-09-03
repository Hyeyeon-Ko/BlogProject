package project.blog.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import project.blog.model.User;
import project.blog.repository.UserRepository;

import java.util.List;
import java.util.function.Supplier;

@RestController
public class DummeyControllerTest {

    @Autowired //의존성 주입
    private UserRepository userRepository;

    //회원 등록
    @PostMapping("/insert")
    public String test(String user_id, String user_pw, String email) {
        System.out.println("user_id: " + user_id);
        System.out.println("user_pw: " + user_pw);
        System.out.println("email: " + email);

        return "회원가입완료";
    }

    @PostMapping("/insert2")
    public String test2 (User user) {
        System.out.println("useremail: " + user.getEmail());

        userRepository.save(user);
        return "회원가입완료2";
    }

    //회원 개인정보
    @GetMapping("/detail/{user_idx}")
    public User detail(@PathVariable int user_idx) {
        User user = userRepository.findById(user_idx).orElseThrow(new Supplier<IllegalArgumentException>() {
            @Override
            public IllegalArgumentException get() {
                return new IllegalArgumentException("유저 " + user_idx + "는 없는 유저입니다.");
            }
        });
        return user;
    }

    //회원 리스트
    @GetMapping("/select/list")
    public List<User> list() {
        return userRepository.findAll();
    }

    //수정
    @PutMapping("/detail/{id}")
    @Transactional //함수 시작할 때 작동이 되어 함수 종료시에 자동 commit
    public User update(@PathVariable int id, @RequestBody User requestUser) {
        System.out.println("user_pw : " + requestUser.getUser_pw());
        System.out.println("email : " + requestUser.getEmail());
        System.out.println("user_idx : " + id);

        User user = userRepository.findById(id).orElseThrow(() -> {
            return new IllegalArgumentException("수정할 수 없습니다");
        });
        user.setUser_pw(requestUser.getUser_pw());
        user.setEmail(requestUser.getEmail());

        return user;
    }

    //회원 삭제
    @DeleteMapping("/detail/{id}")
    public String delete(@PathVariable int id) {
        try {
            userRepository.deleteById(id);
        } catch (EmptyResultDataAccessException exception) {
            return "없는 아이디입니다.";
        }
        return "아이디 삭제완료";
    }
}
