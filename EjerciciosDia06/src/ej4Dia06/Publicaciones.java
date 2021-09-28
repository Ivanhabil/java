package ej4Dia06;

import java.time.LocalDate;

public class Publicaciones implements MiInterfaz{

	private int codigo;
	private String titulo;
	private LocalDate fechaPublicaion;

	public Publicaciones(int codigo, String titulo, LocalDate fechaPublicaion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.fechaPublicaion = fechaPublicaion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	@Override
	public void prestar() {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void devolver() {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public boolean prestado() {
		return false;
	}

}
