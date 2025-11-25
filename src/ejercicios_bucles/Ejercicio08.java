package ejercicios_bucles;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        int anterior;   
        int siguiente = -1; 
        int contador = 0;
        int fallos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número inicial: ");
        anterior = sc.nextInt();

        while (siguiente != 0) {
        	
            System.out.println("Dime un número: ");
            siguiente = sc.nextInt();

            if (siguiente == 0) {
                break;
            }

            contador++;

            if (siguiente > anterior) {
                anterior = siguiente; 
            } else {
                System.out.println("Fallo.");
                fallos++;
                anterior = siguiente;
            }
        }

        System.out.println("Total de números: " + contador);
        System.out.println("Fallos: " + fallos);

        sc.close();
    }
}


