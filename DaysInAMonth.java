import java.util.*;
public class DaysInAMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a month: ");
		String month=input.nextLine();
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		//CALCULATION TO DETERMINE IF THE ENTERED YEAR IS A LEAP YEAR
		boolean leap=((year % 400==0) || (year%4==0 && year %100 !=0));
		
		switch (month) {
		case "February":
			if(!leap) {
				System.out.println(month + ", " + year + " has 28 days");break;
			}
			else
				System.out.println(month + ", " + year + " has 29 days");break;
		
		case "January":
		case "March":
		case "May":
		case "July":
		case "August":
		case "October":
		case "December":
			System.out.println(month + ", " + year + " has 31 days");break;
			
		case "April":
		case "June":
		case "September":
		case "November":
			System.out.println(month + ", " + year + " has 30 days");break;
		}
	}
}
