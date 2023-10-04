import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger implements LoggingStrategy {
    private final String logFilePath;

    public FileLogger(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    @Override
    public void log(String message) {
        try (FileWriter writer = new FileWriter(logFilePath, true)) {
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = now.format(formatter);

            writer.write(formattedDateTime + " - " + message + "\n");
            System.out.println("File log: " + message);
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }
}
