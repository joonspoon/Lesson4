package exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class SpellingBee {

	/*
	 * Get a random word using the randomWord() method and ask the user how to spell
	 * it using the speak() method. If the user spells it right move on to a new
	 * word, but if they do not spell it right ask again. The only place that you
	 * need to write code in is the stuffForYouToDo() method.
	 */
	
	void stuffForYouToDo() {
		// Write your code here...
		
		
		
	}

	public String getRandomWord() {
		return words.get(new Random().nextInt(lines));
	}
	
	public void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

	private int lines;
	private ArrayList<String> words = new ArrayList<>();

	public SpellingBee() {
		try {
			// Get the amount of lines
			LineNumberReader lnr = new LineNumberReader(new FileReader(new File("/usr/share/dict/words")));
			lnr.skip(Long.MAX_VALUE);// Skip to the end
			lines = lnr.getLineNumber();// Get last line number
			System.out.println(lines + " words loaded.");
			lnr.close();
			BufferedReader br = new BufferedReader(new FileReader(new File("/usr/share/dict/words")));
			for (int i = 0; i < lines; i++) {
				words.add(br.readLine()); // adds every line to the array
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		stuffForYouToDo();
	}

	public static void main(String[] args) {
		new SpellingBee();
	}

}
