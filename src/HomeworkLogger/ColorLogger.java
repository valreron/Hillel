package HomeworkLogger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ColorLogger {

    private static final Logger LOGGER = Logger.getLogger(Color.class.getName());

    public String logError(String messageText) {
        return Color.RED.getColor() + "ERROR: " + messageText;
    }

    public String logDebug(String messageText) {
        return Color.PURPLE.getColor() + "DEBUG: " + messageText;
    }

    public String logInfo(String messageText) {
        return Color.GREEN.getColor() + "INFO: " + messageText;
    }

    public String logWarn(String messageText) {
        return Color.YELLOW.getColor() + "WARNING: " + messageText;
    }
}
