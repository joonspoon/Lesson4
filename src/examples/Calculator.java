package examples;

import javax.swing.JOptionPane;

public class Calculator {

	public static void main(String[] args) {

		int method = JOptionPane.showOptionDialog(null, "Choose a method:", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "OddOrEven" }, null);

		if (method == 0) {
			String number1 = JOptionPane.showInputDialog("First number?");
			String number2 = JOptionPane.showInputDialog("First number?");
			int number1AsInt = Integer.parseInt(number1);
			int number2AsInt = Integer.parseInt(number2);
			JOptionPane.showMessageDialog(null, "The answer is: " + new Calculator().add(number1AsInt, number2AsInt));
		} else {
			String number2 = JOptionPane.showInputDialog("Enter the number:");
			int number2AsInt = Integer.parseInt(number2);
			JOptionPane.showMessageDialog(null, "The answer is: " + new Calculator().oddOrEven(number2AsInt));
		}

	}

	int add(int x, int y) {
		return x + y;
	}

	String oddOrEven(int number) {
		if (number % 2 == 0) {
			return "even";
		} else {
			return "odd";
		}
	}

}
