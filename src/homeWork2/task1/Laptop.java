package homeWork2.task1;

import java.util.Objects;

public class Laptop extends PC{
    private double screenSize;

    public Laptop() {
    }

    public Laptop(String cpu, int price, double screenSize) {
        super(cpu, price);
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.screenSize, screenSize) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), screenSize);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screenSize=" + screenSize +
                "} " + super.toString();
    }
}
