package if_else;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int numero;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique un número: ");
		numero = sc.nextInt();
		
		if (numero > 1 && numero < -1 && numero != 0) {
			System.out.println("Su número es casi-cero");
		}

	}
}
