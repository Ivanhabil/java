package ejerciciosIndividuales;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {

		// Ejercicio 07
		Scanner scanner = new Scanner(System.in);
		double suma = 0, sueldo = 0;
		int contador = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce e sueldo número " + i + ":");
			sueldo = scanner.nextDouble();
			suma += sueldo;

			if (sueldo > 2000) {
				contador++;
			}
		}
		System.out.println("Hay "+contador+" sueldo/s mayor/es de 2000€");
	}

}
