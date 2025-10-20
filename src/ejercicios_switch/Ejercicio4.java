package ejercicios_switch;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

        // Variables para guardar los números convertidos
        int numero1 = 0;
        int numero2 = 0;
        boolean tirada1Valida = true;
        boolean tirada2Valida = true;
        
        Scanner sc = new Scanner(System.in);
        
        // Primera tirada
        System.out.println("¿Qué ha sacado en la primera tirada? (UNO, DOS, TRES, CUATRO, CINCO o SEIS): ");
        String tirada1 = sc.nextLine();
        
        // Segunda tirada
        System.out.println("¿Qué ha sacado en la segunda tirada? (UNO, DOS, TRES, CUATRO, CINCO o SEIS): ");
        String tirada2 = sc.nextLine();
        
        // Convertir primera tirada a número
        switch (tirada1) {
            case "UNO":
                numero1 = 1;
                break;
            case "DOS":
                numero1 = 2;
                break;
            case "TRES":
                numero1 = 3;
                break;
            case "CUATRO":
                numero1 = 4;
                break;
            case "CINCO":
                numero1 = 5;
                break;
            case "SEIS":
                numero1 = 6;
                break;
            default:
            	tirada1Valida = false;
                break;
        }
        
        // Convertir segunda tirada a número
        switch (tirada2) {
            case "UNO":
                numero2 = 1;
                break;
            case "DOS":
                numero2 = 2;
                break;
            case "TRES":
                numero2 = 3;
                break;
            case "CUATRO":
                numero2 = 4;
                break;
            case "CINCO":
                numero2 = 5;
                break;
            case "SEIS":
                numero2 = 6;
                break;
            default:
            	tirada2Valida = false;
                break;
        }
        
        // Calcular y mostrar resultado
        if (tirada1Valida && tirada2Valida) {
        	
            int suma = numero1 + numero2;
            System.out.println("La suma de las dos tiradas es: " + suma);
        } else {
            System.out.println("Error: Una de las tiradas no es válida.");
        }
        
        sc.close();
		
		
		
		
		
		
		
		
		
		
		
	}
}
