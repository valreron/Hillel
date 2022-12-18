package HomeworkLogger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private final String loggerName;

    public Logger(String loggerName) {
        this.loggerName = loggerName;
    }

    public static Logger getLogger(String loggerName) {
        return new Logger(loggerName);
    }

    public void log(LoggerLevel level, String message) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        switch (level) {
            case INFO -> System.out.println(Color.PURPLE.getColor() + formatter.format(date) + " " + loggerName + " " + level + ": " + message + Color.RESET.getColor());
            case DEBUG -> System.out.println(Color.BLUE.getColor() + formatter.format(date) + " " + loggerName + " " + level + ": " + message + Color.RESET.getColor());
            case WARN -> System.out.println(Color.YELLOW.getColor() + formatter.format(date) + " " + loggerName + " " + level + ": " + message + Color.RESET.getColor());
            case ERROR -> System.out.println(Color.RED.getColor() + formatter.format(date) + " " + loggerName + " " + level + ": " + message + Color.RESET.getColor());
            default -> System.out.println("Here isn`t level what you want");
        }
    }

    enum Color {            //color
        RESET("\u001B[0m"),
        BLACK("\u001B[30m"),
        RED("\u001B[31m"),
        GREEN("\u001B[32m"),
        YELLOW("\u001B[33m"),
        BLUE("\u001B[34m"),
        PURPLE("\u001B[35m"),
        CYAN("\u001B[36m"),
        WHITE("\u001B[37m");

        private String color;

        Color(String logger) {

            this.color = logger;
        }

        public String getColor() {

            return color;
        }

    }

}
