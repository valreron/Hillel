package lesson6;

public class Lesson6Ex {
    public static void main(String[] args) {
        User user1 = new User();
        user1.username = "user1@gmail.com";
        user1.password = "pass1";
        user1.isActive = true;

        User user2 = new User();
        user2.username = "user2@gmail.com";
        user2.password = "pass2";
        user2.isActive = false;

        user1.canLogin();
        user2.canLogin();

        user1.loginToApp();
        user2.loginToApp();
    }
}
