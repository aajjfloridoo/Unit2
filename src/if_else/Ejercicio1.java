package if_else;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar el número
		int numero;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que ingrese un número
		System.out.println("Indique un número: ");

		// Leemos y guardamos el número ingresado por el usuario
		numero = sc.nextInt();

		// Verificamos si el número es par (divisible entre 2 sin residuo)
		if (numero % 2 == 0) {

			// Mostramos mensaje indicando que el número es par
			System.out.println(numero + " es par");

		} else {
			// Mostramos mensaje indicando que el número es impar
			System.out.println(numero + " es impar");
		}

	}
}