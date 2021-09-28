package ej1Dia06;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String frase;

		System.out.println("Introduce la frase: ");
		frase = scanner.nextLine();
		System.out.println(invertirCadena(frase));

	}

	public static String invertirCadena(String cadena) {

		String partes[] = cadena.split(" ");
		String fraseInvertida = "";

		for (int i = partes.length - 1; i >= 0; i--) {
			fraseInvertida += partes[i] + " ";
		}

		return fraseInvertida;
	}

}
