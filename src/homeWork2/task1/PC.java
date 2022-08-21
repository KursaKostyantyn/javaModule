package homeWork2.task1;


import java.util.Objects;

public class PC {
    private String cpu;
    private int price;

    public PC() {
    }

    public PC(String cpu, int price) {
        this.cpu = cpu;
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PC pc = (PC) o;
        return price == pc.price && cpu.equals(pc.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, price);
    }

    @Override
    public String toString() {
        return "PC{" +
                "cpu='" + cpu + '\'' +
                ", price=" + price +
                '}';
    }
}
