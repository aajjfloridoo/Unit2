package do_while;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Declaracion de variable para el límite inferior del rango de búsqueda
		int min = 1;
		// Declaracion de variable para el límite superior del rango de búsqueda
		int max = 100;
		// Declaracion de variable para almacenar el número propuesto por el ordenador
		int numeroPropuesto;
		// Declaracion de variable para almacenar la respuesta del usuario
		String respuesta;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);
		// Inicializamos el Random para generar números aleatorios
		Random random = new Random();

		// Mostramos mensaje inicial al usuario
		System.out.println("Piensa un número del 1 al 100 y yo intentaré adivinarlo.");
		System.out.println("Responde con: 'mayor', 'menor' o 'igual'");

		// Bucle do-while que se ejecuta hasta que el ordenador adivine el número
		do {
			// Generamos un número aleatorio dentro del rango actual
			numeroPropuesto = random.nextInt(max - min + 1) + min;
			// Mostramos el número propuesto por el ordenador
			System.out.println("¿Es " + numeroPropuesto + " tu número?");
			// Solicitamos y leemos la respuesta del usuario
			respuesta = sc.nextLine().toLowerCase();

			// Verificamos si el número pensado es mayor al propuesto
			if (respuesta.equals("mayor")) {
				// Ajustamos el límite inferior para excluir números menores o iguales
				min = numeroPropuesto + 1;
			} 
			// Verificamos si el número pensado es menor al propuesto
			else if (respuesta.equals("menor")) {
				// Ajustamos el límite superior para excluir números mayores o iguales
				max = numeroPropuesto - 1;
			} 
			// Verificamos si el número propuesto es correcto
			else if (respuesta.equals("igual")) {
				// Mostramos mensaje de éxito
				System.out.println("¡He adivinado tu número! Era el " + numeroPropuesto);
			} 
			// Manejo de respuestas no válidas
			else {
				// Informamos al usuario que la respuesta no es válida
				System.out.println("Respuesta no válida. Por favor, responde con: 'mayor', 'menor' o 'igual'");
			}

		} while (!respuesta.equals("igual")); // Continuamos mientras no se adivine el número

		// Cerramos el Scanner para liberar recursos
		sc.close();
	}
}