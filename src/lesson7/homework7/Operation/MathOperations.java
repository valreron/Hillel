package lesson7.homework7.Operation;

public class MathOperations extends ElementaryOperations {
    //написати конструктор зі списком можливих операцій
    public MathOperations() {
        System.out.println("""
                You can choose:\s
                Elementary operations and \s
                5: module +\s
                6: module -\s
                7: module *\s
                8: module /\s
                9: pow\s
                """
        );
    }

    public double sumOperate(double firstValue, double finalValue) {
        finalValue = firstValue + secondValue;
        System.out.println(finalValue);
        return finalValue;
    }

    public double multiplicOperate(double value, int power, double FINAL_VALUE) {    //value with power
        FINAL_VALUE = Math.pow(value, power);
        System.out.println(FINAL_VALUE);
        return FINAL_VALUE;
    }

    public double divisionOperate(double finalValue, double firstValue) {          //module division
        System.out.println("Input second value: ");
        secondValue = scanner.nextDouble();

        finalValue = Math.abs(finalValue - secondValue);
        System.out.println(finalValue);
        return finalValue;
    }

    public void chooseOperation(String operationChoice, double firstValue, double FINAL_VALUE) {
        switch (operationChoice) {
            case "+" -> sumOperate(firstValue, FINAL_VALUE);
            case "-" -> divisionOperate(firstValue, FINAL_VALUE);
            case "x" -> multiplicOperate(firstValue, FINAL_VALUE);
            case "/" -> othernessOperate(firstValue, FINAL_VALUE);
            case "|-|" -> divisionOperate(FINAL_VALUE, firstValue);
            case "pow" -> {
                System.out.println("Input power");
                int power = scanner.nextInt();
                multiplicOperate(firstValue, power, FINAL_VALUE);
            }
        }
    }
}
