package ejercicios_switch;

import java.util.Scanner;

public class Ejecicio2 {

	public static void main(String[] args) {

		int numero;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que ingrese una nota
		System.out.println("Indique un número del 1 al 7: ");
		numero = sc.nextInt();

		switch (numero) {

		case 1: 
			System.out.println("Lunes");
			break;
		

		case 2: 
			System.out.println("Martes");
			break;
		
		case 3: 
			System.out.println("Miercoles");
			break;
		
		case 4: 
			System.out.println("Jueves");
			break;
		
		case 5: 
			System.out.println("Viernes");
			break;
		
		case 6: 
			System.out.println("Sabado");
			break;
		
		case 7: 
			System.out.println("Domingo");
			break;
		

		default: 
			System.out.println("El valor del número no es correcto");
			break;
		

		}

	}
}
