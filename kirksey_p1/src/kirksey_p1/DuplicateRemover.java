package kirksey_p1;

import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DuplicateRemover {
    public ArrayList<String> UniqueWords = new ArrayList<String>();

    public void remove(String dataFile) throws IOException, FileNotFoundException {
        FileInputStream fileByteStream = new FileInputStream(dataFile);
        Scanner inFS = new Scanner(fileByteStream);
        String input = "init";
        HashSet<String> check = new HashSet<String>();

	    while(inFS.hasNext()) {
	    	input = inFS.next();
	    	input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
	    	if(check.add(input))
	    		UniqueWords.add(input);
        }
        
	    inFS.close();
	    fileByteStream.close();
    }

    public void write(String outputFile) throws IOException, FileNotFoundException {
        FileOutputStream fileByteStream = new FileOutputStream(outputFile);
        PrintWriter outFS = new PrintWriter(fileByteStream);

        for(int i = 0; i < UniqueWords.size(); i++) {
            outFS.println(UniqueWords.get(i));
        }
        outFS.flush();
        fileByteStream.close();
    }
}
