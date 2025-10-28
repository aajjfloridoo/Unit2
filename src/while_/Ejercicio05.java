package while_;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		int edad = 0;
		int contador = 0;
		int suma = 0;
		double media;
		int contadorMayores = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique la edad del alumno en cuestión: ");
		edad = sc.nextInt();
		
		while (edad >= 0){
			contador++;
			suma += edad;
			if (edad >= 18) {
				contadorMayores++;
			}
			System.out.println("Indique la edad del alumno en cuestión: ");
			edad = sc.nextInt();
		}
		
        if (contador > 0) {
            media = (double) suma / contador;

            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Suma de edades: " + suma);
            System.out.println("Media de edades: " + media);
            System.out.println("Número total de alumnos: " + contador);
            System.out.println("Número de alumnos mayores de edad: " + contadorMayores);
        } else {
            System.out.println("No se introdujeron edades válidas.");
        }
		sc.close();
	}
}
