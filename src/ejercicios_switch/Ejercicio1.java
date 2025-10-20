package ejercicios_switch;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar la nota
		int nota;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que ingrese una nota
		System.out.println("Indique una nota entera del 1 al 10: ");
		// Leemos y guardamos la nota ingresada por el usuario
		nota = sc.nextInt();

		// Evaluamos la nota ingresada usando switch con múltiples casos
		switch (nota) {

		case 1, 2, 3, 4: {
			// Mostramos calificación para notas entre 1 y 4
			System.out.println("Insuficiente");
			// Salimos del switch
			break;
		}

		case 5: {
			// Mostramos calificación para nota 5
			System.out.println("Suficiente");
			// Salimos del switch
			break;
		}

		case 6: {
			// Mostramos calificación para nota 6
			System.out.println("Bien");
			// Salimos del switch
			break;
		}

		case 7, 8: {
			// Mostramos calificación para notas 7 y 8
			System.out.println("Notable");
			// Salimos del switch
			break;
		}

		case 9, 10: {
			// Mostramos calificación para notas 9 y 10
			System.out.println("Sobresaliente");
			// Salimos del switch
			break;
		}

		default: {
			// Mostramos mensaje de error para notas fuera del rango 1-10
			System.out.println("El valor de la nota no es correcto");
			// Salimos del switch
			break;
		}

		}
		
	}
}
