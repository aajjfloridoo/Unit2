package condicionales;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

        // Inicializamos el Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Solicitamos al usuario que introduzca el año
        System.out.print("Introduce el año: ");
        // Leemos y guardamos el año
        int año = sc.nextInt();
        
        // Solicitamos al usuario que introduzca el mes
        System.out.print("Introduce el número del mes (1-12): ");
        // Leemos y guardamos el mes
        int mes = sc.nextInt();
        
        // Declaracion de variable para almacenar los días del mes
        int dias = 0;
        
        // Declaracion de variable para verificar si es año bisiesto
        boolean esBisiesto = false;
        // Verificamos si el año es bisiesto
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            // Marcamos como año bisiesto
            esBisiesto = true;
        }
        
        // Calculamos días del mes usando switch
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                // Asignamos 31 días para meses largos
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                // Asignamos 30 días para meses cortos
                dias = 30;
                break;
            case 2:
                // Verificamos días de febrero según si es bisiesto
                if (esBisiesto) {
                    // Asignamos 29 días para febrero bisiesto
                    dias = 29;
                } else {
                    // Asignamos 28 días para febrero no bisiesto
                    dias = 28;
                }
                break;
            default:
                // Mostramos mensaje de error para mes inválido
                System.out.println("Mes no válido. Debe ser entre 1 y 12.");
                return;
        }
        
        // Mostramos si el año es bisiesto
        System.out.println("¿Es bisiesto? " + (esBisiesto ? "Sí" : "No"));
        // Mostramos los días del mes
        System.out.println("El mes " + mes + " tiene " + dias + " días.");
        
        // Cerramos el Scanner para liberar recursos
        sc.close();
		
	}
}