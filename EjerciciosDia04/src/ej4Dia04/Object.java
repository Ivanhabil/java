package ej4Dia04;

public class Object {
	// Atributos de clase
	private String id;
	private float memorySize;

	// Constructor sin par�metros
	public Object() {

	}

	// Constructor con par�metros
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

	//M�todo de instancia
	private void mostrarAtributos() {
		System.out.println("Id: " + this.id);
		System.out.println("Tama�o ocupado en memoria: " + this.memorySize);
	}

}
