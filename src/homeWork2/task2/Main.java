package homeWork2.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Skill> skills=new ArrayList<>();
        skills.add(new Skill("java",10));
        skills.add(new Skill("js",10));
        skills.add(new Skill("c++",10));
        Car car =new Car("toyota",2021,250);
        User user=new User(1,"vasya","pupkin","asd@asd.com",31,Gender.MALE,skills,car);
        System.out.println(user);

    }
}
