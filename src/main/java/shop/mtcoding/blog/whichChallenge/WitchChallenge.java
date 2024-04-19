package shop.mtcoding.blog.whichChallenge;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop.mtcoding.blog.challenge.Challenge;

@NoArgsConstructor
@Data
@Table(name = "witchChallengenge_tb")
@Entity
public class WitchChallenge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String challengeName ; // 챌린지명
    private String challengeFilename ;// 챌린지 사진경로
    private Integer meter ; // 거리
    private String badgeFilename ; // 뱃지 사진 url
    private String location ; // 산 지역
    private String content;  // 챌린지 내용

    @ManyToOne
    @JoinColumn(name = "challenge_id")
    private Challenge challenge;

    @Builder
    public WitchChallenge(Integer id, String challengeName, String challengeFilename, Integer meter, String badgeFilename, String location, String content) {
        this.id = id;
        this.challengeName = challengeName;
        this.challengeFilename = challengeFilename;
        this.meter = meter;
        this.badgeFilename = badgeFilename;
        this.location = location;
        this.content = content;
    }
}
