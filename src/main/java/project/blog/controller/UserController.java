package project.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/loginForm")
    public String joinForm() {

        return "user/loginForm";
    }

    @GetMapping("/signupForm")
    public String signForm() {

        return "user/signupForm";
    }
}
