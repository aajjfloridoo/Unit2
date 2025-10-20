package ejercicios_switch;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Declaracion de variable para el primer número
        int numero1;
        // Declaracion de variable para el segundo número
        int numero2;
        
        // Inicializamos el Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el primer número
        System.out.println("Indique el primer número: ");
        // Leemos y guardamos el primer número
        numero1 = sc.nextInt();
        
        // Solicitamos al usuario que ingrese el segundo número
        System.out.println("Indique el segundo número: ");
        // Leemos y guardamos el segundo número
        numero2 = sc.nextInt();
        // Limpiamos el buffer del Scanner después de leer números
        sc.nextLine();
        
        // Declaracion de variable para almacenar la opción del menú
        String opcion;
        
        // Mostramos el menú de opciones al usuario
        System.out.println("----MENU----\n");
        System.out.println("A. SUMAR LOS NÚMEROS");
        System.out.println("B. RESTAR LOS NÚMEROS");
        System.out.println("C. MULTIPLICAR LOS NÚMEROS");
        System.out.println("D. DIVIDIR LOS NÚMEROS\n");
        
        // Solicitamos al usuario que seleccione una opción del menú
        System.out.println("Seleccione una opción: ");
        // Leemos y guardamos la opción seleccionada
        opcion = sc.nextLine();

        // Evaluamos la opción seleccionada usando switch
        switch (opcion) {

        case "A": 
            // Calculamos la suma de los dos números
            int suma = numero1 + numero2;
            // Mostramos el resultado de la suma
            System.out.println("La suma es: " + suma);
            // Salimos del switch
            break;
        
        case "B": 
            // Calculamos la resta de los dos números
            int resta = numero1 - numero2;
            // Mostramos el resultado de la resta
            System.out.println("La resta es: " + resta);
            // Salimos del switch
            break;
        
        case "C": 
            // Calculamos la multiplicación de los dos números
            int multiplicacion = numero1 * numero2;
            // Mostramos el resultado de la multiplicación
            System.out.println("La multiplicación es: " + multiplicacion);
            // Salimos del switch
            break;
        
        case "D": 
            // Verificamos que el divisor no sea cero
            if (numero2 != 0) {
                // Calculamos la división
                double division = (double) numero1 / numero2;
                // Mostramos el resultado de la división
                System.out.println("La división es: " + division);
            } else {
                // Mostramos mensaje de error cuando se intenta dividir por cero
                System.out.println("Error // No se puede dividir por cero \\");
            }
            // Salimos del switch
            break;
        
        default: 
            // Mostramos mensaje de error para opciones no válidas
            System.out.println("\nOpción incorrecta.");
            // Salimos del switch
            break;
        }
        
        // Cerramos el Scanner 
        sc.close();
    }
}