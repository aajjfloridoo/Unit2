package while_;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
  

		int altura;
		int alturaMax;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique la altura del árbol: ");
		altura = sc.nextInt();
	
		alturaMax = altura;
		
		while (altura != -1) {
			if (altura > alturaMax) {
				alturaMax = altura;
			}
			System.out.println("Indique la altura del siguiente árbol: ");
			altura = sc.nextInt();
		}
		
		System.out.println("Altura máxima: " + alturaMax);
		
		sc.close();
	
	}
}
