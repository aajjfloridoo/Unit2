package if_else;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		// Declaracion de variable para el primer número
		int a;
		// Declaracion de variable para el segundo número
		int b;
		// Declaracion de variable para el tercer número
		int c;
		// Declaracion de variable para almacenar la suma de a y b
		int suma;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que introduzca el primer número
		System.out.println("Indique a: ");
		// Leemos y guardamos el valor de a
		a = sc.nextInt();

		// Solicitamos al usuario que introduzca el segundo número
		System.out.println("Indique b: ");
		// Leemos y guardamos el valor de b
		b = sc.nextInt();

		// Solicitamos al usuario que introduzca el tercer número
		System.out.println("Indique c: ");
		// Leemos y guardamos el valor de c
		c = sc.nextInt();

		// Calculamos la suma de los números a y b
		suma = a + b;

		// Verificamos si la suma de a y b es igual a c
		if (suma == c) {
			// Mostramos mensaje cuando la suma es igual a c
			System.out.println("La suma es igual a " + c);
		} else {
			// Mostramos mensaje cuando la suma es diferente de c
			System.out.println("La suma es distinta de " + c);
		}
	}

}