package shop.mtcoding.bodykey.whichChallenge;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class WitchChallengeController {
    private final WitchChallengeService witchChallengeService ;
    private final HttpSession session ;
}
