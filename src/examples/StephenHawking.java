package examples;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class StephenHawking {

	public static void main(String[] args) {
		while (true) {
			String text = JOptionPane.showInputDialog("Enter text:");
			if (text == null) System.exit(0);
			speak(text);
		}
	}

	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}

