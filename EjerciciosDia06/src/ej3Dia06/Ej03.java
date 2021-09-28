package ej3Dia06;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ej03 {

	public static void main(String[] args) {

		ArrayList<Publicaciones> listaLibros = new ArrayList<Publicaciones>();
		ArrayList<Publicaciones> listaRevistas = new ArrayList<Publicaciones>();

		listaLibros.add(new Publicaciones("Libro1", LocalDate.parse("2015-07-12"), false));
		listaLibros.add(new Publicaciones("Libro2", LocalDate.parse("2016-05-17"), true));
		listaLibros.add(new Publicaciones("Libro3", LocalDate.parse("2020-12-22"), true));

		listaRevistas.add(new Publicaciones("Revista1", LocalDate.parse("2021-01-21"), true));
		listaRevistas.add(new Publicaciones("Revista2", LocalDate.parse("2020-10-29"), false));
		listaRevistas.add(new Publicaciones("Revista3", LocalDate.parse("2000-11-24"), true));

		System.out.println("---Lista Libros---");

		for (Publicaciones libro : listaLibros) {
			System.out.println("Titulo: " + libro.getTitulo());
			System.out.println("Fecha de publicación: " + libro.getFechaPublicaion());
			System.out.println("Prestado: " + ((libro.isPrestado()) ? "Si" : "No"));
			System.out.println();
		}

		System.out.println("Hay " + contarPrestados(listaLibros) + " libros prestados");
		System.out.println("Hay " + calcularCantPubli(listaLibros, 2002) + " libros publicados antes del año 2002");
		System.out.println();

		System.out.println("---Lista Revistas---");

		for (Publicaciones revista : listaRevistas) {
			System.out.println("Titulo: " + revista.getTitulo());
			System.out.println("Fecha de publicación: " + revista.getFechaPublicaion());
			System.out.println("Prestado: " + ((revista.isPrestado()) ? "Si" : "No"));
			System.out.println();
		}

		System.out.println("Hay " + contarPrestados(listaRevistas) + " revistas prestadas");
		System.out.println("Hay " + calcularCantPubli(listaRevistas, 2002) + " revistas publicadas antes del año 2002");
	}

	public static int contarPrestados(ArrayList<Publicaciones> listaPub) {
		int numPrestados = 0;

		// Recorre el array contando cuantos prestados hay
		for (Publicaciones publicacion : listaPub) {
			if (publicacion.isPrestado()) {
				numPrestados++;
			}
		}

		return numPrestados;
	}

	public static int calcularCantPubli(ArrayList<Publicaciones> listaPub, int ano) {
		int numPublicaciones = 0;

		// Reccorrer el array
		for (Publicaciones publicacion : listaPub) {
			if (publicacion.getFechaPublicaion().getYear() < ano) {
				numPublicaciones++;
			}
		}

		return numPublicaciones;
	}
}
