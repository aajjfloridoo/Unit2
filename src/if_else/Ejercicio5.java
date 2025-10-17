package if_else;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		String jugador1;
		String jugador2;

		Scanner sc = new Scanner(System.in);

		System.out.print("JUGADOR 1 // Introduzca PIEDRA, PAPEL O TIJERA: ");
		jugador1 = sc.next();

		System.out.print("JUGADOR 2 // Introduzca PIEDRA, PAPEL O TIJERA: ");
		jugador2 = sc.next();

		if (jugador1.equals(jugador2)) {
			System.out.println("EMPATE // Ambos eligieron: " + jugador1);

		} else if (jugador1.equals("PIEDRA") && jugador2.equals("TIJERA")) {
			System.out.println("Jugador 1 GANA -- Piedra > Tijera");

		} else if (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA")) {
			System.out.println("Jugador 1 GANA -- Papel > Piedra");

		} else if (jugador1.equals("TIJERA") && jugador2.equals("PAPEL")) {
			System.out.println("Jugador 1 GANA -- Tijera > Papel");

		} else if (jugador2.equals("PIEDRA") && jugador1.equals("TIJERA")) {
			System.out.println("Jugador 2 GANA -- Piedra > Tijera");

		} else if (jugador2.equals("PAPEL") && jugador1.equals("PIEDRA")) {
			System.out.println("Jugador 2 GANA -- Papel > Piedra");

		} else if (jugador2.equals("TIJERA") && jugador1.equals("PAPEL")) {
			System.out.println("Jugador 2 GANA -- Tijera > Papel");

		}

		sc.close();
	}

}
