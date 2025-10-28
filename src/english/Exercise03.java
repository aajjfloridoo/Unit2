package english;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {

        // Variable to store the user input number
        int x;
        
        // Initialize Scanner to read user input
        Scanner keyboard = new Scanner(System.in);
        
        // Ask user to enter a number
        System.out.print("Enter a number: ");
        // Read and store the number value
        x = keyboard.nextInt();
        
        // Check if the number is greater than 10
        if (x > 10)
        {
            // Print Green if condition is true
            System.out.println("Green");
        }
        else
        {
            // Print Blue if condition is false
            System.out.println("Blue");
        }
        // Print Red regardless of the condition (outside if-else block)
        System.out.println("Red");
        
        // Close the Scanner to free resources
        keyboard.close();
        
        /* ANSWERS:
         * (a) If user entered 10: Output = "Blue", "Red"
         * (b) If user entered 20: Output = "Green", "Red"
         */
		
	}
}
