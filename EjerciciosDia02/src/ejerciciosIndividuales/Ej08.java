package ejerciciosIndividuales;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {

		// Ejercicio 08
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.println("Introduce el número");
		num = scanner.nextInt();
		
		for (int i = 0; i < 11; i++) {
			System.out.println(num + "x" + i + "=" + (num * i));
		}
	}

}
