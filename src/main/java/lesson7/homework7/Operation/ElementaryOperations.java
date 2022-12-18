package lesson7.homework7.Operation;

import java.util.Scanner;

public class ElementaryOperations implements Operation {
    public ElementaryOperations() {
        System.out.println("""
                You can choose:\s
                1: +\s
                2: -\s
                3: *\s
                4: /\s
                """
        );
    }

    Scanner scanner = new Scanner(System.in);
    public double secondValue;

    @Override
    public double sumOperate(double firstValue, double finalValue) {
        System.out.println("Input second value: ");
        secondValue = scanner.nextDouble();

        finalValue = firstValue + secondValue;
        System.out.println(finalValue);
        return finalValue;
    }

    @Override
    public double othernessOperate(double firstValue, double finalValue) {
        System.out.println("Input second value: ");
        secondValue = scanner.nextDouble();
        finalValue = firstValue / secondValue;
        System.out.println(finalValue);
        return finalValue;
    }

    @Override
    public double multiplicOperate(double firstValue, double finalValue) {
        System.out.println("Input second value: ");
        secondValue = scanner.nextDouble();
        finalValue = firstValue * secondValue;
        System.out.println(finalValue);
        return finalValue;
    }

    @Override
    public double divisionOperate(double firstValue, double finalValue) {
        finalValue = firstValue - secondValue;
        System.out.println(finalValue);
        return finalValue;
    }

    @Override
    public void chooseOperation(String operationChoice, double firstValue, double FINAL_VALUE) {
        switch (operationChoice) {
            case "+" -> sumOperate(firstValue, FINAL_VALUE);
            case "-" -> divisionOperate(firstValue, FINAL_VALUE);
            case "x" -> multiplicOperate(firstValue, FINAL_VALUE);
            case "/" -> othernessOperate(firstValue, FINAL_VALUE);
            default -> System.out.println("there isn`t this operation");
        }
    }

    @Override
    public double multiplicOperate(double value, int power, double FINAL_VALUE) {
        return 0;
    }
}
