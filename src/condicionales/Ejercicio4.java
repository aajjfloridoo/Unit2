package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos objeto Random para generar números aleatorios
		Random aleatorio = new Random ();	
		
		// Inicializamos el Scanner para leer entrada del usuario
		Scanner sc = new Scanner (System.in);
		
		// Declaracion de variable para el primer número aleatorio
		int numero1;
		// Declaracion de variable para el segundo número aleatorio
		int numero2;
		// Declaracion de variable para la respuesta del usuario
		int jugada;
		// Declaracion de variable para la suma correcta
		int suma;
		
		// Generamos el primer número aleatorio
		numero1 = aleatorio.nextInt();
		// Generamos el segundo número aleatorio
		numero2 = aleatorio.nextInt();
		
		// Calculamos la suma correcta de los números
		suma = numero1 + numero2;
		
		// Solicitamos al usuario que indique la suma
		System.out.println("INDIQUE LA SUMA DE " + numero1 + " Y " + numero2 + ": ");
        // Leemos y guardamos la respuesta del usuario
        jugada = sc.nextInt();
        
        // Verificamos si la respuesta es correcta
        if (suma == jugada) {
    		// Mostramos mensaje de respuesta correcta
    		System.out.println("¡¡¡CORRECTO!!!");
        } else {
    		// Mostramos mensaje de respuesta incorrecta
    		System.out.println("¡¡¡INCORRECTO!!!");
        }
        
        // Cerramos el Scanner para liberar recursos
        sc.close();
		
	}
}