package shop.mtcoding.blog.admin.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    // 로그인 폼
    @GetMapping("/login-form")
    public String loginForm() {
        return "/user/login-form";
    }

    @PostMapping("/login")
    public String login() {
        return "redirect:/challenge/form";
    }
}
