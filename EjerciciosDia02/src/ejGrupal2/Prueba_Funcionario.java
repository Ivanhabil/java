package ejGrupal2;

public class Prueba_Funcionario {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario("66666666D", 
				"Arturo Pérez Reverte", "C/Arboleda", "20/5/1970",
				40500.50);
		
		System.out.println(funcionario1.getAtributos());
	}

}
