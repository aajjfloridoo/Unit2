package diagramas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int edad;

		Scanner sc = new Scanner(System.in);

			System.out.println("Introduzca la edad: ");
		edad = sc.nextInt();

		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		}
		
		else {
			System.out.println("Eres menor de edad");
		}
		
		sc.close();
	}

}
