/*A fun java game that the user can interact with, allowing them to play an addition, subraction, multiplication or division game
 * 
 */
import java.util.*;
public class MathematicsGame {
	public static void main(String[] args) {
		boolean keepGoing=true;
		System.out.println("Welcome to a Mathematics Game!");
		do {
			int max =10000;
			int min = 1;
			int range = max-min+1;
			int x = (int)(Math.random()*range)+min;
			int y = (int)(Math.random()*range)+min;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter 1 to play an addition game. \nEnter 2 to play a subtraction game."
					+ "\nEnter 3 to play a multiplication game.\nEnter 4 to play a division game");
			int choice = input.nextInt();
			//This challenges the user to an addition game
			if (choice == 1) {
				System.out.println("What is the sum of " + x + " and " + y + "?");
				int answer = input.nextInt();
				if (x+y==answer) {
					System.out.println("Congratulations! That is correct!");
				}
				else {
					System.out.println("The answer you gave is incorrect");
				}
				System.out.println("Woud you like to play again? Enter 1 to play, 2 to quit");
				int repsonse = input.nextInt();
				if (repsonse == 1) {
					keepGoing=true;
				}
				else
					keepGoing=false;
			}
			//This challenges the user to a subtraction game
			if (choice == 2) {
				System.out.println("What is the difference of " + x + " and " + y + "?");
				int answer = input.nextInt();
				if (x-y==answer) {
					System.out.println("Congratulations! That is correct!");
				}
				else {
					System.out.println("The answer you gave is incorrect");
				}
				System.out.println("Woud you like to play again? Enter 1 to play, 2 to quit");
				int repsonse = input.nextInt();
				if (repsonse == 1) {
					keepGoing=true;
				}
				else
					keepGoing=false;
			}
			//This challenges the user to a multiplication game
			if (choice == 3) {
				System.out.println("What is the product of " + x + " and " + y + "?");
				int answer = input.nextInt();
				if (x*y==answer) {
					System.out.println("Congratulations! That is correct!");
				}
				else {
					System.out.println("The answer you gave is incorrect");
				}
				System.out.println("Woud you like to play again? Enter 1 to play, 2 to quit");
				int repsonse = input.nextInt();
				if (repsonse == 1) {
					keepGoing=true;
				}
				else
					keepGoing=false;
			}
			//This challenges the user to a division game
			if (choice == 4) {
				System.out.println("What is the division of " + x + " and " + y + "?");
				int answer = input.nextInt();
				if (x/y==answer) {
					System.out.println("Congratulations! That is correct!");
				}
				else {
					System.out.println("The answer you gave is incorrect");
				}
				System.out.println("Woud you like to play again? Enter 1 to play, 2 to quit");
				int repsonse = input.nextInt();
				if (repsonse == 1) {
					keepGoing=true;
				}
				else
					keepGoing=false;
			}
			if (choice >4) {
				System.out.println("Please enter a valid number.");
				keepGoing=true;
			}
			}while (keepGoing==true);
		System.out.println("Thank you for playiing. Goodbye!");
	}
	
}
