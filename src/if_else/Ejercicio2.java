package if_else;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar el número
		int numero;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que ingrese un número
		System.out.println("Indique un número: ");

		// Leemos y guardamos el número ingresado por el usuario
		numero = sc.nextInt();

		// Verificamos si el número está en el rango -1 a 1 (excluyendo -1, 0 y 1)
		if (numero > 1 && numero < -1 && numero != 0) {

			// Mostramos mensaje indicando que el número es "casi-cero"
			System.out.println("Su número es casi-cero");

		}

	}
}