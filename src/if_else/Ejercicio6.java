package if_else;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int suma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique a: ");
		a = sc.nextInt();
		
		System.out.println("Indique b: ");
		b = sc.nextInt();
		
		System.out.println("Indique c: ");
		c = sc.nextInt();
		
		suma = a + b;
		
		if (suma == c) {
			System.out.println("La suma es igual a " + c);
		} else {
			System.out.println("La suma es distinta de " + c);
		}
	}

}
