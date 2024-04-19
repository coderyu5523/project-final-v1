package shop.mtcoding.blog.meal;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MealService {
    private final MealJPARepository mealJPARepository ;
}
