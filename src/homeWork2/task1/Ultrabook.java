package homeWork2.task1;

import java.util.Objects;

public class Ultrabook extends Laptop{
    private double weight;

    public Ultrabook() {
    }

    public Ultrabook(String cpu, int price, double screenSize, double weight) {
        super(cpu, price, screenSize);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ultrabook ultrabook = (Ultrabook) o;
        return Double.compare(ultrabook.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
