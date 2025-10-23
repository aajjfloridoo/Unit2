package condicionales;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

	/*Determinar el precio de un billete de tren, conociendo
	 * la distancia a recorrer, y sabiendo que si el número de días de 
	 * estancia es superior a 7 y la distancia superior a 800 km el billete 
	 * tiene una reducción del 30%. El precio por kilómetro es de 2,5€. 
	 * La distancia a recorrer y el número de días de estancia los debes 
	 * solicitar al usuario por teclado.
	 */
	
        // Declaracion de variable para la distancia en kilómetros
        int km;
        // Declaracion de variable para los días de estancia
        int estancia;
        // Declaracion de variable para el precio del billete
        double precio;

        // Inicializamos el Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario que introduzca la distancia
        System.out.println("Introduzca una distancia en km");
        // Leemos y guardamos la distancia
        km = sc.nextInt();
        
        // Solicitamos al usuario que introduzca los días de estancia
        System.out.println("Introduzca la duración de su estancia");
        // Leemos y guardamos los días de estancia
        estancia = sc.nextInt();
        
        // Calculamos el precio base sin descuentos
        precio = (double) km * 2.5;
        
        // Verificamos si aplica descuento por estancia larga y distancia
        if (estancia > 7 && km > 800) {
        	// Aplicamos descuento del 30%
        	precio = precio * 0.7;
        }
        
        // Mostramos el precio final del billete
        System.out.println("El precio del viaje serían: " + precio);
    
        // Cerramos el Scanner para liberar recursos
        sc.close();
		
	}
}
