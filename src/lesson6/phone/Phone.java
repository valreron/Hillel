package lesson6.phone;

public abstract class Phone {
    public void makeCall(String number) {
        System.out.println("calling: " + number);
    }

    public void receiveCall(String num) {
        System.out.println("new call from" + num);
    }

    abstract void receiveSms(String text);

}
