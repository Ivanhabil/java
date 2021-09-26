package ej2Dia04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String user, password;
		Cliente clienteLogin = new Cliente();

		boolean isLogged = false; // Condicinal de inicio de sesion

		List<Cliente> clienteList = new ArrayList<Cliente>(); // Lista cliente
		clienteList.add(new Cliente("Pepe", "123"));
		clienteList.add(new Cliente("Lucia", "123"));
		clienteList.add(new Cliente("Juana", "123"));

		do {
			System.out.println("*****Menu Inicio*****"); // Menu cliente
			System.out.println("Introduce el usuario:");
			user = scanner.nextLine();
			System.out.println("Introduce la contraseña:");
			password = scanner.nextLine();

			for (Cliente cliente : clienteList) { // Checkeo de datos de inicio con datos de la lista de clientes
				if (cliente.getUserName().equals(user) && cliente.getUserPassword().equals(password)) {
					isLogged = true;
					clienteLogin = cliente;
					break;
				}
			}
			if (isLogged == false) {
				System.out.println("Los datos introducidos no coinciden con ningun cliente\n");
			}
		} while (isLogged == false);

		if (isLogged)
			displayMenu(clienteLogin);
	}

	private static void displayMenu(Cliente cliente) {
		int opcion = 0;
		ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
		
		System.out.println("\nBienvenid@ " + cliente.getUserName());
		do {
			System.out.println("*****Menu Cliente*****");
			System.out.println("1-Crear una cuenta");
			System.out.println("2-Listar mis cuenta");
			System.out.println("3-Salir");
			System.out.println("");
			opcion = scanner.nextInt();
			System.out.println("");

			switch (opcion) {
			case 1:
				Cuenta cuenta = new Cuenta();

				System.out.println("Introduce el número de cuenta:");
				cuenta.setNumCuenta(scanner.nextInt()); 

				cuenta.setNombreTitular(cliente.getUserName());

				System.out.println("Introduce el saldo:");
				cuenta.setSaldo(scanner.nextDouble());

				System.out.println("Introduce el interes %:");
				cuenta.setInteresAnual(scanner.nextDouble()); 

				System.out.println("---Cuenta creada con exito---");
				System.out.println("");
				
				cuentas.add(cuenta);
				cliente.setCuentas(cuentas); 
				break;
			case 2:
				System.out.println("-----Cuentas-----");
				cliente.listarCuentas(cuentas);
				break;
			case 3:
				System.out.println("\nGracias. Hasta pronto!");
				break;
			default:
				System.out.println("No has elegido una opcion correcta. Vuelve a intentarlo");
			}
		} while (opcion != 3);
	}
}
