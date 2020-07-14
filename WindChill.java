import javax.swing.*;
public class WindChill {
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a temperature in Farenheit. The temparature must be equal to or between -58 and 41");
		double temperature = Double.parseDouble(input1);
		String input2 = JOptionPane.showInputDialog("Enter a wind speed greater than or equal to 2 miles per hour");
		double wind = Double.parseDouble(input2);
		if (temperature <= -58 || temperature >= 41 || wind <2) {
			String input = "Restart the code and enter a proper value for temperature and/or wind in the required range.";
			JOptionPane.showMessageDialog(null, input);
		}
		else {
		double twc = calculate(temperature, wind);
		String answer = "The wind chill based off your input is: " + twc;
		JOptionPane.showMessageDialog(null, answer);
	}
	}
	
	private static double calculate(double x, double y) {
		double answer = 35.74 + (0.6215 * x) - (35.75 * Math.pow(y, 0.16)) + (0.4275 * x* Math.pow(y, 0.16));
		return answer;
		
	}
}
