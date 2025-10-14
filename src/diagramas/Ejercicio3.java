package diagramas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Declaración de la variable del numero 1
		int numero1;
		// Declaración de la variable del numero 2
		int numero2; 
		// Declaración de la variable de la suma
		double suma;
		// Declaración de la variable de la resta
		double resta; 
		// Declaración de la variable de la multiplicacion
		double multiplicacion; 
		// Declaración de la variable de la division
		double division;
		
		Scanner sc = new Scanner(System.in);

			System.out.println("Introduzca el primer numero: ");
		    numero1 = sc.nextInt();
		    
			System.out.println("Introduzca el segundo numero: ");
		    numero2 = sc.nextInt();
		
		suma = numero1 + numero2;
		// Calculamos resta
		resta = numero1 - numero2;
		// Calculamos multiplicacion
		multiplicacion = numero1 * 1.0 * numero2;
		// Calculamos division
		division = numero1 * 1.0 / numero2;
		
		// Enseñamos el resultado de la suma por pantalla
		System.out.println("La suma de ambos numeros es: " + suma);
		// Enseñamos el resultado de la resta por pantalla
		System.out.println("La resta de ambos numeros es: " + resta);
		// Enseñamos el resultado de la multiplicacion por pantalla
		System.out.println("La multiplicacion de ambos numeros es: " + multiplicacion);

		if (numero2 == 0) {
			System.out.println("No has ido al colegio o que hermano");
		}
		else {
		System.out.println("La division de ambos numeros es: " + division);

		}
		
		sc.close();
	}

}
