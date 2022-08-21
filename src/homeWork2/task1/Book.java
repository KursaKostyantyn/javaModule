package homeWork2.task1;

import java.util.Objects;

public class Book extends Papirus{
    private int pages;

    public Book() {
    }

    public Book(String quality, int pages) {
        super(quality);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pages == book.pages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                "} " + super.toString();
    }
}
