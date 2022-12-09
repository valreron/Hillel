package lesson12.Homework12.EX1;

import java.util.*;


public class Collections {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            inputList.add(random.nextInt(50));
        }
        System.out.println("Input List: \s" + inputList);

        Set<Integer> newList = new HashSet<>(inputList);
        System.out.println("Filtered List: \s" + newList);

        System.out.println("Numbers of diff = " + (inputList.size() - newList.size()));
    }
}


