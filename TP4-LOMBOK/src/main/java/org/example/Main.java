package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear objetos Producto
        Producto prod1 = new Producto("P001", "Laptop", "TechCorp", 1200.0);
        Producto prod2 = new Producto("P002", "Mouse", "PeripheralsInc", 25.0);
        Producto prod3 = new Producto("P003", "Teclado", "PeripheralsInc", 40.0);

        // Crear objetos ProductoRecord usando los Productos
        ProductoRecord rec1 = new ProductoRecord(prod1.getCodigo(), prod1.getNombre(), prod1.getPrecio());
        ProductoRecord rec2 = new ProductoRecord(prod2.getCodigo(), prod2.getNombre(), prod2.getPrecio());
        ProductoRecord rec3 = new ProductoRecord(prod3.getCodigo(), prod3.getNombre(), prod3.getPrecio());

        // Guardarlos en una lista
        List<ProductoRecord> listaRecords = new ArrayList<>();
        listaRecords.add(rec1);
        listaRecords.add(rec2);
        listaRecords.add(rec3);

        // Mostrar la lista en consola
        for (ProductoRecord record : listaRecords) {
            System.out.println(record);
        }
    }
}
