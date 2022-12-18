package lesson7.homework7.Operation;

public interface Operation {
    double sumOperate(double firstValue, double finalValue);

    double othernessOperate(double firstValue, double finalValue);

    double multiplicOperate(double firstValue, double finalValue);

    double divisionOperate(double firstValue, double finalValue);

    double multiplicOperate(double value, int power, double FINAL_VALUE);//power value

    void chooseOperation(String operationChoice, double firstValue, double FINAL_VALUE);


}
