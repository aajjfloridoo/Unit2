package do_while;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar el número introducido por el usuario
		int numeroPedido;
		int numero = 1;
		int suma = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número: ");
		numeroPedido = sc.nextInt();

		do {
			suma += numero;
			numero++;
		} while (numero <= numeroPedido);
		
		System.out.println("Suma: " + suma);


	}
}
