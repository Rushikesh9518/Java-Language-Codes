package Java;

import java.util.Scanner;

public class ClockAngleCalculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter hours (0-12): ");
		int hours = scanner.nextInt();
		
		System.out.print("Enter minutes (0-59): ");
		int minutes = scanner.nextInt();
		
		if(hours < 0 || hours > 12 ||minutes < 0 || minutes >= 60) {
			System.out.println("Invalid time.Please enter hours (0-12) and minus (0-59).");
			return;
		}
		
		double angle = calculateAngle (hours,minutes);
		
		System.out.println("The angle between the hour and minute hand is: " + angle + "degrees.");
		
		scanner.close();
	}

	public static double calculateAngle (int hours,int minutes) {
		if(hours == 12) {
			hours = 0;
		}
		
		double minuteAngle = 6 * minutes;
		double hourAngle = 30 * hours + 0.5 * minutes;
		
		double angle = Math.abs(hourAngle - minuteAngle);
		
		return Math.min(angle,360 - angle);
	}
}
