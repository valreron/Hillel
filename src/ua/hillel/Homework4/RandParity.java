package ua.hillel.Homework4;

import java.util.Arrays;
import java.util.Random;

public class RandParity {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomMass = new int[10];
        for (int i = 0; i < randomMass.length; i++) {
            randomMass[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(randomMass));
        for (int i = 0; i < randomMass.length; i++) {
            if (randomMass[i] % 2 == 0)
                randomMass[i] = 0;
        }
        System.out.println(Arrays.toString(randomMass));

    }
}
