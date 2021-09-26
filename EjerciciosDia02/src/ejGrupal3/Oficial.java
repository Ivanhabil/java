package ejGrupal3;

public class Oficial extends Operario{
	private int nivel;

	public Oficial() {
		super();
		// TODO Esbozo de constructor generado automáticamente
	}

	public Oficial(String nombre, String apellido1, String apellido2, String direccion, String email,
			String departamento, int telefono, double sueldo, int grado, int nivel) {
		super(nombre, apellido1, apellido2, direccion, email, departamento, telefono, sueldo, grado);
		this.nivel = nivel;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
}
