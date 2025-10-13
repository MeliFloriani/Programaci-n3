package org.example;

public class Main {
    public static void main(String[] args) {
        // Usando el constructor lleno
        Persona persona1 = new Persona("Meli", 24);

        // Usando el constructor vacío
        Persona persona2 = new Persona();
        persona2.setNombre("Juan");
        persona2.setEdad(30);

        // Mostrar atributos en consola
        System.out.println("Persona 1: " + persona1.getNombre() + ", " + persona1.getEdad() + " años");
        System.out.println("Persona 2: " + persona2.getNombre() + ", " + persona2.getEdad() + " años");
    }
}

