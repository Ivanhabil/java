package ej5Dia04;

public class Trabajador implements Persona {

	private String nombre;

	public Trabajador(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Métodos implementados y sobreescritos de la interfaz
	@Override
	public void comer() {
		System.out.println("El trabajador" + this.getNombre() + "come");
	}

	@Override
	public void beber() {
		System.out.println("El trabajador" + this.getNombre() + "bebe");
	}

	@Override
	public void dormir() {
		System.out.println("El trabajador" + this.getNombre() + "duerme");
	}

}
