package shop.mtcoding.bodykey.food;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class FoodQueryRepository {
    private final EntityManager em;
}
