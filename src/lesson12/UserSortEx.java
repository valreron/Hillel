package lesson12;

import java.util.Set;
import java.util.TreeSet;

public class UserSortEx {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();

        User user1 = new User();
        user1.setUserName("Valera");

        User user2 = new User();
        user2.setUserName("Sasha");

        User adminUser = new User();
        adminUser.setUserName("Admin");

        users.add(user1);
        users.add(user2);
        users.add(adminUser);
        System.out.println(users);

    }
}
