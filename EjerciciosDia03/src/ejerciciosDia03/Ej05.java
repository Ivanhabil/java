package ejerciciosDia03;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {

		int primerTimestre[] = new int[5], segundoTimestre[] = new int[5], tercerTimestre[] = new int[5];
		int pos;
		int sumaPrimer = 0, sumaSegundo = 0, sumaTercer = 0;
		int notaMedia;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce las notas del primer trimestre:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Alumno " + i + ": ");
			primerTimestre[i] = scanner.nextInt();
		}

		System.out.println("Introduce las notas del segundo trimestre:");

		for (int i = 0; i < 5; i++) {
			System.out.print("Alumno " + i + ": ");
			segundoTimestre[i] = scanner.nextInt();
		}

		System.out.println("Introduce las notas del tercer trimestre:");

		for (int i = 0; i < 5; i++) {
			System.out.print("Alumno " + i + ": ");
			tercerTimestre[i] = scanner.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			sumaPrimer += primerTimestre[i];
			sumaSegundo += segundoTimestre[i];
			sumaTercer += tercerTimestre[i];
		}

		System.out.println("Media del primer trimestre: " + sumaPrimer / 5);
		System.out.println("Media del segundo trimestre: " + sumaSegundo / 5);
		System.out.println("Media del tercer trimestre: " + sumaTercer / 5);

		System.out.print("Introduzca la posición del alumno (del 0 al 9): ");
		pos = scanner.nextInt();

		notaMedia = (primerTimestre[pos] + segundoTimestre[pos] + tercerTimestre[pos]) / 3;

		System.out.println("La nota media del alumno es: " + notaMedia);
	}

}
