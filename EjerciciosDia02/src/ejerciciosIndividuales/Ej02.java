package ejerciciosIndividuales;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {

		// Ejercicio 02
		Scanner scanner = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Introduce el primer número: ");
		n1 = scanner.nextInt();
		System.out.println("Introduce el segundo número: ");
		n2 = scanner.nextInt();

		if (n1 == n2) {
			System.out.println("Ambos numeros son iguales");
		} else if (n1 > n2) {
			System.out.println("El primer número es mayor que el segundo");
		} else {
			System.out.println("El segundo número es mayor que el primero");
		}
	}
}
