package shop.mtcoding.bodykey.challenge;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop.mtcoding.bodykey.user.User;
import shop.mtcoding.bodykey.whichChallenge.WhichChallenge;

import java.sql.Timestamp;


@NoArgsConstructor
@Data
@Table(name = "challenge_tb")
@Entity
public class Challenge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private Integer totalWalking; // 걸음수 합산


    @ManyToOne(fetch = FetchType.LAZY)
    private WhichChallenge whichChallenge;

    private Timestamp openingTime;
    private Timestamp closingTime;
    private Timestamp createdAt;

    @Builder
    public Challenge(Integer id, User user, Integer totalWalking, WhichChallenge whichChallenge, Timestamp openingTime, Timestamp closingTime, Timestamp createdAt) {
        this.id = id;
        this.user = user;
        this.totalWalking = totalWalking;
        this.whichChallenge = whichChallenge;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.createdAt = createdAt;
    }
}
