import javax.swing.*;
public class TrianglePerimeter {
	public static void main(String[] args) {
		String in1 = JOptionPane.showInputDialog("Please enter the length for side 1 of a triangle: ");
		int s1 = Integer.parseInt(in1);
		String in2 = JOptionPane.showInputDialog("Please enter the length for side 2 of a triangle: ");
		int s2 = Integer.parseInt(in2);
		String in3 = JOptionPane.showInputDialog("Please enter the length for side 3 of a triangle: ");
		int s3 = Integer.parseInt(in3);
		if (s1+s2>s3 && s2+s3>s1 && s3+s1>s2 && s3!=0 && s2!=0 && s1!=0) {
			JOptionPane.showMessageDialog(null, "The perimeter of the triangle is: " + (s1+s2+s3));
		}
		else
			JOptionPane.showMessageDialog(null, "One of the lengths you entered does not meet the requirements for calculating a triangle's perimeter");
		
	}
}
