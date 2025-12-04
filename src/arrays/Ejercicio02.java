package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		double tabla[] = new double[4];
		
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Indiqueme el numero " + (i + 1)+ " de la tabla: ");
			tabla[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		for (int i = 0; i < 1; i++) {
			System.out.println("Tabla: " + Arrays.toString(tabla));
		}
		
		sc.close();
	}
}
