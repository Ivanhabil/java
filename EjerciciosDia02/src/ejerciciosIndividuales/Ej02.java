package ejerciciosIndividuales;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {

		// Ejercicio 02
		Scanner scanner = new Scanner(System.in);
		int n1, n2;
		
		System.out.println("Introduce el primer n�mero: ");
		n1 = scanner.nextInt();
		System.out.println("Introduce el segundo n�mero: ");
		n2 = scanner.nextInt();

		if (n1 == n2) {
			System.out.println("Ambos numeros son iguales");
		} else if (n1 > n2) {
			System.out.println("El primer n�mero es mayor que el segundo");
		} else {
			System.out.println("El segundo n�mero es mayor que el primero");
		}
	}
}
