package shop.mtcoding.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChallengeController {


    @GetMapping("/challenge/challenge-save-form")
    public String challengeSaveForm() {
        return "challenge/challenge-save-form";
    }

    @GetMapping("/challenge/form")
    public String challengeForm() {
        return "challenge/challenge-form";
    }

    @GetMapping("/challenge/challenge-update-form")
    public String challengeUpdateForm() {
        return "challenge/challenge-update-form";
    }
}
