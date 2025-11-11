package ejer_for;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numero;
	    int suma = 0;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Indique un número: ");
			numero = sc.nextInt();
			
			suma += numero;

		}
		
		media = (double) suma / 10;
		
		System.out.println("Media: " + media);
		
	}
}
