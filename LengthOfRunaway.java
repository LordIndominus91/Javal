//Another simple, interactive code. Using an input of speed and acceleration, this code calculates the length of a runway for a plane
import java.util.*;
public class LengthOfRunaway {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		System.out.println("Input a speed: ");
		double speed = data.nextDouble();
		System.out.println("Enter accelartion of takeoff: ");
		double acceleration = data.nextDouble();
		System.out.println("The length of the runway is " + meters(speed, acceleration) + " meters.");
	}
	
	private static double meters (double x, double y) {
		double results = (Math.pow(x, 2))/(2*y);
		return results;
	}
}
