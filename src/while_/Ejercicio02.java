package while_;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		int numero;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique un número (negativo sidesea terminar): ");
		numero = sc.nextInt();
		
		while (numero >= 0) {
			contador += 1;
			System.out.println("Indique un número (negativo sidesea terminar): ");
			numero = sc.nextInt();
		}
		
		System.out.println("Suma: " + contador);

		sc.close();
		
	}
}
