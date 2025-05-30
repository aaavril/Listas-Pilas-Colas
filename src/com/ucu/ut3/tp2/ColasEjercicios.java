package com.ucu.ut3.tp2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class ColasEjercicios 
{
//	1. Simular una fila de personas en una caja usando Queue.

	public void filaCaja()
	{
		Queue<String> filaSuper = new LinkedList<>();
		
		System.out.println("La cola esta vacía" + filaSuper);
		filaSuper.add("Carlos");
		filaSuper.add("Maria");
		filaSuper.add("Pablito");
		

		System.out.print("Pacientes en espera por orden:");
		for (String consumidor: filaSuper)
		{
			System.out.print(consumidor);
		}
		
		while (!filaSuper.isEmpty())
		{
			String eliminado= filaSuper.poll();
			System.out.println("El paciente atendido fue: "+ eliminado);
		}

	}
	
//	2. Crear una cola de enteros y eliminar todos los múltiplos de 3.

	public Queue<Integer> sinMultiplosTres(Queue<Integer> numeros)
	{		
		Queue<Integer> numerosSin = new LinkedList<>();
		
		for (Integer numero: numeros)
		{
			if (!(numero%3 == 0))
			{
				numerosSin.add(numero);
			}
		}
		
		return numerosSin;
	}

//	3 Verificar si una palabra es palíndromo usando Queue y Stack.
	
	public Boolean esPalindromo(String palabra)
	{
		palabra = palabra.toLowerCase();
		Queue<Character> palabraQueue = new LinkedList<>();
		Stack<Character> palabraStack = new Stack<>();
		
		for(Character c: palabra.toCharArray())
		{
			palabraQueue.add(c);
			palabraStack.push(c);
		}
		
		while (!palabraQueue.isEmpty()&&!palabraStack.isEmpty())
		{
			if (palabraQueue.poll() != palabraStack.pop())
			{
				return false;
			}
		}
		
		return true;
			
	}
	
//	4. Implementar un sistema de turnos que encole y desencole pacientes.
	

	public void sistemaDeTurnos()
	{
		Queue<String> filaPacientes = new LinkedList<>();
		
		System.out.println("La cola esta vacía" + filaPacientes);
		filaPacientes.add("Carlos");
		filaPacientes.add("Maria");
		filaPacientes.add("Pablito");
		

		System.out.print("Pacientes en espera por orden:");
		for (String paciente: filaPacientes)
		{
			System.out.print(paciente);
		}
		
		while (!filaPacientes.isEmpty())
		{
			String eliminado= filaPacientes.remove();
			System.out.println("El paciente atendido fue: "+ eliminado);
		}

	}

//	5. Calcular el promedio de todos los valores en una cola sin perder los datos.
	
	public Double promedio(Queue<Integer> numeros)
	{
		Integer contador= 0;
		Integer total= 0;
		
		for(Integer num: numeros)
		{
			total += num;
			contador++;
		}
		
		return ((double)total/(double)contador);
	}
	

	public static void main(String[] args) 
	{
		ColasEjercicios ejercicios = new ColasEjercicios();
		
		//Ejercicio 1
		ejercicios.filaCaja();
		
		//Ejercicio 2
		Queue<Integer> numeros = new LinkedList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(6);
		numeros.add(8);
		numeros.add(9);

		
		System.out.println("Lista antes: "+numeros);
		
		System.out.println("Lista después: "+ ejercicios.sinMultiplosTres(numeros));
		
		//Ejercicio 3
		
		System.out.println("Resultado palabra anna: " + ejercicios.esPalindromo("anna"));
		System.out.println("Resultado palabra pablo: " + ejercicios.esPalindromo("pablo"));
		System.out.println("Resultado palabra Anna: " + ejercicios.esPalindromo("Anna"));


		//Ejercicio 4
		
		ejercicios.sistemaDeTurnos();
		
		//Ejercicio 5
		System.out.println("Queue: "+numeros);
		
		System.out.println("Resultado: "+ ejercicios.promedio(numeros));
		
		
	}

}
