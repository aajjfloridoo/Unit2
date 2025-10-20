package ejercicios_switch;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int numero1;
        int numero2;
        
        // Inicializamos el Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el primer número
        System.out.println("Indique el primer número: ");
        numero1 = sc.nextInt();
        
        // Solicitamos al usuario que ingrese el segundo número
        System.out.println("Indique el segundo número: ");
        numero2 = sc.nextInt();
        sc.nextLine();
        
        String opcion;
        
        System.out.println("----MENU----\n");
        System.out.println("A. SUMAR LOS NÚMEROS");
        System.out.println("B. RESTAR LOS NÚMEROS");
        System.out.println("C. MULTIPLICAR LOS NÚMEROS");
        System.out.println("D. DIVIDIR LOS NÚMEROS\n");
        
        System.out.println("Seleccione una opción: ");
        opcion = sc.nextLine();

        switch (opcion) {

        case "A": 
            int suma = numero1 + numero2;
            System.out.println("La suma es: " + suma);
            break;
        
        case "B": 
            int resta = numero1 - numero2;
            System.out.println("La resta es: " + resta);
            break;
        
        case "C": 
            int multiplicacion = numero1 * numero2;
            System.out.println("La multiplicación es: " + multiplicacion);
            break;
        
        case "D": 
            if (numero2 != 0) {
                double division = (double) numero1 / numero2;
                System.out.println("La división es: " + division);
            } else {
                System.out.println("Error // No se puede dividir por cero \\");
            }
            break;
        
        default: 
            System.out.println("\nOpción incorrecta.");
            break;
        }
        
        sc.close();
    }
}
