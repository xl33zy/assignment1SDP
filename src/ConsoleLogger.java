public class ConsoleLogger implements LoggingStrategy {
    @Override
    public void log(String message) {
        System.out.println("Console log: " + message);
    }
}
