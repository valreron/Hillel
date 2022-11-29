package HomeworkLogger;

public class Test {
    private static final Logger LOGGER = Logger.getLogger(Test.class.getName());

    public static void main(String[] args) {

        LOGGER.log(LoggerLevel.WARN, "Eah BOY");
        LOGGER.log(LoggerLevel.DEBUG, "I");
        LOGGER.log(LoggerLevel.INFO, "DID");
        LOGGER.log(LoggerLevel.ERROR, "IT!!!");


    }
}
