package com.ucu.ut3.tp1;
import java.util.Stack;

import java.util.*;

public class PilasEjercicios 
{

    // 1. Simular una pila de platos: apilar y desapilar varios elementos.
    public void pilaDePlatos() 
    {
        Stack<String> platos = new Stack<>();
        platos.push("Plato 1");
        platos.push("Plato 2");
        platos.push("Plato 3");

        System.out.println("Pila de platos: " + platos);

        while (!platos.isEmpty()) {
            System.out.println("Sacando: " + platos.pop());
        }
    }

    // 2. Validar si una expresión tiene paréntesis balanceados
    public boolean parentesisBalanceados(String expresion) 
    {
        Stack<Character> pila = new Stack<>();

        for (char c : expresion.toCharArray()) 
        {
            if (c == '(') 
            {
                pila.push(c);
            } 
            else if (c == ')') 
            {
                if (pila.isEmpty()) 
                {
                	return false;
                }
                pila.pop();
            }
        }
        
        return pila.isEmpty();
    }

    // 3. Invertir una palabra utilizando una pila
    public String invertirPalabra(String palabra) 
    {
        Stack<Character> pila = new Stack<>();
        for (char c : palabra.toCharArray()) 
        {
            pila.push(c);
        }

        StringBuilder invertida = new StringBuilder();
        while (!pila.isEmpty()) 
        {
            invertida.append(pila.pop());
        }

        return invertida.toString();
    }

    // 4. Copiar una pila sin modificar la original
    public Stack<Integer> copiarPila(Stack<Integer> original) 
    {
        Stack<Integer> aux = new Stack<>();
        Stack<Integer> copia = new Stack<>();

        for (Integer n : original) 
        {
            aux.push(n);
        }

        for (Integer n : aux) 
        {
            copia.push(n);
        }

        return copia;
    }

    // 5. Contar cuántos elementos hay en una pila sin usar size()
    public int contarElementos(Stack<Integer> pila) 
    {
        Stack<Integer> aux = new Stack<>();
        int contador = 0;

        while (!pila.isEmpty()) 
        {
            aux.push(pila.pop());
            contador++;
        }

        while (!aux.isEmpty()) 
        {
            pila.push(aux.pop());
        }

        return contador;
    }



    public static void main(String[] args) {
        PilasEjercicios ejercicios = new PilasEjercicios();

        //Ejercicio 1
        ejercicios.pilaDePlatos();

        //Ejercicio 2
        String expr = "(a + b) * (c + d)";
        System.out.println("Paréntesis balanceados en '" + expr + ":" + ejercicios.parentesisBalanceados(expr));

        //Ejercicio 3
        String palabra = "hola";
        System.out.println(palabra + " invertida es: " + ejercicios.invertirPalabra(palabra));

        //Ejercicio 4
        Stack<Integer> numeros = new Stack<>();
        numeros.push(1);
        numeros.push(2);
        numeros.push(3);
        Stack<Integer> copia = ejercicios.copiarPila(numeros);
        System.out.println("Original: " +numeros + " Copia: " + copia);
 
        //Ejercicio 5
        int cantidad = ejercicios.contarElementos(numeros);
        System.out.println("Cantidad de elementos en pila: " + cantidad);
    }
}
