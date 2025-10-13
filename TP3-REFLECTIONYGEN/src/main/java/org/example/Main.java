package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // Método genérico para imprimir listas
    public static <T> void imprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {

        // Lista de enteros
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(10);
        listaEnteros.add(20);
        listaEnteros.add(30);

        // Lista de cadenas
        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Hola");
        listaCadenas.add("Mundo");
        listaCadenas.add("Java");

        // Usar el método genérico
        System.out.println("Lista de enteros:");
        imprimirLista(listaEnteros);

        System.out.println("\nLista de cadenas:");
        imprimirLista(listaCadenas);
    }
}
