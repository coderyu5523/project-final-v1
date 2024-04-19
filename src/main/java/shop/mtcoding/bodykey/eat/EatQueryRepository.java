package shop.mtcoding.bodykey.eat;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class EatQueryRepository {
    private final EntityManager em;
}
