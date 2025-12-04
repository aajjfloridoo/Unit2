package arrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {

		int tabla[] = new int[9];
		
		Random aleatorio = new Random ();
		
		for (int i = 0; i < 9; i++) {
			tabla[i] = aleatorio.nextInt(1, 101);
		}
		
		System.out.println("Tabla: " + Arrays.toString(tabla));
	}
}
