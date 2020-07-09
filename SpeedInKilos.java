/*This is a simple, interactive code. Go out and take a walk. Use a measuring tool and a stop watch to measure how many miles you walked and the 
 * time it took to complete te walk. By inputting the data into this code, you can find how many kilometers per hour you averaged on your walk,
 */
import java.util.*;
public class SpeedInKilos {
	public static void main(String[] strings) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter hours: ");
		String enter = input.nextLine();
		int hours = Integer.parseInt(enter);
		System.out.println("Enter minutes: ");
		enter = input.nextLine();
		int minutes = Integer.parseInt(enter);
		System.out.println("Enter seconds: ");
		enter = input.nextLine();
		int seconds = Integer.parseInt(enter);
		System.out.println("Enter miles traveled: ");
		enter = input.nextLine();
		int miles = Integer.parseInt(enter);
       
		//This method is used to help convert mileage into kilometers
        double distance = miles * 1.60934;

        //This formula will convert the total time traveled into minutes
        double time = (hours * 60.0) + minutes + (seconds / 60.0);

        //This formula will calculate the average kilometers per hour you traveled on your walk
        double kilometers = 60.0 * (distance / time);

        System.out.println("The average speed you traveled on your walk is " + kilometers + " per hour");

    }
}

