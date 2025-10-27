package while_;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		int numero;
		int suma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique un número: ");
		numero = sc.nextInt();
		
		while (numero >= 0) {
			suma += numero;
			System.out.println("Indique un número: ");
			numero = sc.nextInt();
		}
		
		System.out.println("Suma: " + suma);

		sc.close();
		
	}
}
