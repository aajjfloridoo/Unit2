package funciones;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
	
	static void devolverTabla(int tabla[]) {
		System.out.println(Arrays.toString(tabla));
	}

	public static void main(String[] args) {

		int numeros[] = new int[10];	
		
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca el valor " + (i + 1) + " de la tabla: ");
			numeros[i] = sc.nextInt();
		}
		
		devolverTabla(numeros);
		sc.close();
	}
}
