package lesson6;

public class User {
    String username = "default name";
    String password = "1234";
    boolean isActive;

    public User() {
        System.out.println("create new user");

    }

    public void loginToApp() {
        System.out.println("Login tp app" + username + " " + password);

    }

    public void canLogin() {
        if (isActive) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
