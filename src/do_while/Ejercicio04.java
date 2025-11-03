package do_while;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		int numero;
		int i = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número del que quiera obtener la tabla: ");
		numero = sc.nextInt();
		
		do {
	        System.out.println(numero + " x " + i + " = " + (numero * i));
		    i++;	
		} while (i <= 10);
			
	}
}
