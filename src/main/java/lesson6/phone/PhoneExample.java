package lesson6.phone;

public class PhoneExample {
    public static void main(String[] args) {
        Phone phone = new Android();
        phone.receiveSms("hello java");



        phone = new Iphone();
        phone.receiveSms("hello Iphone");

        Iphone iphone2 = new Iphone();
        iphone2.makePhoto();
    }
}
