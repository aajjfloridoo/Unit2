package englishPart2;

import java.util.Scanner;

public class Exercises05 {

	public static void main(String[] args) {

        // Variables to store velocity, displacement, and time
        double velocity = -1;
        double displacement = -1;
        double time = -1;
        
        // Variables to store user input
        String dataType1;
        double value1;
        String dataType2;
        double value2;
        
        // Initialize Scanner to read user input
        Scanner keyboard = new Scanner(System.in);
        
        // Get first data type and value
        System.out.print("Give me one type of data (V, D, or T): ");
        // Read and store first data type
        dataType1 = keyboard.next().toUpperCase();
        
        System.out.print("Give the value for that data: ");
        // Read and store first value
        value1 = keyboard.nextDouble();
        
        // Get second data type and value
        System.out.print("Give me another type of data (V, D, or T): ");
        // Read and store second data type
        dataType2 = keyboard.next().toUpperCase();
        
        System.out.print("Give the value for that data: ");
        // Read and store second value
        value2 = keyboard.nextDouble();
        
        // Assign values to corresponding variables based on data types
        if (dataType1.equals("V")) {
            velocity = value1;
        } else if (dataType1.equals("D")) {
            displacement = value1;
        } else if (dataType1.equals("T")) {
            time = value1;
        }
        
        if (dataType2.equals("V")) {
            velocity = value2;
        } else if (dataType2.equals("D")) {
            displacement = value2;
        } else if (dataType2.equals("T")) {
            time = value2;
        }
        
        // Calculate the missing value based on the formula: velocity = displacement / time
        if (velocity == -1) {
            // Calculate velocity if it's missing
            velocity = displacement / time;
            System.out.println("RESULT: V = " + velocity);
        } else if (displacement == -1) {
            // Calculate displacement if it's missing
            displacement = velocity * time;
            System.out.println("RESULT: D = " + displacement);
        } else if (time == -1) {
            // Calculate time if it's missing
            time = displacement / velocity;
            System.out.println("RESULT: T = " + time);
        }
        
        // Close the Scanner to free resources
        keyboard.close();
		
		
		
	}
}
