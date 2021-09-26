package ej2Dia04;

import java.util.ArrayList;

public class Cliente {

	private String userName, userPassword;
	private ArrayList<Cuenta> cuentas;

	public Cliente() {
		super();
	}

	public Cliente(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}
	
	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public void listarCuentas(ArrayList<Cuenta> cuentas) {
		for (Cuenta cuenta : cuentas) {
			System.out.println("Número de cuenta: " + cuenta.getNumCuenta());
			System.out.println("Saldo: " + cuenta.getSaldo() + "€");
			System.out.println("Interés Anual: " + cuenta.getInteresAnual() + "%");
			System.out.println("");
		}
	}
}
