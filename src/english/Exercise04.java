package english;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {

        // Variable to store the user input number
        int x;
        
        // Initialize Scanner to read user input
        Scanner keyboard = new Scanner(System.in);
        
        // Ask user to enter a number
        System.out.print("Enter a number: ");
        // Read and store the number value
        x = keyboard.nextInt();
        
        // Switch statement to handle different cases
        switch (x)
        {
         case 1: case 2: 
             // Print Green for values 1 or 2
             System.out.println("Green"); 
             break;
        case 3: case 4: case 5: 
             // Print Blue for values 3, 4 or 5
             System.out.println("Blue"); 
             break;
        default: 
             // Print message for numbers outside 1-5 range
             System.out.println("numbers 1-5 only");
        }
        // Print Red regardless of the switch result
        System.out.println("Red");
        
        // Close the Scanner to free resources
        keyboard.close();
        
        /* ANSWERS:
         * 1. If user entered 1: Output = "Green", "Red"
         * 2. If user entered 2: Output = "Green", "Red"
         * 3. If user entered 3: Output = "Blue", "Red"
         * 4. If user entered 10: Output = "numbers 1-5 only", "Red"
         * 5. If break statements removed and user entered 3: 
         *    Output = "Blue", "numbers 1-5 only", "Red"
         * 6. If default removed and user entered 10: Output = "Red"
         */
						
	}
}
