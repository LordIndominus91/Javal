import javax.swing.*;
public class HexagonGeometry {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Please enter the length of a side for a hexagon: ");
		double length = Double.parseDouble(input);
		double area = calculate(length);
		String calculation = "The area of the hexagon based on your input length is " + area;
		JOptionPane.showMessageDialog(null, calculation);
	}
	
	private static double calculate(double x) {
		double area = (3*Math.sqrt(3)/2)*Math.pow(x, 2);
		return area;
	}

}
