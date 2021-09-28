package ejDia27Sep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// Ej con operaciones lambda
	// Crear una interfaz con los métodos básicos: sumar, restar,
	// dividir y multi y un Main con un menu de seleccion de la
	// operacion, y despues se piden los numero con los que se van
	// a realizar operaciones (al menos 2) clase operaciones
	// con metodos implememntados de la interfaz los métodos de
	// opraciones seran los que llamemos para realizar las cuentas
	// en el main.
	// Implementar try-catch para manejar excepciones

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Operacion operaciones = new Operacion();
		
		int opcion = 0;
		float num1, num2;

		do {
			System.out.println("¿Qué quiere hacer?");
			System.out.println("1-Sumar");
			System.out.println("2-Restar");
			System.out.println("3-Dividir");
			System.out.println("4-Multiplicar");
			System.out.println("5-Salir");
			try {
				opcion = scanner.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("No ha introducido un número entero. Por fovar, vuelva a intentarlo");
			}
			
		} while (opcion < 1 || opcion > 5);

		switch (opcion) {
		case 1:
			System.out.println("Introduce el primer número:");
			num1 = scanner.nextFloat();

			System.out.println("Introduce el segundo número:");
			num2 = scanner.nextFloat();

			System.out.println();

			float suma = operaciones.sumar(num1, num2);
			System.out.println("Suma: " + suma);

			do {
				System.out.println("¿Quieres sumar otro número a la suma anterior?:");
				System.out.println("1-Si");
				System.out.println("2-No");
				System.out.println();
				opcion = scanner.nextInt();

				if (opcion == 1) {
					System.out.println("Introduce el número:");
					float otroNum = scanner.nextFloat();

					suma = operaciones.sumar(suma, otroNum);
					System.out.println("Suma: " + suma);
				}
			} while (opcion != 2);

			break;
		case 2:
			System.out.println("Introduce el primer número:");
			num1 = scanner.nextFloat();

			System.out.println("Introduce el segundo número:");
			num2 = scanner.nextFloat();

			System.out.println();

			float resta = operaciones.restar(num1, num2);
			System.out.println("Resta: " + resta);

			do {
				System.out.println("¿Quieres restar otro número a la resta anterior?:");
				System.out.println("1-Si");
				System.out.println("2-No");
				System.out.println();
				opcion = scanner.nextInt();

				if (opcion == 1) {
					System.out.println("Introduce el número:");
					float otroNum = scanner.nextFloat();

					resta = operaciones.restar(resta, otroNum);
					System.out.println("Resta: " + resta);
				}
			} while (opcion != 2);
			break;
		case 3:
			float division = 0;
			System.out.println("Introduce el primer número:");
			num1 = scanner.nextFloat();

			System.out.println("Introduce el segundo número:");
			num2 = scanner.nextFloat();

			System.out.println();

			try {
				division = operaciones.dividir(num1, num2);
			} catch (ArithmeticException e) {
				System.out.println("Error: No se puede dividir un numero entre cero");
			}
			System.out.println("Division: " + division);

			do {
				System.out.println("¿Quieres dividir otro número a la division anterior?:");
				System.out.println("1-Si");
				System.out.println("2-No");
				System.out.println();
				opcion = scanner.nextInt();

				if (opcion == 1) {
					System.out.println("Introduce el número:");
					float otroNum = scanner.nextFloat();
					try {
						division = operaciones.dividir(division, otroNum);
					} catch (ArithmeticException e) {
						System.out.println("Error: No se puede dividir un numero entre cero");
					}
					
					System.out.println("Division: " + division);
				}
			} while (opcion != 2);
			break;
		case 4:
			System.out.println("Introduce el primer número:");
			num1 = scanner.nextFloat();

			System.out.println("Introduce el segundo número:");
			num2 = scanner.nextFloat();

			System.out.println();

			float multi = operaciones.multiplicar(num1, num2);
			System.out.println("Division: " + multi);

			do {
				System.out.println("¿Quieres multiplicar otro número a la multiplicaion anterior?:");
				System.out.println("1-Si");
				System.out.println("2-No");
				System.out.println();
				opcion = scanner.nextInt();

				if (opcion == 1) {
					System.out.println("Introduce el número:");
					float otroNum = scanner.nextFloat();

					multi = operaciones.multiplicar(multi, otroNum);
					System.out.println("Multiplicacion: " + multi);
				}
			} while (opcion != 2);
			break;
		case 5:
			System.out.println("Hasta pronto!");
			break;
		}
	}

}
