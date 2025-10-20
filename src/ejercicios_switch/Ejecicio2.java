package ejercicios_switch;

import java.util.Scanner;

public class Ejecicio2 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar el número del día
		int numero;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que ingrese un número del 1 al 7
		System.out.println("Indique un número del 1 al 7: ");
		// Leemos y guardamos el número ingresado por el usuario
		numero = sc.nextInt();

		// Evaluamos el número ingresado usando switch
		switch (numero) {

		case 1: 
			// Mostramos el día correspondiente al número 1
			System.out.println("Lunes");
			// Salimos del switch
			break;
		

		case 2: 
			// Mostramos el día correspondiente al número 2
			System.out.println("Martes");
			// Salimos del switch
			break;
		
		case 3: 
			// Mostramos el día correspondiente al número 3
			System.out.println("Miercoles");
			// Salimos del switch
			break;
		
		case 4: 
			// Mostramos el día correspondiente al número 4
			System.out.println("Jueves");
			// Salimos del switch
			break;
		
		case 5: 
			// Mostramos el día correspondiente al número 5
			System.out.println("Viernes");
			// Salimos del switch
			break;
		
		case 6: 
			// Mostramos el día correspondiente al número 6
			System.out.println("Sabado");
			// Salimos del switch
			break;
		
		case 7: 
			// Mostramos el día correspondiente al número 7
			System.out.println("Domingo");
			// Salimos del switch
			break;
		

		default: 
			// Mostramos mensaje de error para números fuera del rango 1-7
			System.out.println("El valor del número no es correcto");
			// Salimos del switch
			break;
		

		}

	}
}
