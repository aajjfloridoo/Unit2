package do_while;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar el número introducido por el usuario
		int numero;

		// Inicializamos la variable numero con el valor 1
		numero = 1;
		
		// Bucle do-while que se ejecuta al menos una vez
		do {
			// Mostramos el valor actual del número
			System.out.println(numero);
			// Incrementamos el número en 1 para la siguiente iteración
			numero++;
		} while (numero <= 20); // Continuamos mientras el número sea menor o igual a 20
		
	}
}