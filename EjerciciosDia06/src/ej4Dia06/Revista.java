package ej4Dia06;

import java.time.LocalDate;

public class Revista extends Publicaciones {

	private int numero;

	public Revista(int codigo, String titulo, LocalDate fechaPublicaion, int numero) {
		super(codigo, titulo, fechaPublicaion);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Revista [Numero=" + numero + ", Codigo=" + getCodigo() + ", Titulo=" + getTitulo()
				+ ", Fecha de publicaion=" + getFechaPublicaion() + "]";
	}

}
