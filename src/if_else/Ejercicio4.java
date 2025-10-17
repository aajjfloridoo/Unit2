package if_else;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int numero;
		
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Introduce un número entre 0 y 99999: ");
        numero = sc.nextInt();
        
        if (numero < 0 || numero > 99999) {
            System.out.println("El número debe estar entre 0 y 99999");
        } else if (numero < 10) {
            System.out.println("El número " + numero + " tiene 1 cifra");
        } else if (numero < 100) {
            System.out.println("El número " + numero + " tiene 2 cifras");
        } else if (numero < 1000) {
            System.out.println("El número " + numero + " tiene 3 cifras");
        } else if (numero < 10000) {
            System.out.println("El número " + numero + " tiene 4 cifras");
        } else {
            System.out.println("El número " + numero + " tiene 5 cifras");
        }
        
        sc.close();
	}
}
