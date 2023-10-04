public class LoggingService {
    private static LoggingService instance;

    private LoggingService() {}

    public static LoggingService getInstance() {
        if (instance == null) {
            instance = new LoggingService();
        }
        return instance;
    }

    public void log(String message, LoggingStrategy strategy) {
        strategy.log(message);
    }
}