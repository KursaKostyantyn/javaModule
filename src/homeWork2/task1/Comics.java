package homeWork2.task1;

import java.util.Objects;

public class Comics extends Book{
    private String universe;

    public Comics() {
    }

    public Comics(String quality, int pages, String universe) {
        super(quality, pages);
        this.universe = universe;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Comics comics = (Comics) o;
        return Objects.equals(universe, comics.universe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), universe);
    }

    @Override
    public String toString() {
        return "Comics{" +
                "universe='" + universe + '\'' +
                "} " + super.toString();
    }
}
