package org.example;

public class Producto {
    private String codigo;
    private String nombre;
    private String proveedor;
    private double precio;

    // Constructor
    public Producto(String codigo, String nombre, String proveedor, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.precio = precio;
    }

    // Getters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getProveedor() { return proveedor; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", proveedor='" + proveedor + '\'' +
                ", precio=" + precio +
                '}';
    }
}

