package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Crear objetos Producto
        Producto p1 = new Producto(101, "Libro Java", 1500.0, "Juan Pérez");
        Producto p2 = new Producto(102, "Curso Python", 2000.0, "Ana López");

        // Crear objetos ProductoDTO usando getters y setters de Producto
        ProductoDTO dto1 = new ProductoDTO();
        dto1.setCodigo(p1.getCodigo());
        dto1.setNombre(p1.getNombre());
        dto1.setPrecio(p1.getPrecio());

        ProductoDTO dto2 = new ProductoDTO();
        dto2.setCodigo(p2.getCodigo());
        dto2.setNombre(p2.getNombre());
        dto2.setPrecio(p2.getPrecio());

        // Guardar en una lista
        List<ProductoDTO> listaDTO = new ArrayList<>();
        listaDTO.add(dto1);
        listaDTO.add(dto2);

        // Mostrar la lista en consola
        for (ProductoDTO dto : listaDTO) {
            System.out.println(dto);
        }
    }
}
