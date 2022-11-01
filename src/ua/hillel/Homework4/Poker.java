package ua.hillel.Homework4;

import java.util.Arrays;
import java.util.Random;

public class Poker {

    public static void main(String[] args) {
        String[] cardNum = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] cardColor = {"diamonds", "spades", "clubs", "hearts"}; // бубна, піка, хреста, черва
        Random random = new Random();
        String[] allSet = new String[20];
        GamerSets gamerSets = new GamerSets();
        for (int i = 0, k = 1; i < 20; i++, k++) {
            allSet[i] = cardNum[random.nextInt(cardNum.length)] + " " + cardColor[random.nextInt(cardColor.length)];
            if (k == 5)
                k = 1;
            if (i == 0) {
                System.out.println("Player № " + k + " gets card: " + allSet[i]);
                continue;
            }
            for (int j = 0; j < i; j++) {
                if (allSet[j].equals(allSet[i])) {
                    allSet[i] = cardNum[random.nextInt(cardNum.length)] + " " + cardColor[random.nextInt(cardColor.length)];
                    j = 0;
                }
            }
            System.out.println("Player № " + k + " gets card: " + allSet[i]);
        }
        System.out.println();
        System.out.println(Arrays.toString(allSet));
        System.out.println();

        System.out.println("Gamer 1 set: " + gamerSets.sorting(allSet, 0));
        System.out.println("Gamer 2 set: " + gamerSets.sorting(allSet, 1));
        System.out.println("Gamer 3 set: " + gamerSets.sorting(allSet, 2));
        System.out.println("Gamer 4 set: " + gamerSets.sorting(allSet, 3));


    }

}

class GamerSets {
    public String sorting(String[] set, int count) {
        int index = 0;
        String[] gamerSet = new String[5];
        while (count < set.length) {
            gamerSet[index] = set[count];
            count = count + 4;
            index++;
        }
        return Arrays.toString(gamerSet);
    }

}
