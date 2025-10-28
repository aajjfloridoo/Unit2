package while_;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar el número introducido por el usuario
		int numero;
		// Declaracion de variable para contar la cantidad de números positivos introducidos
		int contador = 0;
		
		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos al usuario que introduzca un número (negativo si desea terminar)
		System.out.println("Indique un número (negativo si desea terminar): ");
		// Leemos y guardamos el valor del número
		numero = sc.nextInt();
		
		// Mientras el número introducido sea mayor o igual a 0
		while (numero >= 0) {
			// Incrementamos el contador de números positivos
			contador += 1;
			// Solicitamos al usuario que introduzca otro número (negativo si desea terminar)
			System.out.println("Indique un número (negativo si desea terminar): ");
			// Leemos y guardamos el nuevo valor del número
			numero = sc.nextInt();
		}
		
		// Mostramos la cantidad total de números positivos introducidos
		System.out.println("Suma: " + contador);

		// Cerramos el Scanner para liberar recursos
		sc.close();
		
	}
}