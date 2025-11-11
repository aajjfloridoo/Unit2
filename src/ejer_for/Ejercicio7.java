package ejer_for;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int numero;
		boolean esprimo = true;
		
		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		do {
			
			// Solicitamos al usuario que introduzca un número
			System.out.println("Indique un número positivo: ");
			// Leemos y guardamos el valor del número
			numero = sc.nextInt();
			
		} while (numero < 0);
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				esprimo = false;
			}
		}
		
		System.out.println("¿Es primo?: " + esprimo);
		
		sc.close();		
		
		
		
		
	}
}
