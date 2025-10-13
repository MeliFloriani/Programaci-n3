package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Obtener la clase Persona
            Class<Persona> clase = Persona.class;

            // Obtener e imprimir los constructores
            System.out.println("Constructores:");
            Constructor<?>[] constructores = clase.getDeclaredConstructors();
            for (Constructor<?> c : constructores) {
                System.out.println(c);
            }

            // Instanciar un objeto usando reflection
            Constructor<Persona> constructor = clase.getConstructor(String.class, int.class);
            Persona persona = constructor.newInstance("Meli", 24);

            //Modificar el valor de nombre en tiempo de ejecución
            Field campoNombre = clase.getDeclaredField("nombre");
            campoNombre.setAccessible(true);
            campoNombre.set(persona, "Flor");

            //Invocar un método que muestre la información de la persona
            Method mostrarInfo = clase.getMethod("mostrarInfo");
            mostrarInfo.invoke(persona);

            //Invocar el método privado saludar usando reflection
            Method saludar = clase.getDeclaredMethod("saludar");
            saludar.setAccessible(true);
            String saludo = (String) saludar.invoke(persona);
            System.out.println("Invocando saludar vía reflection: " + saludo);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

