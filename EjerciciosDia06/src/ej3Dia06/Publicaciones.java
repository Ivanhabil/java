package ej3Dia06;

import java.time.LocalDate;

public class Publicaciones {

	private String titulo;
	private LocalDate fechaPublicaion;
	private boolean prestado;

	public Publicaciones(String titulo, LocalDate fechaPublicaion, boolean prestado) {
		super();
		this.titulo = titulo;
		this.fechaPublicaion = fechaPublicaion;
		this.prestado = prestado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFechaPublicaion() {
		return fechaPublicaion;
	}

	public void setFechaPublicaion(LocalDate fechaPublicaion) {
		this.fechaPublicaion = fechaPublicaion;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

}
