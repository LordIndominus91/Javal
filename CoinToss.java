import java.util.*;
public class CoinToss {
	public static void main(String[] args) {
		System.out.println("Flip! Flip! Flip! The coin has been tossed! What will it land on? Enter 'H' for heads, or 'T' for tails!");
		int coin = new Random().nextInt(2);
		Scanner input = new Scanner(System.in);
		String choice = input.nextLine();
		System.out.println("The coin has landed!");
	if (coin == 0 || choice == "H") {
			System.out.println("The coin landed on heads, and you guessed heads. You win!");
	}
	else if (coin == 0 || choice == "T") {
		System.out.println("The coin landed on heads, and you guessed tails. You lost.");
	}
	else if (coin == 1 || choice == "H") {
		System.out.println("The coin landed on tails, and you guessed heads. You lost.");
	}
	else if (coin == 1 || choice == "T") {
		System.out.println("The coin landed on tails, and you guessed tails. You win!");
	}
	}
}
