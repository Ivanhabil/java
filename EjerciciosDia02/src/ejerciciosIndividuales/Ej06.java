package ejerciciosIndividuales;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {

		// Ejercicio 06
		Scanner scanner = new Scanner(System.in);
		int num;

		do {
			System.out.println("Introduce un número: ");
			num = scanner.nextInt();
			System.out.println("Cuadrado del num " + num + " es:" + (num * num));
		} while (num >= 0);
	}

}
