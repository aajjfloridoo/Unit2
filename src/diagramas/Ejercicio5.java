package diagramas;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un numero entero: ");
		numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("El número es negativo");
		}
		
		else {
			System.out.println("El número es positivo");
		}
		
		sc.close();
	}
}
