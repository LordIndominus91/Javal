import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.*;
public class LinearEquation2X2 {
	public static void main(String[] args) {
		int a=0, b=0,c=0,d=0,e=0,f=0;
		a=Integer.parseInt(JOptionPane.showInputDialog("Enter a value"));
		b=Integer.parseInt(JOptionPane.showInputDialog("Enter a value"));
		c=Integer.parseInt(JOptionPane.showInputDialog("Enter a value"));
		d=Integer.parseInt(JOptionPane.showInputDialog("Enter a value"));
		e=Integer.parseInt(JOptionPane.showInputDialog("Enter a value"));
		f=Integer.parseInt(JOptionPane.showInputDialog("Enter a value"));
		int dividend = (a*d)-(b*c);
		int x;
		int y;
		if (dividend == 0) {
			String ans1 ="The dividend is 0. Cannot divide by 0. There is no solution.";
			System.out.println(ans1);
		}
		
		else {
			x=((e*d)-(b*f))/dividend;
			y=((a*f)-(e*c))/dividend;
			String ans2 =" The x coordinate is: " + x + ", and the y coordinate is: " + y;
			System.out.println(ans2);
		}
	}
}
