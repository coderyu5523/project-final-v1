package shop.mtcoding.bodykey.food;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Table(name = "food_tb")
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String foodName; // 음식이름
    private Double carbo; //탄수화물
    private Double protein ; // 단백질
    private Double fat ;// 지방

    @Builder
    public Food(Integer id, String foodName, Double carbo, Double protein, Double fat) {
        this.id = id;
        this.foodName = foodName;
        this.carbo = carbo;
        this.protein = protein;
        this.fat = fat;
    }
}
