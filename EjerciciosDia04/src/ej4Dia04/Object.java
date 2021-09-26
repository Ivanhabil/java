package ej4Dia04;

public class Object {
	// Atributos de clase
	private String id;
	private float memorySize;

	// Constructor sin parámetros
	public Object() {

	}

	// Constructor con parámetros
	public Object(String id, float memorySize) {
		super();
		this.id = id;
		this.memorySize = memorySize;
	}

	// Getters y setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(float memorySize) {
		this.memorySize = memorySize;
	}

	//Método de instancia
	private void mostrarAtributos() {
		System.out.println("Id: " + this.id);
		System.out.println("Tamaño ocupado en memoria: " + this.memorySize);
	}

}
