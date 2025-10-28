package while_;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar la edad del alumno
		int edad = 0;
		// Declaracion de variable para contar el número total de alumnos
		int contador = 0;
		// Declaracion de variable para acumular la suma de todas las edades
		int suma = 0;
		// Declaracion de variable para almacenar la media de las edades
		double media;
		// Declaracion de variable para contar los alumnos mayores de edad
		int contadorMayores = 0;
		
		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos al usuario que introduzca la edad del alumno
		System.out.println("Indique la edad del alumno en cuestión: ");
		// Leemos y guardamos el valor de la edad
		edad = sc.nextInt();
		
		// Mientras la edad introducida sea mayor o igual a 0
		while (edad >= 0){
			// Incrementamos el contador total de alumnos
			contador++;
			// Sumamos la edad actual al acumulador de edades
			suma += edad;
			// Verificamos si el alumno es mayor de edad
			if (edad >= 18) {
				// Incrementamos el contador de mayores de edad
				contadorMayores++;
			}
			// Solicitamos al usuario que introduzca la edad del siguiente alumno
			System.out.println("Indique la edad del alumno en cuestión: ");
			// Leemos y guardamos el nuevo valor de la edad
			edad = sc.nextInt();
		}
		
        // Verificamos si se introdujeron edades válidas
        if (contador > 0) {
            // Calculamos la media de las edades
            media = (double) suma / contador;

            // Mostramos los resultados estadísticos
            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Suma de edades: " + suma);
            System.out.println("Media de edades: " + media);
            System.out.println("Número total de alumnos: " + contador);
            System.out.println("Número de alumnos mayores de edad: " + contadorMayores);
        } else {
            // Mostramos mensaje cuando no se introdujeron edades válidas
            System.out.println("No se introdujeron edades válidas.");
        }
		// Cerramos el Scanner para liberar recursos
		sc.close();
	}
}