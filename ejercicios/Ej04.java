package ejercicios;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.out.println("Introduce un numero: ");
			int num = scanner.nextInt();
			nums[i] = num;
		}

		int ultimo = nums[9];
		
		for (int i = 8; i  >= 0; i--) {
			nums[i+1] = nums[i];
		}
		
		nums[0] = ultimo;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}
