package homeWork3.task2;
//Створити клас котрий відповідає наступній моделі

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

//
//
//        }
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Comparable<User> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    Gender gender;
    ArrayList<Skill> skills;
    Car car;


    @Override
    public int compareTo(User o) {
        return this.skills.size()-o.skills.size();
    }
}
