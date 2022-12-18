package lesson12;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();
//        map.put("one", 1);
//        map.put("two", 2);
//        map.put("three", 3);
//        map.put("four", 4);
//
//        map.put("two", 6);
//        System.out.println(map.size());
//        System.out.println(map);
//        System.out.println("------");
//        System.out.println(map.get("one"));
//        map.getOrDefault("six", 0);
//
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//
//
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            entry.getKey();
//            entry.getValue();

//
//        }
        User user = new User();
        user.setUserName("user1");

        Map<User,String> userMap = new HashMap<>();
        userMap.put(user,"111");

        user.setAge(25);

        System.out.println(userMap.get(user));

    }
}
