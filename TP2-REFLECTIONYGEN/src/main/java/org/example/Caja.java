package org.example;

public class Caja<T> {
    private T contenido;

    // Constructor vacío
    public Caja() {}

    // Constructor con contenido
    public Caja(T contenido) {
        this.contenido = contenido;
    }

    // Getter
    public T getContenido() {
        return contenido;
    }

    // Setter
    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Caja{" +
                "contenido=" + contenido +
                '}';
    }
}

