package shop.mtcoding.blog.food;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FoodService {
    private final FoodJPARepository foodJPARepository ;
}
