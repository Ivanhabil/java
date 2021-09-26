package ejGrupal3;

public class Tecnico extends Operario{

	private String especialidad;

	public Tecnico() {
		super();
		// TODO Esbozo de constructor generado automáticamente
	}

	public Tecnico(String nombre, String apellido1, String apellido2, String direccion, String email,
			String departamento, int telefono, double sueldo, int grado, String especialidad) {
		super(nombre, apellido1, apellido2, direccion, email, departamento, telefono, sueldo, grado);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
}
