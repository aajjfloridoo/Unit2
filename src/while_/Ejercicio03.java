package while_;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar el número introducido por el usuario
		int numero;
		// Declaracion de variable para contar la cantidad de números positivos introducidos
		int contador = 0;
		// Declaracion de variable para acumular la suma de los números positivos
		int suma = 0;
		// Declaracion de variable para almacenar la media de los números
		double media;
		
		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);
		
		// Solicitamos al usuario que introduzca un número (negativo si desea terminar)
		System.out.println("Indique un número (negativo si desea terminar): ");
		// Leemos y guardamos el valor del número
		numero = sc.nextInt();
		
		// Mientras el número introducido sea mayor o igual a 0
		while (numero >= 0) {
			// Incrementamos el contador de números positivos
			contador += 1;
			// Sumamos el número actual al acumulador de suma
			suma += numero;
			// Solicitamos al usuario que introduzca otro número (negativo si desea terminar)
			System.out.println("Indique un número (negativo si desea terminar): ");
			// Leemos y guardamos el nuevo valor del número
			numero = sc.nextInt();
		}
		
		// Calculamos la media dividiendo la suma entre el contador (con conversión a double)
		media = (double) suma / contador;
		
		// Mostramos la cantidad total de números positivos introducidos
		System.out.println("Contador: " + contador);
		// Mostramos la media de los números positivos introducidos
		System.out.println("Media: " + media);

		// Cerramos el Scanner para liberar recursos
		sc.close();	
		
	}
}