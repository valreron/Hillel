package lesson8;

public class ChildClass extends Lection8{
    public ChildClass() {
        super(1);
    }

    @Override
    public void nonFinalMethod() {
        super.nonFinalMethod();
    }

}
