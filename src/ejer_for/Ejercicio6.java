package ejer_for;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		int nota;
		int suspensos = 0;
		
		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
			do {
				
				// Solicitamos al usuario que introduzca un número
				System.out.println("Indique la nota número " + (i + 1) + ": ");
				// Leemos y guardamos el valor del número
				nota = sc.nextInt();
				
			} while (nota < 0 || nota > 10);
			
			if (nota < 5) {
				suspensos++;
			}
		}
		
		System.out.println("Suspensos: " + suspensos);
		
		sc.close();		
			
	}
}
