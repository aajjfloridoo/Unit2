package if_else;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaracion de variables para los coeficientes de la ecuación cuadrática
		int a;
		int b;
		int c;
		// Declaracion de variables para las soluciones de la ecuación
		double x1;
		double x2;
		// Declaracion de variable para el discriminante
		double discriminante;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario el coeficiente a
		System.out.println("Indique a: ");
		// Leemos y guardamos el valor de a
		a = sc.nextInt();

		// Solicitamos al usuario el coeficiente b
		System.out.println("Indique b: ");
		// Leemos y guardamos el valor de b
		b = sc.nextInt();

		// Solicitamos al usuario el coeficiente c
		System.out.println("Indique c: ");
		// Leemos y guardamos el valor de c
		c = sc.nextInt();

		// Calculamos el discriminante de la ecuación cuadrática
		discriminante = (b * b) - (4 * a * c);

		// Verificamos si el discriminante es positivo (dos soluciones reales)
		if (discriminante > 0) {

			// Calculamos la primera solución usando la fórmula cuadrática
			x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
			// Calculamos la segunda solución usando la fórmula cuadrática
			x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

			// Mostramos la primera solución
			System.out.println("Primera solución: " + x1);
			// Mostramos la segunda solución
			System.out.println("Segunda solución: " + x2);

		}

		// Verificamos si el discriminante es cero (solución doble)
		if (discriminante == 0) {

			// Calculamos la solución única (doble)
			x1 = -b / (2.0 * a);

			// Mostramos la solución doble
			System.out.println("El ejercicio posee una solución doble: " + x1);

		}

		// Verificamos si el discriminante es negativo (sin soluciones reales)
		if (discriminante < 0) {

			// Informamos que no hay soluciones reales
			System.out.println("El ejercicio no tiene soluciones reales");

		}

	}
}
