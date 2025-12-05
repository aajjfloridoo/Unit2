package arrays;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril",
            "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        double[] temperaturas = new double[12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Introduce la temperatura media de " + meses[i] + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        System.out.println("\n--------DIAGRAMA DE BARRAS DE TEMPERATURAS--------");

        for (int i = 0; i < 12; i++) {
            System.out.printf("%-10s | ", meses[i]);

            int barras = 0;
            double temp = temperaturas[i];

            while (temp >= 1) {
                barras++;
                temp = temp - 1;
            }

            for (int j = 0; j < barras; j++) {
                System.out.print("*");
            }

            System.out.println(" (" + temperaturas[i] + " ºC)");
        }

        sc.close();	
		
		
		
	}
}
