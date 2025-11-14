package ejercicios_bucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		int segundo;
		int hora;
		int minuto;
		int incrementarSegundos;
		int segundosTotales;
		
		Scanner sc = new Scanner (System.in);
		
		do {
			System.out.println("Introduzca la hora: ");
			hora = sc.nextInt();
			if (hora > 24 || hora < 0) {
				System.out.println("--HORA INVÁLIDA. VUELVA A INTENTARLO--");
				System.out.println("\n");
			}
		} while (hora > 24 || hora < 0);
		
		do {
			System.out.println("Introduzca los minutos: ");
			minuto = sc.nextInt();
			if (minuto > 59 || minuto < 0) {
				System.out.println("--MINUTOS INVÁLIDOS. VUELVA A INTENTARLO--");
				System.out.println("\n");
			}
		} while (minuto > 59 || minuto < 0);
		
		do {
			System.out.println("Introduzca los segundos: ");
			segundo = sc.nextInt();
			if (segundo > 59 || segundo < 0) {
				System.out.println("--SEGUNDOS INVÁLIDOS. VUELVA A INTENTARLO--");
				System.out.println("\n");
			}
		} while (segundo > 59 || segundo < 0);
		
		
		System.out.println("Hora actual: " + hora + ":" + minuto + ":" + segundo);
		System.out.println("\n");
		
		do {
			System.out.println("Introduzca los segundos que desea incrementar: ");
			incrementarSegundos = sc.nextInt();
			if (incrementarSegundos < 0) {
				System.out.println("--CANTIDAD INVÁLIDA. VUELVA A INTENTARLO--");
				System.out.println("\n");
			}
		} while (incrementarSegundos < 0);
		
		segundosTotales = incrementarSegundos + segundo + (minuto * 60) + (hora * 3600);
		
		hora = segundosTotales / 3600;
		minuto = (segundosTotales % 3600) / 60;
		segundo = segundosTotales % 60;
		
		System.out.println("\n");
		System.out.println("Nueva hora: " + hora + ":" + minuto + ":" + segundo);

		sc.close();
	}
}
