package project.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.blog.model.RoleType;
import project.blog.model.User;
import project.blog.repository.UserRepository;

// 스프링이 컴포넌트 스캔을 통해 Bean에 등록을 해줌 -> IoC를 해준다
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void 회원가입(User user) {
        userRepository.save(user);
    }

    @Transactional(readOnly = true)
    public User 로그인(User user) {
        return userRepository.login(user.getUser_id(), user.getUser_pw());
    }
}
