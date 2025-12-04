package arrays;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        int tabla[] = new int[10];
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Indíqueme el número " + (i + 1) + " de la tabla: ");
            tabla[i] = sc.nextInt();
        }
        
        System.out.println("La tabla al revés es:");
        for (int i = tabla.length - 1; i >= 0; i--) {
            System.out.print(tabla[i] + " ");
        }
        
        sc.close();
    }
}
