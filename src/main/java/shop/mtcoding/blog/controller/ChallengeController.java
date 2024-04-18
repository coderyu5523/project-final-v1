package shop.mtcoding.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChallengeController {


    @GetMapping("/challenge/save-form")
    public String challengeSaveForm() {
        return "/challenge/save-form";
    }

    @GetMapping("/challenge/form")
    public String challengeForm() {
        return "/challenge/form";
    }

    @GetMapping("/challenge/update-form")
    public String challengeUpdateForm() {
        return "/challenge/update-form";
    }
}
