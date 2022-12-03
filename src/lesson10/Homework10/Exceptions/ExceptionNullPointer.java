package lesson10.Homework10.Exceptions;

public class ExceptionNullPointer extends Exception {

    public ExceptionNullPointer(String message) {
        super("\u001B[33m Exception: \u001B[0m" + message + "\u001B[33m : problems with numbers of Players \u001B[0m");
    }
}
