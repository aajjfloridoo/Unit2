package englishPart2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

        // Variables to store amount to pay and amount given
        int amountToPay;
        int amountGiven;
        // Variable to store change to return
        int change;
        
        // Initialize Scanner to read user input
        Scanner keyboard = new Scanner(System.in);
        
        // Ask user to enter amount to pay
        System.out.print("Enter amount to pay (in cents): ");
        // Read and store amount to pay
        amountToPay = keyboard.nextInt();
        
        // Ask user to enter amount given
        System.out.print("Enter amount given (in cents): ");
        // Read and store amount given
        amountGiven = keyboard.nextInt();
        
        // Calculate change to return
        change = amountGiven - amountToPay;
        
        // Coin values in cents
        final int TWO_EUROS = 200;
        final int ONE_EURO = 100;
        final int FIFTY_CENTS = 50;
        final int TWENTY_CENTS = 20;
        final int TEN_CENTS = 10;
        final int FIVE_CENTS = 5;
        final int TWO_CENTS = 2;
        final int ONE_CENT = 1;
        
        // Counters for each coin type
        int countTwoEuros = 0;
        int countOneEuro = 0;
        int countFiftyCents = 0;
        int countTwentyCents = 0;
        int countTenCents = 0;
        int countFiveCents = 0;
        int countTwoCents = 0;
        int countOneCent = 0;
        
        // Calculate number of 2 euro coins (200 cents)
        while (change >= TWO_EUROS) {
            countTwoEuros++;
            change -= TWO_EUROS;
        }
        
        // Calculate number of 1 euro coins (100 cents)
        while (change >= ONE_EURO) {
            countOneEuro++;
            change -= ONE_EURO;
        }
        
        // Calculate number of 50 cent coins
        while (change >= FIFTY_CENTS) {
            countFiftyCents++;
            change -= FIFTY_CENTS;
        }
        
        // Calculate number of 20 cent coins
        while (change >= TWENTY_CENTS) {
            countTwentyCents++;
            change -= TWENTY_CENTS;
        }
        
        // Calculate number of 10 cent coins
        while (change >= TEN_CENTS) {
            countTenCents++;
            change -= TEN_CENTS;
        }
        
        // Calculate number of 5 cent coins
        while (change >= FIVE_CENTS) {
            countFiveCents++;
            change -= FIVE_CENTS;
        }
        
        // Calculate number of 2 cent coins
        while (change >= TWO_CENTS) {
            countTwoCents++;
            change -= TWO_CENTS;
        }
        
        // Calculate number of 1 cent coins
        while (change >= ONE_CENT) {
            countOneCent++;
            change -= ONE_CENT;
        }
        
        // Display the result in required format
        System.out.println("Coins to return:");
        System.out.println(countTwoEuros + " " + countOneEuro + " " + 
                          countFiftyCents + " " + countTwentyCents + " " + 
                          countTenCents + " " + countFiveCents + " " + 
                          countTwoCents + " " + countOneCent);
        
        // Close the Scanner to free resources
        keyboard.close();
		
		
		
		
	}
}
