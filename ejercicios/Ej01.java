package ejercicios;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {

		int[] nums = new int[7];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduce un numero: ");
			int num = scanner.nextInt();
			nums[i] = num;
		}
		
		System.out.println("");
		System.out.println("N�meros introducidos: ");
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
