package diagramas;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		int numero1;
		int numero2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el primer numero: ");
		numero1 = sc.nextInt();

		System.out.println("Introduzca el segundo numero: ");
		numero2 = sc.nextInt();

		if (numero1 > numero2) {
			System.out.println(numero1 + " es mayor que " + numero2);
		}

		else {
			if (numero2 > numero1) {
				System.out.println(numero2 + " es mayor que " + numero1);
			} else {
				System.out.println(numero1 + " y " + numero2 + " son iguales");
			}
		}
		sc.close();

	}
}
