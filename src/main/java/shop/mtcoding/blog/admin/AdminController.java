package shop.mtcoding.blog.admin;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import shop.mtcoding.blog.activity.ActivityService;
import shop.mtcoding.blog.challenge.ChallengeService;
import shop.mtcoding.blog.meal.MealService;
import shop.mtcoding.blog.user.UserService;

@RequiredArgsConstructor
@Controller
public class AdminController {

    private final UserService userService;
    private final ActivityService activityService ;
    private final ChallengeService challengeService ;
    private final MealService mealService ;
    private final HttpSession session ;

    // 로그인 폼
    @GetMapping("/")
    public String loginForm() {
        return "/user/login-form";
    }

    @PostMapping("/login")
    public String login() {
        return "redirect:/challenge/form";
    }

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/";
    }

    //챌린지 관련
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

    //식단 관련
    @GetMapping("/food/save-form")
    public String foodSaveForm() {
        return "food/save-form";
    }

    @GetMapping("/food/update-form")
    public String foodUpdateForm() {
        return "food/update-form";
    }

    @GetMapping("/food/form")
    public String foodForm() {
        return "food/form";
    }
}
