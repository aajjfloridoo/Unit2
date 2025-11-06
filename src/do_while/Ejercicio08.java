package do_while;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        // Declaracion de variable para almacenar el primer número convertido
        int numero1 = 0;
        // Declaracion de variable para almacenar el segundo número convertido
        int numero2 = 0;
        // Declaracion de variable para controlar la validez de la primera tirada
        boolean tirada1Valida = false;
        // Declaracion de variable para controlar la validez de la segunda tirada
        boolean tirada2Valida = false;
        // Declaracion de variable para almacenar el texto de la primera tirada
        String tirada1;
        // Declaracion de variable para almacenar el texto de la segunda tirada
        String tirada2;

        // Inicializamos el Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Bucle do-while para validar la primera tirada
        do {
            // Solicitamos al usuario que introduzca la primera tirada
            System.out.println("¿Qué ha sacado en la primera tirada? (UNO, DOS, TRES, CUATRO, CINCO o SEIS): ");
            // Leemos y convertimos a mayúsculas la primera tirada
            tirada1 = sc.nextLine().toUpperCase();

            // Convertir primera tirada a número usando switch
            switch (tirada1) {
                case "UNO":
                    numero1 = 1;
                    tirada1Valida = true;
                    break;
                case "DOS":
                    numero1 = 2;
                    tirada1Valida = true;
                    break;
                case "TRES":
                    numero1 = 3;
                    tirada1Valida = true;
                    break;
                case "CUATRO":
                    numero1 = 4;
                    tirada1Valida = true;
                    break;
                case "CINCO":
                    numero1 = 5;
                    tirada1Valida = true;
                    break;
                case "SEIS":
                    numero1 = 6;
                    tirada1Valida = true;
                    break;
                default:
                    // Mostramos mensaje de error para tirada no válida
                    System.out.println("Error: Tirada no válida. Por favor, introduzca UNO, DOS, TRES, CUATRO, CINCO o SEIS.");
                    tirada1Valida = false;
                    break;
            }

        } while (!tirada1Valida); // Continuamos mientras la primera tirada no sea válida

        // Bucle do-while para validar la segunda tirada
        do {
            // Solicitamos al usuario que introduzca la segunda tirada
            System.out.println("¿Qué ha sacado en la segunda tirada? (UNO, DOS, TRES, CUATRO, CINCO o SEIS): ");
            // Leemos y convertimos a mayúsculas la segunda tirada
            tirada2 = sc.nextLine().toUpperCase();

            // Convertir segunda tirada a número usando switch
            switch (tirada2) {
                case "UNO":
                    numero2 = 1;
                    tirada2Valida = true;
                    break;
                case "DOS":
                    numero2 = 2;
                    tirada2Valida = true;
                    break;
                case "TRES":
                    numero2 = 3;
                    tirada2Valida = true;
                    break;
                case "CUATRO":
                    numero2 = 4;
                    tirada2Valida = true;
                    break;
                case "CINCO":
                    numero2 = 5;
                    tirada2Valida = true;
                    break;
                case "SEIS":
                    numero2 = 6;
                    tirada2Valida = true;
                    break;
                default:
                    // Mostramos mensaje de error para tirada no válida
                    System.out.println("Error: Tirada no válida. Por favor, introduzca UNO, DOS, TRES, CUATRO, CINCO o SEIS.");
                    tirada2Valida = false;
                    break;
            }

        } while (!tirada2Valida); // Continuamos mientras la segunda tirada no sea válida

        // Calculamos la suma de las dos tiradas válidas
        int suma = numero1 + numero2;
        // Mostramos el resultado de la suma
        System.out.println("La suma de las dos tiradas es: " + suma);

        // Cerramos el Scanner para liberar recursos
        sc.close();
    }
}