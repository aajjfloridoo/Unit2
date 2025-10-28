package englishPart2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {

        // Base price of the computer system
        final double BASE_PRICE = 375.99;
        // Price for 38cm screen
        final double SCREEN_38CM = 75.99;
        // Price for 43cm screen
        final double SCREEN_43CM = 99.99;
        // Price for antivirus software
        final double ANTIVIRUS = 65.99;
        // Price for printer
        final double PRINTER = 125.00;
        
        // Variable to store the total cost
        double totalCost = BASE_PRICE;
        // Variable to store screen choice
        int screenChoice;
        // Variable to store yes/no choices
        String choice;
        
        // Initialize Scanner to read user input
        Scanner keyboard = new Scanner(System.in);
        
        // Display screen options and get user choice
        System.out.println("Choose screen size:");
        System.out.println("1. 38 cm screen - $" + SCREEN_38CM);
        System.out.println("2. 43 cm screen - $" + SCREEN_43CM);
        System.out.print("Enter your choice (1 or 2): ");
        // Read and store screen choice
        screenChoice = keyboard.nextInt();
        
        // Add cost based on screen choice
        if (screenChoice == 1) {
            totalCost += SCREEN_38CM;
        } else if (screenChoice == 2) {
            totalCost += SCREEN_43CM;
        }
        
        // Ask about antivirus software
        System.out.print("Do you want antivirus software? ($" + ANTIVIRUS + ") (yes/no): ");
        // Read and store antivirus choice
        choice = keyboard.next();
        // Add cost if user wants antivirus
        if (choice.equalsIgnoreCase("yes")) {
            totalCost += ANTIVIRUS;
        }
        
        // Ask about printer
        System.out.print("Do you want a printer? ($" + PRINTER + ") (yes/no): ");
        // Read and store printer choice
        choice = keyboard.next();
        // Add cost if user wants printer
        if (choice.equalsIgnoreCase("yes")) {
            totalCost += PRINTER;
        }
        
        // Display the final cost
        System.out.println("Final cost of your order: $" + totalCost);
        
        // Close the Scanner to free resources
        keyboard.close();
		
	}
}
