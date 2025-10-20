package if_else;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar la jugada del primer jugador
		String jugador1;
		// Declaracion de variable para almacenar la jugada del segundo jugador
		String jugador2;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitamos al jugador 1 que introduzca su jugada
		System.out.print("JUGADOR 1 // Introduzca PIEDRA, PAPEL O TIJERA: ");
		// Leemos y guardamos la jugada del primer jugador
		jugador1 = sc.next();

		// Solicitamos al jugador 2 que introduzca su jugada
		System.out.print("JUGADOR 2 // Introduzca PIEDRA, PAPEL O TIJERA: ");
		// Leemos y guardamos la jugada del segundo jugador
		jugador2 = sc.next();

		// Verificamos si ambos jugadores eligieron la misma jugada (empate)
		if (jugador1.equals(jugador2)) {
			// Mostramos mensaje de empate
			System.out.println("EMPATE // Ambos eligieron: " + jugador1);

		} else if (jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")) {
			// Jugador 1 gana con Piedra contra Tijera
			System.out.println("Jugador 1 GANA -- Piedra > Tijera");

		} else if (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA")) {
			// Jugador 1 gana con Papel contra Piedra
			System.out.println("Jugador 1 GANA -- Papel > Piedra");

		} else if (jugador1.equals("TIJERA") && jugador2.equals("PAPEL")) {
			// Jugador 1 gana con Tijera contra Papel
			System.out.println("Jugador 1 GANA -- Tijera > Papel");

		} else if (jugador2.equals("PIEDRA") && jugador1.equals("TIJERA")) {
			// Jugador 2 gana con Piedra contra Tijera
			System.out.println("Jugador 2 GANA -- Piedra > Tijera");

		} else if (jugador2.equals("PAPEL") && jugador1.equals("PIEDRA")) {
			// Jugador 2 gana con Papel contra Piedra
			System.out.println("Jugador 2 GANA -- Papel > Piedra");

		} else if (jugador2.equals("TIJERA") && jugador1.equals("PAPEL")) {
			// Jugador 2 gana con Tijera contra Papel
			System.out.println("Jugador 2 GANA -- Tijera > Papel");

		}

		// Cerramos el Scanner para liberar recursos
		sc.close();
	}

}
