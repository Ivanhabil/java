package ejGrupal3;

public class Directivo extends Empleado {

	private boolean socio;

	public Directivo() {
		super();
	}

	public Directivo(String nombre, String apellido1, String apellido2, String direccion, String email,
			String departamento, int telefono, double sueldo, boolean socio) {
		super(nombre, apellido1, apellido2, direccion, email, departamento, telefono, sueldo);
		this.socio = socio;
	}

	public boolean isSocio() {
		return socio;
	}

	public void setSocio(boolean socio) {
		this.socio = socio;
	}

	public void aumetarSueldo(double aumento) {
		this.setSueldo(this.getSueldo() * (1 * (aumento / 100)));
	}
}
