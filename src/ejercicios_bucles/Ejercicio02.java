package ejercicios_bucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		int numero;
		int contadorPrimos = 0;
		boolean primo;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Indique un número: ");
		numero = sc.nextInt();
		
		for (int i = 1; i < numero; i++) {
			primo = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
				}
			}
			if (primo) {
				contadorPrimos++;
			}
		}
		
		System.out.println("Hay " + contadorPrimos + " primos");

		sc.close();
	}
}
