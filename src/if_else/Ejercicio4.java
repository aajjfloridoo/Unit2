package if_else;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Declaracion de variable para almacenar el número
		int numero;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que introduzca un número en el rango válido
		System.out.print("Introduce un número entre 0 y 99999: ");
		// Leemos y guardamos el número ingresado por el usuario
		numero = sc.nextInt();

		// Verificamos si el número está fuera del rango permitido
		if (numero < 0 || numero > 99999) {
			// Mostramos mensaje de error si el número no está en el rango
			System.out.println("El número debe estar entre 0 y 99999");
		} else if (numero < 10) {
			// Si el número tiene 1 cifra (0-9)
			System.out.println("El número " + numero + " tiene 1 cifra");
		} else if (numero < 100) {
			// Si el número tiene 2 cifras (10-99)
			System.out.println("El número " + numero + " tiene 2 cifras");
		} else if (numero < 1000) {
			// Si el número tiene 3 cifras (100-999)
			System.out.println("El número " + numero + " tiene 3 cifras");
		} else if (numero < 10000) {
			// Si el número tiene 4 cifras (1000-9999)
			System.out.println("El número " + numero + " tiene 4 cifras");
		} else {
			// Si el número tiene 5 cifras (10000-99999)
			System.out.println("El número " + numero + " tiene 5 cifras");
		}

		// Cerramos el Scanner para liberar recursos
		sc.close();
	}
}