package ejer_for;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numero;
	    int suma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			
			if (i % 2 != 0) {
				suma += i;
			}
		}
				
		System.out.println("Suma: " + suma);
		
		
		
		
	}
}
