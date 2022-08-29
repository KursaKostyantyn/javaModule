package homeWork3.task2;

import java.util.*;

//Створити клас котрий відповідає наступній моделі
//        {
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
//        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого
public class Main {
    public static void main(String[] args) {
        Set<User> usersHashSet = new HashSet<>();
        ArrayList<Skill> skills1 = new ArrayList<>();
        skills1.add(new Skill("java", 10));
        skills1.add(new Skill("c++", 10));
        Car car1 = new Car("toyota", 2021, 250);
        User user1 = new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills1, car1);

        ArrayList<Skill> skills2 = new ArrayList<>();
        skills2.add(new Skill("java", 10));
        skills2.add(new Skill("js", 10));
        skills2.add(new Skill("c++", 10));
        skills1.add(new Skill("js", 10));
        Car car2 = new Car("toyota", 2021, 250);
        User user2 = new User(2, "vasya", "pupkin", "asd@asd.com", 31, Gender.FEMALE, skills2, car2);

        ArrayList<Skill> skills3 = new ArrayList<>();
        skills3.add(new Skill("c++", 10));
        Car car3 = new Car("toyota", 2021, 250);
        User user3 = new User(3, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills3, car3);

        ArrayList<Skill> skills4 = new ArrayList<>();
        skills4.add(new Skill("java", 10));
        skills4.add(new Skill("js", 10));
        skills4.add(new Skill("c++", 10));
        skills4.add(new Skill("c++", 10));
        skills4.add(new Skill("c++", 10));
        Car car4 = new Car("toyota", 2021, 250);
        User user4 = new User(4, "vasya", "pupkin", "asd@asd.com", 31, Gender.FEMALE, skills4, car4);

        ArrayList<Skill> skills5 = new ArrayList<>();
        skills5.add(new Skill("java", 10));
        skills5.add(new Skill("js", 10));
        skills5.add(new Skill("c++", 10));
        Car car5 = new Car("toyota", 2021, 250);
        User user5 = new User(5, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills5, car5);

        ArrayList<Skill> skills6 = new ArrayList<>();
        skills6.add(new Skill("java", 10));
        skills6.add(new Skill("js", 10));
        skills6.add(new Skill("c++", 10));
        Car car6 = new Car("toyota", 2021, 250);
        User user6 = new User(6, "vasya", "pupkin", "asd@asd.com", 31, Gender.FEMALE, skills6, car6);

        ArrayList<Skill> skills7 = new ArrayList<>();
        skills7.add(new Skill("java", 10));
        skills7.add(new Skill("js", 10));
        skills7.add(new Skill("c++", 10));
        Car car7 = new Car("toyota", 2021, 250);
        User user7 = new User(7, "vasya", "pupkin", "asd@asd.com", 31, Gender.FEMALE, skills7, car7);

        ArrayList<Skill> skills8 = new ArrayList<>();
        skills8.add(new Skill("java", 10));
        skills8.add(new Skill("js", 10));
        skills8.add(new Skill("c++", 10));
        Car car8 = new Car("toyota", 2021, 250);
        User user8 = new User(8, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills8, car8);

        ArrayList<Skill> skills9 = new ArrayList<>();
        skills9.add(new Skill("java", 10));
        skills9.add(new Skill("js", 10));
        skills9.add(new Skill("c++", 10));
        Car car9 = new Car("toyota", 2021, 250);
        User user9 = new User(9, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, skills9, car9);

        ArrayList<Skill> skills10 = new ArrayList<>();
        skills10.add(new Skill("java", 10));
        skills10.add(new Skill("js", 10));
        skills10.add(new Skill("c++", 10));
        Car car10 = new Car("toyota", 2021, 250);
        User user10 = new User(10, "vasya", "pupkin", "asd@asd.com", 31, Gender.FEMALE, skills10, car10);

//        usersHashSet.add(user1);
//        usersHashSet.add(user2);
//        usersHashSet.add(user3);
//        usersHashSet.add(user4);
//        usersHashSet.add(user5);
//        usersHashSet.add(user6);
//        usersHashSet.add(user7);
//        usersHashSet.add(user8);
//        usersHashSet.add(user9);
//        usersHashSet.add(user10);
//        System.out.println(usersHashSet.size());

//        Iterator<User> iterator = usersHashSet.iterator();
//        while (iterator.hasNext()){
//            User next = iterator.next();
//            if (next.getGender().equals(Gender.MALE)){
//                iterator.remove();
//            }
//        }
        usersHashSet.removeIf(user -> user.getGender().equals(Gender.MALE));
        System.out.println(usersHashSet.size());

        Set<User> usersTreeSet = new TreeSet<>();
        usersTreeSet.add(user1);
        usersTreeSet.add(user2);
        usersTreeSet.add(user3);
        usersTreeSet.add(user4);
        usersTreeSet.add(user5);
        usersTreeSet.add(user6);
        usersTreeSet.add(user7);
        usersTreeSet.add(user8);
        usersTreeSet.add(user9);
        usersTreeSet.add(user10);
        System.out.println(usersTreeSet);
    }
}
