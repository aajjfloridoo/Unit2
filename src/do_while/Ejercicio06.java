package do_while;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar la opción del jugador 1
		String jugador1;
		// Declaracion de variable para almacenar la opción del jugador 2
		String jugador2;
		// Declaracion de variable para controlar si se continúa jugando
		String continuar;

		// Inicializamos el Scanner para leer entrada del usuarios
		Scanner sc = new Scanner(System.in);

		// Bucle do-while principal para controlar partidas múltiples
		do {
			// Bucle do-while para validar la opción del jugador 1
			do {
				// Solicitamos al jugador 1 que introduzca su opción
				System.out.println("Jugador 1 - Introduce PIEDRA, PAPEL o TIJERA:");
				// Leemos y convertimos a mayúsculas la opción del jugador 1
				jugador1 = sc.nextLine().toUpperCase();

				// Verificamos si la opción no es válida
				if (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERA")) {
					// Mostramos mensaje de error para opción no válida
					System.out.println("Opción no válida. Por favor, introduce PIEDRA, PAPEL o TIJERA.");
				}

			} while (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERA"));

			// Bucle do-while para validar la opción del jugador 2
			do {
				// Solicitamos al jugador 2 que introduzca su opción
				System.out.println("Jugador 2 - Introduce PIEDRA, PAPEL o TIJERA:");
				// Leemos y convertimos a mayúsculas la opción del jugador 2
				jugador2 = sc.nextLine().toUpperCase();

				// Verificamos si la opción no es válida
				if (!jugador2.equals("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERA")) {
					// Mostramos mensaje de error para opción no válida
					System.out.println("Opción no válida. Por favor, introduce PIEDRA, PAPEL o TIJERA.");
				}

			} while (!jugador2.equals("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERA"));

			// Mostramos las opciones elegidas por ambos jugadores
			System.out.println("Jugador 1 eligió: " + jugador1);
			System.out.println("Jugador 2 eligió: " + jugador2);

			// Verificamos si hay empate
			if (jugador1.equals(jugador2)) {
				// Mostramos mensaje de empate
				System.out.println("¡Empate! Ambos eligieron " + jugador1);
			} 
			// Verificamos si gana el jugador 1 con PIEDRA contra TIJERA
			else if (jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")) {
				// Mostramos mensaje de victoria para jugador 1
				System.out.println("¡Jugador 1 gana! PIEDRA gana a TIJERA");
			} 
			// Verificamos si gana el jugador 1 con PAPEL contra PIEDRA
			else if (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA")) {
				// Mostramos mensaje de victoria para jugador 1
				System.out.println("¡Jugador 1 gana! PAPEL gana a PIEDRA");
			} 
			// Verificamos si gana el jugador 1 con TIJERA contra PAPEL
			else if (jugador1.equals("TIJERA") && jugador2.equals("PAPEL")) {
				// Mostramos mensaje de victoria para jugador 1
				System.out.println("¡Jugador 1 gana! TIJERA gana a PAPEL");
			} 
			// En cualquier otro caso, gana el jugador 2
			else {
				// Mostramos mensaje de victoria para jugador 2
				System.out.println("¡Jugador 2 gana! " + jugador2 + " gana a " + jugador1);
			}

			// Solicitamos al usuario si desea continuar jugando
			System.out.println("¿Quieres seguir jugando? (S para sí, cualquier otra tecla para no):");
			// Leemos y convertimos a mayúsculas la respuesta
			continuar = sc.nextLine().toUpperCase();

		} while (continuar.equals("S")); // Continuamos mientras se pulse "S"

		// Mostramos mensaje de despedida
		System.out.println("¡Gracias por jugar!");

		// Cerramos el Scanner para liberar recursos
		sc.close();
				
	}
}