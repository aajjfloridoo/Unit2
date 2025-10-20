package ejercicios_switch;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		int nota;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que ingrese una nota
		System.out.println("Indique una nota entera del 1 al 10: ");
		nota = sc.nextInt();

		switch (nota) {

		case 1, 2, 3, 4: {
			System.out.println("Insuficiente");
			break;
		}

		case 5: {
			System.out.println("Suficiente");
			break;
		}

		case 6: {
			System.out.println("Bien");
			break;
		}

		case 7, 8: {
			System.out.println("Notable");
			break;
		}

		case 9, 10: {
			System.out.println("Suficiente");
			break;
		}

		default: {
			System.out.println("El valor de la nota no es correcto");
			break;
		}

		}
		
	}
}
