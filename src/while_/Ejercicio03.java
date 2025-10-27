package while_;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		int numero;
		int contador = 0;
		int suma = 0;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique un número (negativo sidesea terminar): ");
		numero = sc.nextInt();
		
		while (numero >= 0) {
			contador += 1;
			suma += numero;
			System.out.println("Indique un número (negativo sidesea terminar): ");
			numero = sc.nextInt();
		}
		
		media = (double) suma / contador;
		
		System.out.println("Contador: " + contador);
		System.out.println("Media: " + media);

		sc.close();
		
		
		
		
		
		
		
		
	}
}
