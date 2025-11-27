package ejercicios_bucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		int numero;
		
		Scanner sc = new Scanner (System.in);
		
        System.out.println("Dime un número para hacer la pirámide: ");
        numero = sc.nextInt();
        
        for (int i = 1; i <= numero; i++) {
        	
        	for (int j = 0; j < numero - i; j++) {
                System.out.print(" ");
        	}
        	
        	for (int k = 0; k < i; k++) {
                System.out.print("* ");
        	}
            System.out.println();
        }
        
        sc.close();
		
	}
}
