package ej7Dia04;

import java.util.HashMap;
import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {

		HashMap<String, String> hashMap = new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);

		String pais, capital, clave;
		int opcion;

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un país:");
			pais = scanner.next();

			System.out.println("Introduce su capital:");
			capital = scanner.next();

			hashMap.put(pais, capital);
		}

		System.out.println("---Lista de Paises y Capitales---");

		for (String key : hashMap.keySet()) {
			System.out.println("País: " + key);
			System.out.println("Capital: " + hashMap.get(key));
		}

		System.out.println("");

		do {
			System.out.println("*****Opciones*****");
			System.out.println("1-Buscar valor(capital)");
			System.out.println("2-Salir");
			System.out.println("");
			opcion = scanner.nextInt();
			System.out.println("");

			switch (opcion) {
			case 1:
				System.out.println("Introduce la clave(País):");
				clave = scanner.next();
				System.out.println("Su valor(Capital):" + hashMap.get(clave));
				System.out.println("");
				break;
			case 2:
				System.out.println("---Hasta luego---");
				break;
			default:
				System.out.println("No has elegido una opcion correcta. Vuelve a intentarlo");
			}
		} while (opcion != 2);
	}
}
