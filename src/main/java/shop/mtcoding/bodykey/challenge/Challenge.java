package shop.mtcoding.bodykey.challenge;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop.mtcoding.bodykey.activity.Activity;
import shop.mtcoding.bodykey.user.User;
import shop.mtcoding.bodykey.whichChallenge.WhichChallenge;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

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

    @ManyToOne(fetch = FetchType.LAZY)
    private Activity activity;

    @OneToMany(mappedBy = "challenge", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<WhichChallenge> whichChallenges = new ArrayList<>();

    private Timestamp openingTime;
    private Timestamp closingTime;
    private Timestamp createdAt;

    @Builder
    public Challenge(Integer id, User user, Activity activity, List<WhichChallenge> whichChallenges, Timestamp openingTime, Timestamp closingTime, Timestamp createdAt) {
        this.id = id;
        this.user = user;
        this.activity = activity;
        this.whichChallenges = whichChallenges;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.createdAt = createdAt;
    }
}
