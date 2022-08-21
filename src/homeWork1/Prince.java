package homeWork1;

import java.util.Objects;

public class Prince {
    private String name;
    private int age;
    private int size;

    public Prince() {

    }

    public Prince(String name, int age, int size) {
        this.name = name;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size=size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prince prince = (Prince) o;
        return age == prince.age && size == prince.size && Objects.equals(name, prince.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, size);
    }

    @Override
    public String toString() {
        return "Prince{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", size=" + size +
                '}';
    }
}
