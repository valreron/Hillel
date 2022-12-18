package Lesson11;

import java.util.HashSet;
import java.util.Set;

public class Lesson11 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(1);
        System.out.println(set.size());

        Set<String> setString = new HashSet<>();
        setString.add("java");
        setString.add("automation");
        setString.add("test");
        setString.add("API");
        System.out.println(setString);
    }
}
