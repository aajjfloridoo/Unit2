package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar el número
		int numero;
		// Declaracion de variable para el resto de la división
		int operacionLetra;
		// Declaracion de variable para almacenar la letra del DNI
		char letra = ' '; 

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que introduzca un número
		System.out.println("Introduzca su DNI para calcular la letra: ");
		// Leemos y guardamos el número
		numero = sc.nextInt();

		// Verificamos que el número tenga 8 dígitos
		if (numero < 0 || numero > 99999999) {
			// Mostramos mensaje de error si el número no es válido
			System.out.println("Error: El número de DNI debe tener 8 dígitos");
		} else {
			// Calculamos el resto de dividir entre 23
			operacionLetra = numero % 23;

			// Asignamos la letra correspondiente según la tabla del DNI
			switch (operacionLetra) {
			case 0: letra = 'T'; break;
			case 1: letra = 'R'; break;
			case 2: letra = 'W'; break;
			case 3: letra = 'A'; break;
			case 4: letra = 'G'; break;
			case 5: letra = 'M'; break;
			case 6: letra = 'Y'; break;
			case 7: letra = 'F'; break;
			case 8: letra = 'P'; break;
			case 9: letra = 'D'; break;
			case 10: letra = 'X'; break;
			case 11: letra = 'B'; break;
			case 12: letra = 'N'; break;
			case 13: letra = 'J'; break;
			case 14: letra = 'Z'; break;
			case 15: letra = 'S'; break;
			case 16: letra = 'Q'; break;
			case 17: letra = 'V'; break;
			case 18: letra = 'H'; break;
			case 19: letra = 'L'; break;
			case 20: letra = 'C'; break;
			case 21: letra = 'K'; break;
			case 22: letra = 'E'; break;
			}

			// Mostramos el resultado
			System.out.println("El DNI completo es: " + numero + letra);
		}

		// Cerramos el Scanner para liberar recursos
		sc.close();
	}
}