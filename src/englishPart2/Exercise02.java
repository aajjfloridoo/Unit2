package englishPart2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {

        // Variables to store user input
        double amount;
        char accountType;
        // Variable to store interest rate
        double interestRate = 0.0;
        // Variable to store calculated interest
        double interestEarned;
        
        // Initialize Scanner to read user input
        Scanner keyboard = new Scanner(System.in);
        
        // Ask user to enter amount of money
        System.out.print("Enter the amount of money: ");
        // Read and store the amount
        amount = keyboard.nextDouble();
        
        // Ask user to enter account type
        System.out.print("Enter the type of bank account (A, B, C, or X): ");
        // Read and store the account type as character
        accountType = keyboard.next().charAt(0);
        
        // Convert to uppercase to handle both lower and upper case input
        accountType = Character.toUpperCase(accountType);
        
        // Switch statement to determine interest rate based on account type
        switch (accountType) {
            case 'A':
                // 1.5% interest for account A
                interestRate = 1.5;
                break;
            case 'B':
                // 2% interest for account B
                interestRate = 2.0;
                break;
            case 'C':
                // 1.5% interest for account C
                interestRate = 1.5;
                break;
            case 'X':
                // 5% interest for account X
                interestRate = 5.0;
                break;
            default:
                // Invalid account type
                System.out.println("Invalid account type entered!");
                // Close scanner and exit if invalid input
                keyboard.close();
                return;
        }
        
        // Calculate interest earned in one year
        interestEarned = (amount * interestRate) / 100;
        
        // Display the results
        System.out.println("Account type: " + accountType);
        System.out.println("Interest rate: " + interestRate + "%");
        System.out.println("Amount of money: $" + amount);
        System.out.println("Interest earned in one year: $" + interestEarned);
        
        // Close the Scanner to free resources
        keyboard.close();
		
		
	}
}
