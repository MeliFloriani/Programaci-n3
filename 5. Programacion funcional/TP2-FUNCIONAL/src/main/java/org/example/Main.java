package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Producto> productos = Arrays.asList(
                new Producto("Notebook", "Tecnología", 250.0, 10),
                new Producto("Mouse", "Tecnología", 80.0, 25),
                new Producto("Silla Gamer", "Muebles", 300.0, 5),
                new Producto("Escritorio", "Muebles", 150.0, 7),
                new Producto("Auriculares", "Tecnología", 120.0, 15),
                new Producto("Cafetera", "Electrodomésticos", 90.0, 8),
                new Producto("Heladera", "Electrodomésticos", 600.0, 4)
        );

        // Listar productos con precio > 100, ordenados descendentemente por precio
        List<Producto> caros = productos.stream()
                .filter(p -> p.getPrecio() > 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .collect(Collectors.toList());

        System.out.println("1️⃣ Productos con precio > 100 (descendente):");
        caros.forEach(System.out::println);

        // Agrupar productos por categoría y calcular stock total
        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)
                ));

        System.out.println("\n2️⃣ Stock total por categoría:");
        stockPorCategoria.forEach((categoria, stockTotal) ->
                System.out.println(categoria + ": " + stockTotal));

        // Generar String con nombre y precio separados por ";"
        String productosTexto = productos.stream()
                .map(p -> p.getNombre() + " - $" + p.getPrecio())
                .collect(Collectors.joining("; "));

        System.out.println("\n3️⃣ String de productos:");
        System.out.println(productosTexto);

        // Calcular promedio general y por categoría
        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);

        System.out.println("\n4️⃣ Promedio general de precios: " + promedioGeneral);

        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)
                ));

        System.out.println("\nPromedio por categoría:");
        promedioPorCategoria.forEach((cat, prom) ->
                System.out.println(cat + ": " + prom));
    }
}
