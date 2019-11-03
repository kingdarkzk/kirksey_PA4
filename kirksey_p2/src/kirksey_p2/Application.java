package kirksey_p2;

import java.io.IOException;
import java.io.FileNotFoundException;

public class Application {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DuplicateCounter duplicateCounter = new DuplicateCounter();
        
        System.out.println("Trying counter");
        duplicateCounter.count("problem2.txt");
        System.out.println("Counting finished");
        System.out.println("Trying write");
        duplicateCounter.write("unique_word_counts.txt");
        System.out.println("Writing finished");
    }
}