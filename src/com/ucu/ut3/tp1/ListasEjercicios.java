package com.ucu.ut3.tp1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListasEjercicios 
{

//	1.	Agregar 10 números enteros a una ArrayList y mostrar solo los pares.

	public void imprimirPares (ArrayList<Integer> list)
	{
		for (int i = 0; i < list.size(); i++) 
		{
			if (list.get(i)%2 == 0)
			{
				System.out.print(list.get(i));
			}
		}			
	}
	
//	2.	Leer una lista de nombres e imprimirlos en orden inverso.
	public void ordenInverso (ArrayList<String> nombres)
	{
		List<String> nombres2= nombres.reversed();
		
		for(String nombre: nombres2)
		{
			System.out.println(nombre);
		}
		
	}
	
//	3.	Eliminar todos los elementos mayores a 50 de una ArrayList de enteros.
	public ArrayList<Integer> eliminarMayor50(ArrayList<Integer> numeros) {
	    for (int i = numeros.size() - 1; i >= 0; i--) {
	        if (numeros.get(i) > 50) {
	            numeros.remove(i);
	        }
	    }
	    return numeros;
	}
	
	
//	4.	Crear una ArrayList de strings y verificar si contiene una palabra específica.
	
	public Boolean contienePalabra(ArrayList<String> listaPalabras, String palabra)
	{
		for (int i = 0; i < listaPalabras.size(); i++) {
			if (listaPalabras.get(i).equals(palabra)) {
				return true;
			}
		}

		return false;
	}
	
//	5.	Sumar todos los elementos de una ArrayList de números flotantes.
	
	public float sumarElementos(ArrayList<Float> numeros) {
	    float suma = 0;
	    for (int i = 0; i < numeros.size(); i++) {
	        suma += numeros.get(i);
	    }
	    return suma;
	}


	public static void main(String[] args) 
	{
		ListasEjercicios ejercicios = new ListasEjercicios();
		
		//Ejercicio 1
		ArrayList<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(6);
		listaNumeros.add(8);
		listaNumeros.add(1);
		listaNumeros.add(2);
		listaNumeros.add(2);
		listaNumeros.add(3);
		listaNumeros.add(3);
		listaNumeros.add(2);
		listaNumeros.add(51);
		ejercicios.imprimirPares(listaNumeros);
		
		//Ejercicio 2
		
		ArrayList<String> listaNombres = new ArrayList<>();
		listaNombres.add("Carla");
		listaNombres.add("Carlos");
		listaNombres.add("Pablo");
		listaNombres.add("Avril");
		listaNombres.add("Agus");
		
		ejercicios.ordenInverso(listaNombres);

		//Ejercicio 3
		
		System.out.println("Lista antes de sacar los numeros: "+ listaNumeros);
		System.out.println("Lista sin n´´umeros mayores de 50: "+ ejercicios.eliminarMayor50(listaNumeros));
		
		//Ejercicio 4
		System.out.println("Lista de palabras "+ listaNombres);
		System.out.println("La lista contiene Carla?: "+ ejercicios.contienePalabra(listaNombres, "Carla"));
		System.out.println("La lista contiene Bob?: "+ ejercicios.contienePalabra(listaNombres, "Bob"));
		
		//Ejercicio 5
		ArrayList<Float> listaFloats = new ArrayList<>();
	    listaFloats.add(2.5f);
	    listaFloats.add(3.0f);
	    listaFloats.add(4.2f);

	    float resultado = ejercicios.sumarElementos(listaFloats);
	    System.out.println("La suma total es: " + resultado);

	}
}
