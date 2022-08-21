package homeWork2.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tube implements Instrument {
    private double diameter;

    @Override
    public void play() {
        System.out.println("playing the " + this);
    }
}
