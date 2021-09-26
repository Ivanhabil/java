package ejerciciosIndividuales;

import java.util.Scanner;

public class Ej05 {

	public static void main(String[] args) {
		
		// Ejercicio 05
		Scanner scanner = new Scanner(System.in);
		int dia1, mes1, ano1, dia2, mes2, ano2;
		
		System.out.println("Introduce el día de la primera fecha: ");
		dia1 = scanner.nextInt();
		System.out.println("Introduce el mes de la primera fecha: ");
		mes1 = (scanner.nextInt()*30);
		System.out.println("Introduce el año de la primera fecha: ");
		ano1 = scanner.nextInt()*365;
		
		System.out.println("Introduce el día de la segunda fecha: ");
		dia2 = scanner.nextInt();
		System.out.println("Introduce el mes de la segunda fecha: ");
		mes2 = (scanner.nextInt()*30);
		System.out.println("Introduce el año de la segunda fecha: ");
		ano2 = scanner.nextInt()*365;
				
		
		System.out.println("Diferencia días: "+ ((dia1+mes1+ano1)-(dia2+mes2+ano2)));
	}
}
