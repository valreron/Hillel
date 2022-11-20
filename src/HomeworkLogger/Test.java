package HomeworkLogger;

public class Test {

    public static void main(String[] args) {

        ColorLogger colorLogger = new ColorLogger();

        System.out.println(colorLogger.logInfo("try"));
        System.out.println(colorLogger.logDebug("do"));
        System.out.println(colorLogger.logWarn("it"));
        System.out.println(colorLogger.logError("NOW!"));
    }
}
