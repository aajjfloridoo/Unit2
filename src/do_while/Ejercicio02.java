package do_while;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Declaracion de variable para almacenar el número introducido por el usuario
		int numero;

		numero = 2;
		
		do {
			System.out.println(numero);
			numero = numero + 2;
		}while (numero <= 200);
		
	}
}
