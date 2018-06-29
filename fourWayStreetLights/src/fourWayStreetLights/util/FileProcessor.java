package fourWayStreetLights.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import fourWayStreetLights.service.StretLightsContext;

public class FileProcessor {

	Scanner in;
	String str;

	FileProcessor fp = new FileProcessor(args[0]);
	Results rs = new Results(args[1]);
	StretLightsContext slc = new StretLightsContext();
	
	public String ReadLine(String inputFile) {
		String file = inputFile;
		try {
			if (in == null) {
				in = new Scanner(new File(file));
			}

			BufferedReader br = new BufferedReader(new FileReader(file));
			try {
				if (br.readLine() == null) {
					System.out.println("No errors, and file empty");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (in.hasNext()) {
				String curr;
				curr = in.nextLine();
				return curr;
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		while((str = fp.readLine()) != null) {
	    	int element = 0;
	    	try {
	    		element = Integer.parseInt(str);
	    	}
	    	catch (Exception e) {
	    		System.out.println("Error Occured: The value is not an integer");
	    	}
	    	mal.insertSorted(element);
	    }
	    
		
		return null;
	}
}