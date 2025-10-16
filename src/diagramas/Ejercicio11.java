package diagramas;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		String nombre;
		double horasTrabajadas;
		double tarifaHora;
		double salarioBruto;
		double salarioNeto;
		double impuestos;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca su nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("Introduzca las horas trabajadas: ");
		horasTrabajadas = sc.nextDouble();
		
		System.out.println("Introduzca la tarifa por hora: ");
		tarifaHora = sc.nextDouble();
		
		if (horasTrabajadas <= 35) {
			salarioBruto = horasTrabajadas * tarifaHora;
		} else {
			salarioBruto = (35 * tarifaHora) + ((horasTrabajadas - 35) * tarifaHora * 1.5);
		}
		
		if (salarioBruto <= 500) {
			impuestos = 0;
		} else if(salarioBruto <= 900) {
			impuestos = (salarioBruto - 500) * 0.25;
		} else {
			impuestos = (400 * 0.25) + ((salarioBruto - 900) * 0.45);
		}
		
		salarioNeto = salarioBruto - impuestos;
	
		System.out.println("Nombre: " + nombre);
		System.out.println("Salario Neto: " + salarioNeto);
		System.out.println("Impuestos: " + impuestos);

		sc.close();
		
	}
}
