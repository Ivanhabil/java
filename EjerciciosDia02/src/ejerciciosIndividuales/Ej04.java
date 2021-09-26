package ejerciciosIndividuales;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {

		// Ejercicio 04
		Scanner scanner = new Scanner(System.in);
		double nota;
		
		System.out.println("Introduce una nota(del 1 al 7): ");
		nota = scanner.nextDouble();

		if (nota <= 3.9) {
			System.out.println("Tu nota es un Insuficiente");
		} else if (nota > 6) {
			System.out.println("Tu nota es un Bien");
		} else {
			System.out.println("Tu nota es un Suficiente");
		}
	}

}
