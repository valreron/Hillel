package ua.hillel.Homework4;

public class SinCalculator {
    public static void main(String[] args) {
        for (int i = 0; i <= 360; ) {
            System.out.println("Sin of " + i + " = " + Math.sin(i));
            i = i + 10;
        }
    }
}
