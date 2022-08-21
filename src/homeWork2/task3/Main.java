package homeWork2.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("star wars",250);
        Magazine magazine = new Magazine("forbes", 20);
        ArrayList<Printable> printableArrayList = new ArrayList<>();
        printableArrayList.add(book);
        printableArrayList.add(magazine);
        printableArrayList.get(0).print();
        printableArrayList.get(1).print();

    }
}
