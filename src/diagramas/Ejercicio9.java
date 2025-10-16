package diagramas;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		double nota;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la calificación: ");
		nota = sc.nextDouble();
		
		if (nota < 0 || nota > 10) {
			System.out.println("Su nota no es válida, vuelva a intentarlo e indique un valor entre 0 y 10");
			
		} else if (nota < 3) {
			System.out.println("MUY DEFICIENTE");
			
		} else if (nota < 5) {
			System.out.println("DEFICIENTE");
			
		} else if (nota < 7) {
			System.out.println("BIEN");
			
		} else if (nota < 9) {
			System.out.println("NOTABLE");
			
		} else {
			System.out.println("SOBRESALIENTE");
		} 
		
		sc.close();
			
		
	}
}
