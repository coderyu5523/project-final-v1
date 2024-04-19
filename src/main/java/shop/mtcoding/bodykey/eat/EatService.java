package shop.mtcoding.bodykey.eat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EatService {
    private final EatJPARepository eatJPARepository ;
}
