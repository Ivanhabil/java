package ej1Dia04;

public class Ej01 {

	public static void main(String[] args) {

		int resultado = Ej01.sumar(8);
		System.out.println(resultado);
	}

	public static int sumar(int num) { // Sumar entre 7 y 15
		if (num > 7 && num < 15) {
			return num + sumar(num + 1);
		} else {
			return 0;
		}
	}

}
