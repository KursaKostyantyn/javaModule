package homeWork2.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Printable{
    private String title;
    private int pages;

    @Override
    public void print() {
        System.out.println("printing book!!!"+this);
    }
}
