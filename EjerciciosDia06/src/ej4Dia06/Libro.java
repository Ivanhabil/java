package ej4Dia06;

import java.time.LocalDate;

public class Libro extends Publicaciones {

	private boolean prestado;

	public Libro(int codigo, String titulo, LocalDate fechaPublicaion, boolean prestado) {
		super(codigo, titulo, fechaPublicaion);
		this.prestado = prestado;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public void prestar() {
		prestado = true;
	}

	@Override
	public void devolver() {
		prestado = false;
	}

	@Override
	public boolean prestado() {
		if (prestado) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Libro [Prestado=" + prestado + ", Codigo=" + getCodigo() + ", Titulo=" + getTitulo()
				+ ", Fecha de publicaion=" + getFechaPublicaion() + "]";
	}

}
