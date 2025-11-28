package ejercicios_bucles;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		int numero;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Indique un numero entero: ");
		numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k-- ) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		
		
	}
}
