package ej5Dia06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Pila implements ColeccionInterfaz {

	private ArrayList<Object> objetos;
	private int sizeInicial;
	private int contadorElem;

	public Pila(int sizeInicial) {
		super();
		objetos = new ArrayList<Object>();
		this.sizeInicial = sizeInicial;
	}

	public static void main(String[] args) {

		Pila pila = new Pila(10);

		System.out.println("Está vacía?: " + (pila.isVacia() ? "Si" : "No"));
		System.out.println("Añadir(push): " + (pila.anadir(1) ? "Elemento añadido" : "Array completo"));
		System.out.println("Añadir(push): " + (pila.anadir(2) ? "Elemento añadido" : "Array completo"));
		System.out.println("Añadir(push): " + (pila.anadir(3) ? "Elemento añadido" : "Array completo"));
		System.out.println("Añadir(push): " + (pila.anadir(4) ? "Elemento añadido" : "Array completo"));
		System.out.println("Añadir(push): " + (pila.anadir(5) ? "Elemento añadido" : "Array completo"));
		System.out.println("Está vacía?: " + (pila.isVacia() ? "Si" : "No"));
		System.out.println("Devolver primero: " + pila.devolverPrimero());
		System.out.println("Devolver primero y eliminarlo(pop + guardar): " + pila.devolverEliminarPrimero());

		Iterator<Object> iter = pila.getObjetos().iterator();

		String pilaCadena = "";

		while (iter.hasNext()) {
			pilaCadena += iter.next() + " ";
		}

		System.out.println(pilaCadena);

	}

	public ArrayList<Object> getObjetos() {
		return objetos;
	}

	@Override
	public boolean anadir(Object element) {
		if (contadorElem >= sizeInicial) {
			return false;
		} else {
			objetos.add(element);
			contadorElem++;
			return true;
		}
	}

	@Override
	public boolean isVacia() {
		if (this.contadorElem == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object devolverEliminarPrimero() {
		if (this.isVacia()) {
			throw new NoSuchElementException();
		} else {
			Object elemEliminado = objetos.get(contadorElem - 1);
			objetos.remove(contadorElem - 1);
			contadorElem--;
			return elemEliminado;
		}
	}

	@Override
	public Object devolverPrimero() {
		if (this.isVacia()) {
			throw new NoSuchElementException();
		} else {
			return objetos.get(contadorElem - 1);
		}
	}

}
