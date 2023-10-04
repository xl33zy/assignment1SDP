public class Main {
    public static void main(String[] args) {
        LoggingService loggingService = LoggingService.getInstance();

        LoggingStrategy consoleLogger = new ConsoleLogger();
        LoggingStrategy fileLogger = new FileLogger("log.txt");

        String message = "This is a log message";

        loggingService.log(message, consoleLogger);
        loggingService.log(message, fileLogger);
    }
}