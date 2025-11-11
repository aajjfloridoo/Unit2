package ejer_for;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		int numero;
		
		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos al usuario que introduzca un número
		System.out.println("Indique un número: ");
		// Leemos y guardamos el valor del número
		numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (i % 3 == 0) {
				System.out.println(i + " ");
			}
		}
		
	}
}
