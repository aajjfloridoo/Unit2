package condicionales;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Declaracion de variable para almacenar el número
        int numero;

        // Inicializamos el Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario que introduzca un número
        System.out.println("Introduzca un número: ");
        // Leemos y guardamos el número
        numero = sc.nextInt();
        
        // Convertimos el número a su valor absoluto
        numero = numero < 0 ? numero * (-1) : numero;
        
        // Mostramos el valor absoluto del número
        System.out.println("Valor absoluto: " + numero);
        
        // Cerramos el Scanner para liberar recursos
        sc.close();
        
    }
}