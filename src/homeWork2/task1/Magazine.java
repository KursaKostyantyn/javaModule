package homeWork2.task1;

import java.util.Objects;

public class Magazine extends Book{
    private String type;

    public Magazine() {
    }

    public Magazine(String quality, int pages, String type) {
        super(quality, pages);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(type, magazine.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
