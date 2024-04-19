package shop.mtcoding.bodykey.meal;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop.mtcoding.bodykey.activity.Activity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@Table(name = "meal_tb")
@Entity
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy = "meal",fetch = FetchType.LAZY,cascade = CascadeType.REMOVE)
    private List<Activity> activities = new ArrayList<>();

    private String mealFilename ; // 식단 사진 주소
    private Timestamp eatTime ; // 먹은 시간
    private Timestamp createdAt;

    @Builder
    public Meal(Integer id, String mealFilename, Timestamp eatTime, Timestamp createdAt) {
        this.id = id;
        this.mealFilename = mealFilename;
        this.eatTime = eatTime;
        this.createdAt = createdAt;
    }
}
