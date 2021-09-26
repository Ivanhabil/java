package ejerciciosIndividuales;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		
		// Ejercicio 03
		Scanner scanner = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("Introduce el primer número: ");
		n1 = scanner.nextInt();
		System.out.println("Introduce el segundo número: ");
		n2 = scanner.nextInt();
		System.out.println("Introduce el tercer número: ");
		n3 = scanner.nextInt();

		String orden = "";
		
		if (n1 > n2) {
			if (n1 > n3) {
				if (n3 > n2) {
					orden += n1 + " > " + n3 + " > " + n2;
				} else {
					orden += n1 + " > " + n2 + " > " + n3;
				}
			} else {
				orden += n3 + " > " + n1 + " > " + n2;
			}
		} else if (n2>n3) {
			if(n3>n1) {
				orden += n2 + " > " + n3 + " > " + n1;
			}else {
				orden += n2 + " > " + n1 + " > " + n3;
			}
		}else {
			orden += n3 + " > " + n2 + " > " + n1;
		}

		System.out.println(orden);
	}

}
