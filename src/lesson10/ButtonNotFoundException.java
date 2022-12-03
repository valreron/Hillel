package lesson10;

public class ButtonNotFoundException extends RuntimeException{
    public ButtonNotFoundException(String page, String message){
        super("On page " + page + " " + message);
    }
}
