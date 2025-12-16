package funciones;

import java.util.Scanner;

public class Ejercicio02 {
	
	static int maximo(int tabla[]) {
		 
		int maximo = tabla[0];
		
		for (int i = 0; i < tabla.length; i++) {
			if (tabla[i] > maximo) {
				maximo = tabla[i];
			}
		}
		return maximo;
	}

	public static void main(String[] args) {

		int numeros[] = new int[10];
		int numeroMax;
		
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Introduzca el valor " + (i + 1) + " de la tabla: ");
			numeros[i] = sc.nextInt();
		}
		
		numeroMax = maximo(numeros);
		
		System.out.println("El numero maximo es: " + numeroMax);
		
		sc.close();

	}
}
