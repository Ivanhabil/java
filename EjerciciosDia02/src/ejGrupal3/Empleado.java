package ejGrupal3;

public class Empleado {
	
	private String nombre, apellido1, apellido2, direccion, email, departamento;
	private int telefono;
	private double sueldo;
	
	public Empleado() {
		// TODO Esbozo de constructor generado automáticamente
	}

	public Empleado(String nombre, String apellido1, String apellido2, String direccion, String email,
			String departamento, int telefono, double sueldo) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.email = email;
		this.departamento = departamento;
		this.telefono = telefono;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
}
