package shop.mtcoding.bodykey.meal;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MealService {
    private final MealJPARepository mealJPARepository ;
}
