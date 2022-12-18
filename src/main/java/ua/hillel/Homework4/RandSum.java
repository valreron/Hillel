package ua.hillel.Homework4;

import java.util.Arrays;
import java.util.Random;

public class RandSum {
    public static void main(String[] args) {
        int[] randMass = new int[20];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < randMass.length; i++) {
            randMass[i] = random.nextInt(100);
            sum = sum + randMass[i];
        }
        System.out.println(Arrays.toString(randMass));
        System.out.println(sum);
    }
}
