package kirksey_p2;

import java.util.Scanner;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DuplicateCounter {
    public HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();

    public void count(String dataFile) throws IOException, FileNotFoundException {
        FileInputStream fileByteStream = new FileInputStream(dataFile);
        Scanner inFS = new Scanner(fileByteStream);
        String input = "init";

	    while(inFS.hasNext()) {
	    	input = inFS.next();
	    	input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
	    	if(wordCounter.containsKey(input)) {
	    		wordCounter.put(input, wordCounter.get(input) + 1);
	    	}
	    	else {
	    		wordCounter.put(input, 1);
	    	}
	    }
	    inFS.close();
	    fileByteStream.close();
    }

    public void write(String outputFile) throws IOException, FileNotFoundException {
        FileOutputStream fileByteStream = new FileOutputStream(outputFile);
        PrintWriter outFS = new PrintWriter(fileByteStream);
        
        for(String name: wordCounter.keySet()){
           	String key = name.toString();
           	String value = wordCounter.get(name).toString();  
           	outFS.println(key + ": " + value);  
        	} 
        
        outFS.flush();
        fileByteStream.close();
    }
}
