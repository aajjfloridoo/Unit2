package arrays;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        double tabla[] = new double[10];
        double suma = 0;
        double maximo;
        double minimo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero 1 de la tabla: ");
        tabla[0] = sc.nextDouble();

        suma = tabla[0];
        maximo = tabla[0];
        minimo = tabla[0];

        for (int i = 1; i < tabla.length; i++) {

            System.out.println("Introduzca el numero " + (i + 1) + " de la tabla: ");
            tabla[i] = sc.nextDouble();

            suma += tabla[i];

            if (tabla[i] > maximo) {
                maximo = tabla[i];
            }

            if (tabla[i] < minimo) {
                minimo = tabla[i];
            }
        }

        sc.close();

        System.out.println("Suma total: " + suma);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
    }
}
