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

		while (contadorWhile < 10) {
			System.out.println("Indique un número: ");
			numero = sc.nextInt();

			if (numero < 0) {
				sumaNegativos += numero;
				contadorNegativo++;
			} else if (numero > 0) {
				sumaPositivos += numero;
			} else {
				contadorCero++;
			}

			contadorWhile++;
		}

		System.out.println("La suma de los números positivos es " + sumaPositivos);

		if (contadorNegativo > 0) {
			media = (double) sumaNegativos / contadorNegativo;
			System.out.println("La media de los números negativos es " + media);
		} else {
			System.out.println("No se introdujeron números negativos.");
		}

		System.out.println("El número de ceros introducidos es " + contadorCero);

		sc.close();
	}
}
