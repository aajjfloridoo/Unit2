package ejer_for;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int numero;
		long factorial = 1;
		
		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos al usuario que introduzca un número
		System.out.println("Indique un número: ");
		// Leemos y guardamos el valor del número
		numero = sc.nextInt();
		
		for (int i = numero; i > 0; i--) {
			System.out.print(i);
			if (i != 1) {
				System.out.print("x");
			}
			
			factorial *= i;
		}
		
		System.out.println(" = " + factorial);
		
		sc.close();

	}		
}
