package Lesson11;

import java.util.LinkedList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);

        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(4));


        list.set(0,5);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);


    }
}
