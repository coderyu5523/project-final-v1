package shop.mtcoding.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/";
    }

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
