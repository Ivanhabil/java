package ej3Dia04;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ej03 {

	public static void main(String[] args) {

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaNacimiento = LocalDate.parse("10/05/2000", formato);

		Period diferecia = fechaNacimiento.until(fechaActual);
		System.out.println("Días vividos: " + (diferecia.getYears() * 365) 
				+ (diferecia.getMonths() * 30)
				+ (diferecia.getDays()));
	}

}
