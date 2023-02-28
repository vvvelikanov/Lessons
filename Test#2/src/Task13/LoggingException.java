package Task13;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingException {
    private static Logger logger = Logger.getLogger("TestException2");
    static void LogException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void main(String[] args) {
        try {
            TestException.callException("dsd");
        }
        catch (Exception e){
            LogException(e);
        }
    }
}
