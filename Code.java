package myProjects;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Textual_Analysis_App {
	static Scanner datainput = new Scanner(System.in);
	public static void main(String[] args) throws FileNotFoundException {
		
		// Create Scanner and find text file.
		String fileStory = "fileStory.txt";
		File textFile = new File(fileStory);
		Scanner dataInput = new Scanner(textFile);
		dataInput.useDelimiter("");
		
		// Create Variables for counting.
		int letters = 0;
		int spaces = 0;
		int sentences = 0;
		
		// Loop through every character in the text file.
		while (dataInput.hasNext()) {
			char c = dataInput.next().charAt(0);
			
			if (Character.isLetter(c)) letters++;
			else if (c == ' ') spaces++;
			else if (c == '.' || c == '!' || c == '?') sentences++;
		}
		dataInput.close();
		
		int words = spaces + 1;
		
		// Calculate averages.
		double avgLetters = Math.round((double) letters / words * 10.0) / 10.0;
		double avgWords = Math.round((double) words / sentences * 10.0) / 10.0;
		
		// Print results
		System.out.println("Letters:            " + letters);
		System.out.println("Words:              " + words);
		System.out.println("Sentences:          " + sentences);
		System.out.println("Avg letters/word:   " + avgLetters);
		System.out.println("Avg words/sentence: " + avgWords);
	}

}
