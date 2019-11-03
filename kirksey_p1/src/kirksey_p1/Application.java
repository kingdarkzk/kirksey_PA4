package kirksey_p1;

import java.io.IOException;
import java.io.FileNotFoundException;

public class Application {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DuplicateRemover duplicateRemover = new DuplicateRemover();
        
        System.out.println("Trying removal");
        duplicateRemover.remove("problem1.txt");
        System.out.println("Removal finished");
        System.out.println("Trying write");
        duplicateRemover.write("unique_words.txt");
        System.out.println("Writing finished");
    }
}