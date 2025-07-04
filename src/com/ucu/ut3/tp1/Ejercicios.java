package com.ucu.ut3.tp1;

public class Ejercicios {

    // Ejercicio 1 – Contar elementos pares
    // Implementar un método que recorra la lista y cuente cuántos nodos contienen
    // valores pares.
    // nombre del método: public int contarPares()

    public int contarPares(Nodo nodo) {

	int contador = 0;
	Nodo aux = nodo;

	while (aux != null) {
	    if (aux.getValor() % 2 == 0) {
		contador++;
	    }
	    aux = aux.getSiguiente();
	}

	return contador;
    }

    // Ejercicio 2 – Clonar la lista
    // Crear un método que devuelva una nueva lista con los mismos elementos que la
    // lista original, en el mismo orden.
    // nombre del método: public Lista clonarLista()

    public Nodo clonarLista(Nodo original) {
	if (original == null)
	    return null;

	Nodo nuevoInicio = new Nodo();
	nuevoInicio.setValor(original.getValor());

	Nodo actualOriginal = original.getSiguiente();
	Nodo actualNuevo = nuevoInicio;

	while (actualOriginal != null) {
	    Nodo nuevoNodo = new Nodo();
	    nuevoNodo.setValor(actualOriginal.getValor());
	    actualNuevo.setSiguiente(nuevoNodo);
	    actualNuevo = nuevoNodo;
	    actualOriginal = actualOriginal.getSiguiente();
	}

	return nuevoInicio;
    }

    // Ejercicio 3 – Invertir la lista
    // Crear un método que genere una nueva lista con los mismos valores pero en
    // orden inverso.
    // nombre del método: public Lista invertir()
    public Nodo invertirLista(Nodo original) {
	Nodo nuevoInicio = null;

	while (original != null) {
	    Nodo nuevoNodo = new Nodo();
	    nuevoNodo.setValor(original.getValor());
	    nuevoNodo.setSiguiente(nuevoInicio);
	    nuevoInicio = nuevoNodo;
	    original = original.getSiguiente();
	}

	return nuevoInicio;
    }

    // Ejercicio 4 –Sumar los valores en posiciones pares
    // Crear un método que sume los valores de los nodos ubicados en posiciones
    // pares (0, 2, 4, ...).
    // nombre del método: public int sumaPosicionesPares()

    public int sumaPosicionesPares(Nodo nodo) {
	int suma = 0;
	int posicion = 0;
	Nodo actual = nodo;

	while (actual != null) {
	    if (posicion % 2 == 0) {
		suma += actual.getValor();
	    }
	    actual = actual.getSiguiente();
	    posicion++;
	}

	return suma;
    }

    public static void main(String[] args) {
	Nodo nodo1 = new Nodo();
	nodo1.setValor(3);

	Nodo nodo2 = new Nodo();
	nodo2.setValor(8);
	nodo1.setSiguiente(nodo2);

	Nodo nodo3 = new Nodo();
	nodo3.setValor(14);
	nodo2.setSiguiente(nodo3);

	Ejercicios ejercicios = new Ejercicios();

	// Ejercicio 1
	int cantidadPares = ejercicios.contarPares(nodo1);
	System.out.println("Cantidad de valores pares: " + cantidadPares);

	// Ejercicio 2
	Nodo nuevo = ejercicios.clonarLista(nodo1);

	boolean resultado = true;

	Nodo copiaOriginal = nodo1;
	while (copiaOriginal != null && nuevo != null) {
	    if (copiaOriginal.getValor() != nuevo.getValor()) {
		resultado = false;
		break;
	    }
	    copiaOriginal = copiaOriginal.getSiguiente();
	    nuevo = nuevo.getSiguiente();
	}

	System.out.println("La primera lista es igual a la segunda?: " + resultado);

	// Ejercicio 3
	Nodo invertida = ejercicios.invertirLista(nodo1);
	System.out.println("Lista invertida: ");
	while (invertida != null) {
	    System.out.println(invertida.getValor() + " ");
	    invertida = invertida.getSiguiente();
	}

	// Ejercicio 4
	int sumaPares = ejercicios.sumaPosicionesPares(nodo1);
	System.out.println("Suma de valores en posiciones pares: " + sumaPares);

    }

}
