package ej6Dia04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import ej2Dia04.Cuenta;

public class Ej06 {
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Cliente> clienteList = new ArrayList<>();
	private static int numClientes = 0;

	public static void main(String[] args) {

		createAndAddCliente();

		System.out.println("---Lista de clientes---");
		for (Cliente cliente : clienteList) {
			System.out.println("Nombre: " + cliente.getNombre());
			System.out.println("Apellido: " + cliente.getApellido());
			System.out.println("Email: " + cliente.getEmail());
			System.out.println("Teléfono: " + cliente.getTelefono());
			System.out.println("");
		}
		
		System.out.println("¿Quiere añadir más cliente?");
		System.out.println("1-Si");
		System.out.println("2-No");
		int opcion = scanner.nextInt();
		
		if (opcion == 1) {
			System.out.println("");
			createAndAddCliente();
		}	
	}

	private static void createAndAddCliente() {
		do {
			System.out.println("Cuantos clientes quiere añadir(no más de 10): ");
			numClientes = scanner.nextInt();
			System.out.println("");
		} while (numClientes > 10);

		for (int i = 0; i < numClientes; i++) {
			Cliente cliente = new Cliente();
			System.out.println("---Datos del cliente---");
			System.out.println("Introduce el nombre:");
			cliente.setNombre(scanner.next());

			System.out.println("Introduce el apellido:");
			cliente.setApellido(scanner.next());

			System.out.println("Introduce el email:");
			cliente.setEmail(scanner.next());

			System.out.println("Introduce el telefono:");
			cliente.setTelefono(scanner.nextInt());

			System.out.println("");
			clienteList.add(cliente);
		}
	}
}
