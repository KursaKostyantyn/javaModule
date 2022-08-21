package homeWork2.task1;

import java.util.Objects;

public class Workstation extends Laptop{
    private int ram;

    public Workstation() {
    }

    public Workstation(String cpu, int price, double screenSize, int ram) {
        super(cpu, price, screenSize);
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Workstation that = (Workstation) o;
        return ram == that.ram;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ram);
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "ram=" + ram +
                "} " + super.toString();
    }

    public static class Magazine extends Book {
    }
}
