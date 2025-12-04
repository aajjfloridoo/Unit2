package arrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

        int tabla[] = new int[8];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Indíqueme el número " + (i + 1) + " de la tabla: ");
            tabla[i] = sc.nextInt();
        }
        
        System.out.println();
        
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i]);
            if (tabla[i] % 2 == 0) {
            	System.out.print(" Par");
            } else {
            	System.out.print(" Inpar");
            }
            System.out.println();
	       }
        
        
        sc.close();
	}
}
