import java.util.*;
public class PhysicsAcceleration {
	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		System.out.println("Enter the initial velocity: ");
		double v0 = enter.nextDouble();
		System.out.println("Enter the final velocity: ");
		double v1 = enter.nextDouble();
		System.out.println("Enter the total time: ");
		double time = enter.nextDouble();
		double acceleration = (v1-v0)/time;
		System.out.println("THe average acceleration is " + acceleration + " meters/second.");5
	}
}
