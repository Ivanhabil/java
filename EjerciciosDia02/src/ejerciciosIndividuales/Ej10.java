package ejerciciosIndividuales;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {

		// Ejercicio 08
		Scanner scanner = new Scanner(System.in);
		String usuarioGuardado = "Ivan", passwordGuardada = "123", user = "", password = "";

		System.out.println("Introduce el usuario:");
		user = scanner.nextLine();

		System.out.println("Introduce la contraseña:");
		password = scanner.nextLine();

		if (usuarioGuardado.equals(user) && passwordGuardada.equals(password)) {
			System.out.println("Cambiar clave");
			System.out.println("Introduzca la nueva clave:");
			passwordGuardada = scanner.nextLine();
			System.out.println("Clave cambiada con éxito");
		}
	}
}
