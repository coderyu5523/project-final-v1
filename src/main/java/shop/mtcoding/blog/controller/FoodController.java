package shop.mtcoding.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {

    @GetMapping("/logout")
    public String logout() {
        return "redirect:/";
    }

    @GetMapping("/food/food-save-form")
    public String foodSaveForm() {
        return "food/food-save-form";
    }

    @GetMapping("/food/food-update-form")
    public String foodUpdateForm() {
        return "food/food-update-form";
    }

    @GetMapping("/food/form")
    public String foodForm() {
        return "food/food-form";
    }

}
