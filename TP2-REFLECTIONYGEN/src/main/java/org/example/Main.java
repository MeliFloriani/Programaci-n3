package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Caja<String> cajaString = new Caja<>("Hola Mundo");
        System.out.println(cajaString);
        System.out.println("Contenido: " + cajaString.getContenido());

        Caja<Integer> cajaInteger = new Caja<>(123);
        System.out.println(cajaInteger);
        System.out.println("Contenido: " + cajaInteger.getContenido());

        List lista = new ArrayList(); // sin genéricos
        lista.add("Texto");
        lista.add(456); // se puede mezclar tipos
        lista.add(3.14);

        System.out.println("Lista sin genéricos: " + lista);
        
        String primerElemento = (String) lista.get(0);
        System.out.println("Primer elemento casteado: " + primerElemento);


    }
}
