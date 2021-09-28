package ejDia27Sep;

public class Operacion implements InterfazOperacion {

	public float sumar(float n, float m) {
		InterfazOperacion expresion = (x, y) -> (x + y);
		return expresion.operar(n, m);
	}

	public float restar(float n, float m) {
		InterfazOperacion expresion = (x, y) -> (x - y);
		return expresion.operar(n, m);
	}

	public float dividir(float n, float m) {
		InterfazOperacion expresion = (x, y) -> (x / y);
		return expresion.operar(n, m);
	}

	public float multiplicar(float n, float m) {
		InterfazOperacion expresion = (x, y) -> (x * y);
		return expresion.operar(n, m);
	}

	@Override
	public float operar(float n, float m) {
		return 0;
	}

}
