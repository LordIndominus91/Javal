import java.util.*;
public class MinutesToYears {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("Input the number of minutes as an integer: ");
		int minutes = enter.nextInt();
		int conversion = 60*24*365;
		int years = (minutes/conversion);
		int days = (int)(minutes/60/24)%365;
		System.out.println(minutes + " minues is equal to " + years + " years and " + days + " days.");
		
	}
}
