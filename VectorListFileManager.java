import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class VectorListFileManager {
    public static VectorList readVectorsFromFile(int numberOfVectors, String fileName)
            throws InvalidInputException, IOException, NotEnoughElementsException {
        List<String> stringList = FileManager.readFileIntoArray(fileName);
        stringList = ListManager.reduceList(stringList, numberOfVectors);
        VectorList result = new VectorList();

        result.stringListToVectorList(stringList);
        return result;
    }

    public static int getNumberOfVectors() throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        int numberOfVectors;
        System.out.println("How many vectors would you like to read from file: ");
        String numberOfVectorsString = scanner.nextLine();
        scanner.close();
        if (numberOfVectorsString.matches("\\d+")) {
            numberOfVectors = Integer.parseInt(numberOfVectorsString);
        } else {
            throw new InvalidInputException();
        }
        return numberOfVectors;
    }

    public static void main(String[] args) {
        String inputFileName = "NotCorrectVectors.txt";
        String outputFileName = "Result.txt";
        try {
            int numberOfVectors = VectorListFileManager.getNumberOfVectors();
            VectorList vectorList = VectorListFileManager.readVectorsFromFile(numberOfVectors, inputFileName);
            Vector result = vectorList.addVectors();
            FileManager.writeStringIntoFile(outputFileName, result.vectorIntoString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DifferentVectorsLengthsException e) {
            e.printStackTrace();
        } catch (InvalidInputException e) {
            e.printStackTrace();
        } catch (NotEnoughElementsException e) {
            e.printStackTrace();
        }
    }
}
