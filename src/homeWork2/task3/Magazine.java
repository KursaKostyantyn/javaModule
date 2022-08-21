package homeWork2.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine implements Printable{
    private String title;
    private int size;

    @Override
    public void print() {
        System.out.println("printing magazine!!!"+this);
    }
}
