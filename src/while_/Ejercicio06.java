package while_;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar la altura del árbol actual
		int altura;
		// Declaracion de variable para almacenar la altura máxima encontrada
		int alturaMax;
		
		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos al usuario que introduzca la altura del primer árbol
		System.out.println("Indique la altura del árbol: ");
		// Leemos y guardamos el valor de la altura
		altura = sc.nextInt();
	
		// Inicializamos la altura máxima con la primera altura introducida
		alturaMax = altura;
		
		// Mientras la altura introducida sea diferente de -1
		while (altura != -1) {
			// Verificamos si la altura actual es mayor que la altura máxima registrada
			if (altura > alturaMax) {
				// Actualizamos la altura máxima con el nuevo valor
				alturaMax = altura;
			}
			// Solicitamos al usuario que introduzca la altura del siguiente árbol
			System.out.println("Indique la altura del siguiente árbol: ");
			// Leemos y guardamos el nuevo valor de la altura
			altura = sc.nextInt();
		}
		
		// Mostramos la altura máxima encontrada entre todos los árboles
		System.out.println("Altura máxima: " + alturaMax);
		
		// Cerramos el Scanner para liberar recursos
		sc.close();
	
	}
}