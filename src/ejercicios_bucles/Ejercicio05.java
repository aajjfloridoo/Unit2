package ejercicios_bucles;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		int num;

		Scanner sc = new Scanner (System.in);
		
		do {
			
		System.out.println("Indique un número del 1 al 20: ");
		num = sc.nextInt();
			
		} while (num < 1 || num > 2000);
		
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
