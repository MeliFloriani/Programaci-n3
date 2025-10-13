package org.example;

public class Persona {
    private String nombre;
    private int edad;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    private String saludar() {
        return "Hola";
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

