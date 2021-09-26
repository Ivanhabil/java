package ejGrupal2;

public class Funcionario {
	private String dni, nombreApellidos, domicilio, fechaNacimeinto;
	private double sueldoBruto;

	public Funcionario() {

	}

	public Funcionario(String dni, String nombreApellidos, String domicilio, String fechaNacimeinto,
			double sueldoBruto) {
		this.dni = dni;
		this.nombreApellidos = nombreApellidos;
		this.domicilio = domicilio;
		this.fechaNacimeinto = fechaNacimeinto;
		this.sueldoBruto = sueldoBruto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreApellidos() {
		return nombreApellidos;
	}

	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getFechaNacimeinto() {
		return fechaNacimeinto;
	}

	public void setFechaNacimeinto(String fechaNacimeinto) {
		this.fechaNacimeinto = fechaNacimeinto;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public String getAtributos() {
		return this.dni + "," + this.nombreApellidos + "," + this.fechaNacimeinto + "," + this.sueldoBruto;

	}
}
