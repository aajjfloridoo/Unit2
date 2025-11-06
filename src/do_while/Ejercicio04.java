package do_while;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar el número introducido por el usuario
		int numero;
		// Declaracion de variable para contar las iteraciones del bucle (multiplicador)
		int i = 0;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que introduzca un número para la tabla de multiplicar
		System.out.println("Introduzca un número del que quiera obtener la tabla: ");
		// Leemos y guardamos el número introducido por el usuario
		numero = sc.nextInt();
		
		// Bucle do-while que se ejecuta al menos una vez
		do {
			// Mostramos la multiplicación actual: número x i = resultado
	        System.out.println(numero + " x " + i + " = " + (numero * i));
		    // Incrementamos el multiplicador para la siguiente iteración
		    i++;	
		} while (i <= 10); // Continuamos mientras el multiplicador sea menor o igual a 10
		
		// Cerramos el Scanner para liberar recursos
		sc.close();
			
	}
}