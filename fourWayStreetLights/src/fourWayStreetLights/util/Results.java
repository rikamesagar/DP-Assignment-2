package fourWayStreetLights.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Results implements FileDisplayInterface, StdoutDisplayInterface {

	private String[] data = new String[100];
	PrintWriter printWriter;
	int j = 0;
	String str;
	String file = "output.txt";

	@Override
	public void writeToStdout(String s) {
		System.out.println(" " + s);
	}

	public void outputFileName(String str) {
		file = str;
	}

	@Override
	public void writeToFile() {
		try {
			printWriter = new PrintWriter(new FileWriter(file));
			for (int i = 0; i < j - 1; i++) {

				printWriter.println(data[i]);
			}
		} catch (IOException e) {
			System.out.println("Please enter the file to print !");
		}
		printWriter.close();

	}

	public void generalmethod(String s) {
		data[j] = s;
		j++;
	}

}
