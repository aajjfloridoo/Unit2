package while_;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		int numero;
		int contadorWhile = 0;
		int contadorNegativo = 0;
		int contadorCero = 0;
		int sumaPositivos = 0;
		int sumaNegativos = 0;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique un número: ");
		numero = sc.nextInt();
		
		while (contadorWhile < 10) {
			System.out.println("Indique un número: ");
			if (numero < 0) {
				sumaNegativos += numero;
				contadorNegativo++;
			}
			if (numero > 0) {
				sumaPositivos += numero;
			}
			else {
				contadorCero++;
			}
		}
		
		

		sc.close();
		
		
		
		
		
		
	}
}
