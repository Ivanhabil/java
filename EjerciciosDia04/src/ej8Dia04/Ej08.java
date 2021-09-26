package ej8Dia04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introduce la primera fecha(dd/MM/yyyy):");
		LocalDate fecha1 = LocalDate.parse(scanner.next(), formato);

		System.out.println("Introduce la segunda fecha(dd/MM/yyyy):");
		LocalDate fecha2 = LocalDate.parse(scanner.next(), formato);

		if (fecha1.isAfter(fecha2)) {
			System.out.println(fecha1.format(formato) 
					+ " es mayor que " + fecha2.format(formato));
		} else {
			System.out.println(fecha2.format(formato) 
					+ " es mayor que " + fecha1.format(formato));
		}
	}

}
