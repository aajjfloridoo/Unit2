package ejer_for;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int A;
		int B;
		int menor;
		int mayor;
		
		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		do {
			
			// Solicitamos al usuario que introduzca un número
			System.out.println("Indique el numero A: ");
			// Leemos y guardamos el valor del número
			A = sc.nextInt();
			
			// Solicitamos al usuario que introduzca un número
			System.out.println("Indique el numero B: ");
			// Leemos y guardamos el valor del número
			B = sc.nextInt();
			
		} while (A == B);
		
		System.out.println("");
		System.out.println("--LISTA--");
		System.out.println("");

		menor = A;
		mayor = B;
		
		if (B < A) {
			menor = B;
			mayor = A; 
		} 
	
		for (int i = menor; i <= mayor; i++) {
			System.out.print(i + " ");
		}
		
		
		sc.close();			
		
		
	}
}
