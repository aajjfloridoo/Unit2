package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        int tabla[] = new int[100];
        int numero;
        int contadorNumeros[] = new int[100];
        int contador = 0;;
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = random.nextInt(10) + 1;
        }
        
        do {
            System.out.println("Introduzca un numero del 1 al 10: ");
            numero = sc.nextInt();
        } while (numero > 10 || numero < 1);
        
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == numero) {
                contadorNumeros[contador] = i;
                contador++;
            }
        }
        
        if (contador == 0) {
            System.out.println("El número no se ha encontrado en la tabla.");
        } else {
            int posiciones [] = Arrays.copyOf(contadorNumeros, contador);
            System.out.println("Se ha encontrado el número en las posiciones: " + Arrays.toString(posiciones));
        }

        sc.close();
    }
}
