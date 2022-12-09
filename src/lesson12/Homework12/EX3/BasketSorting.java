package lesson12.Homework12.EX3;

import lesson12.MyComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasketSorting {
    public static void main(String[] args) {
        List<Integer> listPopeliushki = new ArrayList<>();
        List<Integer> basketList1 = new ArrayList<>();
        List<Integer> basketList2 = new ArrayList<>();
        List<Integer> basketList3 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            listPopeliushki.add(random.nextInt(100));
        }
        System.out.println(listPopeliushki);
        listPopeliushki.sort(new MyComparator());
        System.out.println("Popeliushka sorted her list: \s" + listPopeliushki);

        for (int actualValue : listPopeliushki) {
            if (actualValue % 2 == 0) {
                basketList1.add(actualValue);
            } else if (actualValue % 3 == 0) {
                basketList2.add(actualValue);
            } else if (actualValue % 2 == 0 && actualValue % 3 == 0) {
                basketList1.add(actualValue);
                basketList2.add(actualValue);
            } else {
                basketList3.add(actualValue);
            }
        }
        basketList1.sort(new MyComparator());
        basketList2.sort(new MyComparator());
        basketList3.sort(new MyComparator());

        System.out.println("Sorted first basket " + basketList1);
        System.out.println("Sorted second basket " + basketList2);
        System.out.println("Sorted  third basket " + basketList3);
    }
}
