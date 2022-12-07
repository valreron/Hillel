package lesson12;

import java.util.Objects;

public class User implements Comparable<User>{
    private String userName;
    private String email;
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(userName, user.userName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }

    @Override
    public int compareTo(User o) {
        return this.userName.compareTo(o.getUserName());
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
