import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * A tester class for the FileCounter class.
 */
public class FileCounterTester
{
    public static void main(String[] args) throws FileNotFoundException
    {
        final String FILENAME = "data.txt";
        // first we write our sample file
        PrintWriter out = new PrintWriter(FILENAME);
        out.println("This is the file we are going to use for testing.");
        out.println("It is a lovely text file with a blank line.");
        out.println();
        out.println("Everything is grammatically correct.");
        out.println("Can you guess how many words and characters there are?");
        out.close();
        // next we run the FileCounter
        FileCounter counter = new FileCounter();
        FileReader reader = new FileReader(FILENAME);
        Scanner in = new Scanner(reader);
        counter.read(in);
        System.out.println("Lines in file: " + counter.getLineCount());
        System.out.println("Words in file: " + counter.getWordCount());
        System.out.println("Characters in file: " + counter.getCharacterCount());
        in.close();
    }
}
