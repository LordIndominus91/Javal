import javax.swing.*;
public class ASCIIConversion {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter a numerical integer value between 0 and 127.");
		int ascii = Integer.parseInt(input);
		String output = "The character value for the ASCII integer code you gave is " + (char)ascii;
		JOptionPane.showMessageDialog(null, output);
		if (ascii < 0 || ascii > 127) {
			System.out.println("Restart the code and enter a numerical value between 0 and 127.");
		}
		
	}
}
