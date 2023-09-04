package project.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user/loginForm")
    public String joinForm() {

        return "user/loginForm";
    }

    @GetMapping("/user/signupForm")
    public String signForm() {

        return "user/signupForm";
    }
}
