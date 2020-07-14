import javax.swing.*;
import java.util.*;
public class TriangleGeometry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter three x-coordinate points for a triangle: ");
		double x1 = input.nextDouble();
		double x2 = input.nextDouble();
		double x3 = input.nextDouble();
		System.out.println("Enter three y-coordinates for a triangle: ");
		double y1 = input.nextDouble();
		double y2 = input.nextDouble();
		double y3 = input.nextDouble();
		double s1 = Math.pow(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2), 0.5);
		double s2 = Math.pow(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2), 0.5);
		double s3 = Math.pow(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2), 0.5);
		double side = sideCalculation(s1, s2, s3);
		double area = areaCalculation(side, s1, s2, s3);
		
		String display = "The area of the triangle, based on x-y coordinates you entered, is: " + area;
		
		JOptionPane.showMessageDialog(null, display);
	}
	
	private static double sideCalculation(double x, double y, double z) {
		double side = (x+y+z)/2;
		return side;
		
	}
	
	private static double areaCalculation(double a, double b, double c, double d) {
		double area = Math.pow(a*(a-b)*(a-c)*(a-d), 0.5);
		return area;
	}
}
