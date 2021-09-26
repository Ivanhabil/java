package ejGrupal3;

public class Operario extends Empleado {

	private int grado;

	public Operario() {
		super();
		// TODO Esbozo de constructor generado automáticamente
	}

	public Operario(String nombre, String apellido1, String apellido2, String direccion, String email,
			String departamento, int telefono, double sueldo, int grado) {
		super(nombre, apellido1, apellido2, direccion, email, departamento, telefono, sueldo);
		this.grado = grado;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public void getInfoContacto() {
		System.out.println("Tlf: " + this.getTelefono());
		System.out.println("Email: " + this.getEmail());
	}
}
