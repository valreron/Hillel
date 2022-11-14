package lesson7.homework7;

import lesson7.homework7.Operation.ElementaryOperations;
import lesson7.homework7.Operation.MathOperations;
import lesson7.homework7.Operation.Operation;

import java.util.Scanner;

public class Calculator {
    private static int FINAL_VALUE = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int firstValue;
        String operationChoice;
        Operation operations;

        System.out.println("Welcome to calculator!!!\n"
                + "Choose type of calculation");
        System.out.println("1: elementary calculation\n"
                + "2. Math calculation");
        choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                operations = new ElementaryOperations();
                System.out.println("Elementary calculator");
            }
            case 2 -> {
                operations = new MathOperations();
                System.out.println("Math Calculator");
            }
            default -> {
                System.out.println("You wrote not true variant");
                return;
            }
        }
        System.out.println("Input 1st value: ");
        firstValue = scanner.nextInt();
        //choice operation
        System.out.println("choose operation:");
        operationChoice = scanner.next();
        operations.chooseOperation(operationChoice, firstValue, FINAL_VALUE);

    }
}
