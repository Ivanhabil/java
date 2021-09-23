package ejercicios;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {

		int[] nums = new int[10];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduce un numero: ");
			int num = scanner.nextInt();
			nums[i] = num;
		}

		for (int i = 0; i < nums.length/2; i++) {

			System.out.println(nums[i]);
			System.out.println(nums[nums.length -1 - i]);
		}
	}

}
