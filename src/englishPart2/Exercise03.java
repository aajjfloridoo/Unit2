package englishPart2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

        // Variables to store hour and minute from mirror time
        int mirrorHour;
        int mirrorMinute;
        // Variables to store real hour and minute
        int realHour;
        int realMinute;
        
        // Initialize Scanner to read user input
        Scanner keyboard = new Scanner(System.in);
        
        // Ask user to enter mirror time
        System.out.print("Enter the mirror time (HH:MM): ");
        // Read the entire time string
        String time = keyboard.next();
        
        // Split the string at colon to get hour and minute
        String[] parts = time.split(":");
        // Convert hour part to integer
        mirrorHour = Integer.parseInt(parts[0]);
        // Convert minute part to integer
        mirrorMinute = Integer.parseInt(parts[1]);
        
        // Calculate real minute: 60 - mirror minute
        // If mirror minute is 0, real minute is 0
        if (mirrorMinute == 0) {
            realMinute = 0;
        } else {
            realMinute = 60 - mirrorMinute;
        }
        
        // Calculate real hour: 12 - mirror hour
        // Adjust for the minute calculation
        if (mirrorMinute == 0) {
            realHour = 12 - mirrorHour;
        } else {
            realHour = 12 - mirrorHour - 1;
        }
        
        // Handle special case when real hour becomes 0
        if (realHour == 0) {
            realHour = 12;
        }
        // Handle case when real hour becomes negative
        if (realHour < 0) {
            realHour += 12;
        }
        
        // Display the real time with proper formatting
        System.out.printf("Real time: %02d:%02d\n", realHour, realMinute);
        
        // Close the Scanner to free resources
        keyboard.close();
		
	}
}
