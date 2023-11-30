import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileManager {
    public static List<String> readFileIntoArray(String inputFileName) throws IOException {
        Path pathInput = Path.of(inputFileName);
        List<String> allLines;
        allLines = Files.readAllLines(pathInput);
        return allLines;
    }

    public static void writeStringIntoFile(String outputFileName, String outputString) throws IOException {
        Path pathOutput = Path.of(outputFileName);
        Files.writeString(pathOutput, "");
        Files.writeString(pathOutput, outputString, StandardOpenOption.APPEND);
    }
}