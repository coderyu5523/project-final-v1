package shop.mtcoding.bodykey.user;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
@Table(name = "user_tb")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String username; //유저네임
    private String password; //비밀번호
    private String phone; // 전화번호
    private String name; // 이름
    private Timestamp birth; //생년월일
    private Character gender; //성별 M,F
    private double height; // 키
    private double weight; // 몸무게
    private double muscle; // 근육량
    private double fat; // 지방량
    private String userFilename; // 사진파일경로
    private Integer sumCoin; // 보상 받은 코인 합산
    private Timestamp createdAt;

    @Builder
    public User(Integer id, String username, String password, String phone, String name, Timestamp birth, Character gender, double height, double weight, double muscle, double fat, String userFilename, Integer sumCoin, Timestamp createdAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.muscle = muscle;
        this.fat = fat;
        this.userFilename = userFilename;
        this.sumCoin = sumCoin;
        this.createdAt = createdAt;
    }
}
