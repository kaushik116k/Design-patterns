package Design_Patterns.Singleton_Pattern;

class Logger {
    private Logger() {
        System.out.println("Logger instance is created");
    };

    static Logger LoggerInstance;

    public static Logger createInstance() {
        if(LoggerInstance == null) {
            LoggerInstance = new Logger();
        }

        return LoggerInstance;
    }

    public void LogMessage(String msg) {
        System.out.println(msg);
    }
}

public class Example {
    public static void main(String[] args) {
        Logger logger1 = Logger.createInstance();
        logger1.LogMessage("This msg is from user 1");

        Logger logger2 = Logger.createInstance();
        logger2.LogMessage("This msg is from user 2");
    }    
}
