package while_;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar el número introducido por el usuario
		int numero;
		// Declaracion de variable para contar las iteraciones del bucle (hasta 10)
		int contadorWhile = 0;
		// Declaracion de variable para contar la cantidad de números negativos
		int contadorNegativo = 0;
		// Declaracion de variable para contar la cantidad de ceros
		int contadorCero = 0;
		// Declaracion de variable para acumular la suma de los números positivos
		int sumaPositivos = 0;
		// Declaracion de variable para acumular la suma de los números negativos
		int sumaNegativos = 0;
		// Declaracion de variable para almacenar la media de los números negativos
		double media;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Mientras no se hayan introducido 10 números
		while (contadorWhile < 10) {
			// Solicitamos al usuario que introduzca un número
			System.out.println("Indique un número: ");
			// Leemos y guardamos el valor del número
			numero = sc.nextInt();

			// Verificamos si el número es negativo
			if (numero < 0) {
				// Sumamos el número negativo al acumulador de negativos
				sumaNegativos += numero;
				// Incrementamos el contador de números negativos
				contadorNegativo++;
			} else if (numero > 0) {
				// Sumamos el número positivo al acumulador de positivos
				sumaPositivos += numero;
			} else {
				// Incrementamos el contador de ceros
				contadorCero++;
			}

			// Incrementamos el contador de iteraciones
			contadorWhile++;
		}

		// Mostramos la suma total de los números positivos
		System.out.println("La suma de los números positivos es " + sumaPositivos);

		// Verificamos si se introdujeron números negativos
		if (contadorNegativo > 0) {
			// Calculamos la media de los números negativos
			media = (double) sumaNegativos / contadorNegativo;
			// Mostramos la media de los números negativos
			System.out.println("La media de los números negativos es " + media);
		} else {
			// Mostramos mensaje cuando no hay números negativos
			System.out.println("No se introdujeron números negativos.");
		}

		// Mostramos la cantidad de ceros introducidos
		System.out.println("El número de ceros introducidos es " + contadorCero);

		// Cerramos el Scanner para liberar recursos
		sc.close();
	}
}