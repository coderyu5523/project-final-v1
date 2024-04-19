package shop.mtcoding.bodykey.whichChallenge;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class WhichChallengeService {
    private final WhichChallengeJPARepository whichChallengeJPARepository;
}
