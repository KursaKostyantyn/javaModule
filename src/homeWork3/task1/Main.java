package homeWork3.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Створити List Юзерів
//        - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Koly", "Vasilev", 25));
        users.add(new User(2, "Vasya", "Lap", 45));
        users.add(new User(3, "Mashya", "Loi", 15));
        users.add(new User(4, "Ola", "Sol", 23));
        List<User> userList = users
                .stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());
        System.out.println(userList);

        List<User> userList2 = new ArrayList<>();
        for (User user : users) {
            userList2.add(user);
        }
        userList2.sort((u1, u2) -> u1.getName().length() - u2.getName().length());
        System.out.println(userList2);

//        створити ArrayList зі словами на 15-20 елементів.
//                - відсортувати його за алфавітом .
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ";
        String[] stringList = string.split(" ");
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < stringList.length; i++) {
            String s = stringList[i];
            strings.add(s);
        }
        System.out.println(strings);
        List<String> stream = strings
                .stream()
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(Collectors.toList());
        System.out.println(stream);
        Arrays.sort(stringList);
        System.out.println(stringList);
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
