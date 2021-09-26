package ejGrupal1;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {

		// Ejercicio 01
		Scanner scanner = new Scanner(System.in);
		String adminUsername = "admin", adminPassword = "123";
		String userUsername = "user", userPassword = "123";
		String user, password, tipo;

		Cuenta cuenta1 = new Cuenta(230, "Pepe", 5000, 15);

		System.out.println("Introduce el usuario:");
		user = scanner.nextLine();

		System.out.println("Introduce la contraseña:");
		password = scanner.nextLine();
		// TODO: añadir un do while para el usuario y la contraseña

		int opcion;

		if (user.equals("admin") && password.equals("123")) {
			do {
				System.out.println("");
				System.out.println("*****Menu Administrador*****");
				System.out.println("1-Número de cuenta");
				System.out.println("2-Titular de la cuenta");
				System.out.println("3-Saldo de la cuenta");
				System.out.println("4-Interés anual de la cuenta");
				System.out.println("5-Salir");
				opcion = scanner.nextInt();

				switch (opcion) {
				case 1:
					System.out.println("Número de la cuenta: " + cuenta1.getNumCuenta());
					break;
				case 2:
					System.out.println("Titular de la cuenta: " + cuenta1.getNombreTitular());
					break;
				case 3:
					System.out.println("Saldo de la cuenta: " + cuenta1.getSaldo() + "€");
					break;
				case 4:
					System.out.println("Interés anual de la cuenta: " + cuenta1.getInteresAnual() + "%");
					break;
				case 5:
					System.out.println("Gracias " + cuenta1.getNombreTitular() + " por confiar en nosotros");
					break;
				default:
					System.out.println("No has elegido una opcion correcta. Vuelve a intentarlo");
				}
			} while (opcion != 5);

		} else if (user.equals("user") && password.equals("123")) {
			do {
				System.out.println("*****Menu Cliente*****");
				System.out.println("1-Depositar");
				System.out.println("2-Retirar");
				System.out.println("3-Consultar saldo");
				System.out.println("4-Convertir moneda de Euro a Dolar");
				System.out.println("5-Salir");
				opcion = scanner.nextInt();

				switch (opcion) {
				case 1:
					cuenta1.depositar();
					break;
				case 2:
					cuenta1.retirar();
					break;
				case 3:
					System.out.println("Su saldo actual es " + cuenta1.getSaldo() + "€");
					break;
				case 4:
					cuenta1.conversion();
					break;
				case 5:
					System.out.println("Gracias " + cuenta1.getNombreTitular() + " por confiar en nosotros");
					break;
				default:
					System.out.println("No has elegido una opcion correcta. Vuelve a intentarlo");
				}

			} while (opcion != 5);
		} else {
			System.out.println("Usuario o contraseña incorrectas");
		}
	}
}
