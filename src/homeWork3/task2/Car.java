package homeWork3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//car: {model: 'toyota', year: 2021, power: 250}
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String model;
    private int year;
    private int power;
}
