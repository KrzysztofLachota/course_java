import java.io.File;
import java.util.Scanner;

/**
 * Excercise showing how to get input from the file
 * Application counts the number of the words in the txt file
 */
public class P5Q3 {
    public static void main(String[] args) throws Exception {
        int wordsCount = 0;
        int linesCount = 0;
        String fileName = "iliada.txt";
        File file = new File(fileName);

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            wordsCount += line.split(" ").length;
            linesCount++;
        }
        System.out.println("Książka " + fileName + " zawiera " + linesCount + " linijek tekstu i składa się z " + wordsCount + " słów.");
        scanner.close();
        
    }
}
