package ejercicios_bucles;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		int a;
		int b;
		int max;
		int mcm = 1;
		boolean encontrado = false;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Indique el primer número: ");
		a = sc.nextInt();
		
		System.out.println("Indique el segundo número: ");
		b = sc.nextInt();
		
		max = Math.max(a, b);
		
		for ( int i = max; !encontrado ; i++ ) {
			if (i % a == 0 && i % b == 0) {
				mcm = i;
				encontrado = true;
			}
		}
		
		System.out.println("El MCM de " + a + " y " + b + " es: " + mcm);
		
		sc.close();
	}
}
