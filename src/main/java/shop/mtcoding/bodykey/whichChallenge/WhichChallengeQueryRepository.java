package shop.mtcoding.bodykey.whichChallenge;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class WhichChallengeQueryRepository {
    private final EntityManager em;
}
