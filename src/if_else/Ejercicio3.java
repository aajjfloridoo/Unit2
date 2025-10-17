package if_else;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		
		int a;
		int b;
		int c;
		double x1;
		double x2;
		double discriminante;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique a: ");
		a = sc.nextInt();
		
		System.out.println("Indique b: ");
		b = sc.nextInt();
		
		System.out.println("Indique c: ");
		c = sc.nextInt();
		
		discriminante = (b * b) - (4 * a * c);
		
		if (discriminante < 0) {
			
			x1 = -b + Math.sqrt(discriminante);
			x2 = -b - Math.sqrt(discriminante);
			
			System.out.println("Primera solución: " + x1);
			System.out.println("Segunda solución: " + x2);

		}
		
		if (discriminante == 0) {
			
			x1 = -b + Math.sqrt(discriminante);
			
			System.out.println("El ejercicio posee una solució doble: " + x1);

		}
		
		if (discriminante < 0) {
					
			System.out.println("El ejercicio no tiene soluciones reales");

		}
		
	
	}
}
