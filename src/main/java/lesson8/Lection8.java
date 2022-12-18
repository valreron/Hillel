package lesson8;

public class Lection8 {
    private int nonFinalValue = 0;
    private final int finalValue = 1;
    private final int constValue;

    public Lection8(int value) {
        constValue = value;
    }

    public void changeValue() {
        nonFinalValue++;
    }

    public void nonFinalMethod(){

    }

    public final void finalMethod(){

    }
}
