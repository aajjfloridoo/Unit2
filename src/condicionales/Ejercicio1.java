package condicionales;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Declaracion de variable para almacenar el número
        int numero;

        // Inicializamos el Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario que introduzca un número
        System.out.println("Introduzca un número del 0 al 9999");
        // Leemos y guardamos el número
        numero = sc.nextInt();

        // Verificamos si el número está fuera del rango permitido
        if (numero < 0 || numero > 9999) {
            // Mostramos mensaje de número fuera de rango
            System.out.println("El número se encuentra fuera de rango");

        } else if (numero < 10) {
            // Números de 1 cifra (0-9) - siempre son capicúa
            System.out.println("El número es capicúa ya que solo dispone de una cifra");

        } else if (numero < 100) {
            // Números de 2 cifras (10-99)
            if ((numero / 10) == (numero % 10)) {
                // Mostramos mensaje de número capicúa
                System.out.println("El número " + numero + " ES capicúa");
            } else {
                // Mostramos mensaje de número no capicúa
                System.out.println("El número " + numero + " NO es capicúa");
            }

        } else if (numero < 1000) {
            // Números de 3 cifras (100-999)
            if ((numero / 100) == (numero % 10)) {
                // Mostramos mensaje de número capicúa
                System.out.println("El número " + numero + " ES capicúa");
            } else {
                // Mostramos mensaje de número no capicúa
                System.out.println("El número " + numero + " NO es capicúa");
            }

        } else {
            // Números de 4 cifras (1000-9999)
            if ((numero / 1000 == numero % 10) && ((numero / 100) % 10 == (numero / 10) % 10)) {
                // Mostramos mensaje de número capicúa
                System.out.println("El número " + numero + " ES capicúa");
            } else {
                // Mostramos mensaje de número no capicúa
                System.out.println("El número " + numero + " NO es capicúa");
            }
        }

        // Cerramos el Scanner para liberar recursos
        sc.close();
    }
}