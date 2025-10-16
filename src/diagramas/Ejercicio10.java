package diagramas;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		int horas;
		int minutos;
		int segundos;
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca la hora: ");
		horas = sc.nextInt();
		
		System.out.println("Introduzca los minutos: ");
		minutos = sc.nextInt();

		System.out.println("Introduzca los segundos: ");
		segundos = sc.nextInt();

		segundos++;
		
		if (segundos == 60 ) {
			segundos = 0;
			minutos++;
		} 
		
		if (minutos == 60) {
			minutos = 0;
			horas++;	
		} 
		
		if (horas == 24){
			horas = 0;
		}
		
		System.out.println(horas + " : " + minutos + " : " + segundos);
		
		sc.close();
		
				
	}
}
