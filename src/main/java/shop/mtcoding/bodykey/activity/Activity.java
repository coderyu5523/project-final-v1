package shop.mtcoding.bodykey.activity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop.mtcoding.bodykey.user.User;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
@Table(name = "activity_tb")
@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    private Integer walking; // 걸음수
    private Integer drinkWater; // 물 횟수
    private Timestamp createdAt;
    private String day; //미션 진행되는 날짜. 타입 고민 필요

    @Builder
    public Activity(Integer id, User user, Integer walking, Integer drinkWater, Timestamp createdAt, String day) {
        this.id = id;
        this.user = user;
        this.walking = walking;
        this.drinkWater = drinkWater;
        this.createdAt = createdAt;
        this.day = day;
    }
}
