//This code takes a user input of an integer values, and returns the sum of each individual digit in the integer
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("Please input an integer of any length: ");
		int integer = enter.nextInt();
		System.out.println("THe sum of each individual digit in the enteger is " + sum(integer));
	}
	
	private static int sum(int n) {
		int add = 0;
		while (n >0) {
			add += n%10;
			n /=10;
		}
		return add;
	}
}
