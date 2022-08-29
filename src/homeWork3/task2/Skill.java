package homeWork3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    private String title;
    private int exp;
}
