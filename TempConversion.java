//A fun little code that will take a user input and cover their temperature into farenheit or celsius

import java.util.*;
public class TempConversion {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean valid;
		do {
		System.out.println("Please decide if you want to measure your temperature in Celsius or Farenheit. Enter 1 for Celsius, 2 for Farenheit");
		String input = in.nextLine();
		int choice = Integer.parseInt(input);
		valid = (choice ==1 || choice ==2);
			if (choice == 1) {
			System.out.println("Please enter your temperature in Farenheit");
			String c = in.nextLine();
			double cel = Double.parseDouble(c);
			double celsius = fTC(cel);
			System.out.println("Your temperature in Celsius is " + celsius + " degrees");
		}
		else if (choice == 2){
			System.out.println("Please enter your temperature in Celsius");
			String f = in.nextLine();
			double far = Double.parseDouble(f);
			double farenheit = cTF(far);
			System.out.println("Your temperature in Farenheit is " + farenheit + " degrees");
		}
		else {
			System.out.println("Please enter a valid input of 1 or 2");
		}
			} while (!valid);
	}


	private static double fTC(double cel) {
		double result = (cel-32)*(5.0/9.0);
		return result;
	}
	
	private static double cTF(double far) {
		double result = (9.0/5.0)*far+32;
		return result;
	}
}
