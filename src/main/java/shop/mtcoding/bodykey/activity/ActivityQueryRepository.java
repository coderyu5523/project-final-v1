package shop.mtcoding.bodykey.activity;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class ActivityQueryRepository {
    private final EntityManager em;
}
