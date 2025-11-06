package do_while;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar el número introducido por el usuario
		int numeroPedido;
		// Declaracion de variable para contar desde 1 hasta el número pedido
		int numero = 1;
		// Declaracion de variable para acumular la suma de los números
		int suma = 0;

		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner(System.in);

		// Solicitamos al usuario que introduzca un número
		System.out.println("Introduzca un número: ");
		// Leemos y guardamos el número introducido por el usuario
		numeroPedido = sc.nextInt();

		// Bucle do-while que se ejecuta al menos una vez
		do {
			// Sumamos el número actual al acumulador
			suma += numero;
			// Incrementamos el número para la siguiente iteración
			numero++;
		} while (numero <= numeroPedido); // Continuamos mientras el número sea menor o igual al número pedido
		
		// Mostramos el resultado de la suma
		System.out.println("Suma: " + suma);

		// Cerramos el Scanner para liberar recursos
       sc.close(); 
	}
}