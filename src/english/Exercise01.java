package english;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

        // Variable to store the base ticket price
        double price = 10.00;
        // Variable to store the user's age
        int age;
        
        // Initialize Scanner to read user input
        Scanner keyboard = new Scanner(System.in);
        
        // Ask user to enter their age
        System.out.print("Enter your age: ");
        // Read and store the age value
        age = keyboard.nextInt();
        
        // Code to reduce ticket price for children
        // Check if the user is under 14 years old
        if (age < 14) {
            // Apply 50% discount for children
            price = price * 0.5;
        }
        
        // Display the final ticket price
        System.out.println("Ticket price = " + price);
        
        // Close the Scanner to free resources
        keyboard.close();
	}
}
