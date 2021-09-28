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

			InterfazOperacion sumaInterfaz = (x, y) -> (x + y);
			float suma = sumaInterfaz.operar(num1, num2);
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

					suma = sumaInterfaz.operar(suma, otroNum);
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

			InterfazOperacion restaInterfaz = (x, y) -> (x - y);
			float resta = restaInterfaz.operar(num1, num2);
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

					resta = restaInterfaz.operar(resta, otroNum);
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

			InterfazOperacion divisionInterfaz = (x, y) -> (x / y);
			try {
				division = divisionInterfaz.operar(num1, num2);
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
						division = divisionInterfaz.operar(division, otroNum);
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

			InterfazOperacion multiInterfaz = (x, y) -> (x / y);
			float multi = multiInterfaz.operar(num1, num2);
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

					multi = multiInterfaz.operar(multi, otroNum);
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
