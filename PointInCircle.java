import javax.swing.*;
public class PointInCircle {
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Please enter an x coordinate."));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Please enter an y coordinate."));
		//test if the input is within the circle
		int point = (int) Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		if (point <10 && point >0) {
			JOptionPane.showMessageDialog(null, "Your coordinates lie inside a circle with a radius of 10.");
		}
		else
			JOptionPane.showMessageDialog(null, "Your coordinates lie outside a circle with a radius of 10.");
	}
}
