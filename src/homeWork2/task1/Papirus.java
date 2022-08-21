package homeWork2.task1;

import java.util.Objects;

public class Papirus {
    private String quality;

    public Papirus() {
    }

    public Papirus(String quality) {
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Papirus papirus = (Papirus) o;
        return Objects.equals(quality, papirus.quality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quality);
    }

    @Override
    public String toString() {
        return "Papirus{" +
                "quality='" + quality + '\'' +
                '}';
    }
}
