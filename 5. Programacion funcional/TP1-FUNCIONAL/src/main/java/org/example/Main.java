package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Alumno> alumnos = Arrays.asList(
                new Alumno("Meli", 8.5, "Matemática"),
                new Alumno("Juan", 6.0, "Física"),
                new Alumno("Ana", 9.0, "Matemática"),
                new Alumno("Pedro", 7.5, "Física"),
                new Alumno("Lucía", 10.0, "Química"),
                new Alumno("Sofía", 5.5, "Química")
        );

        // Obtener nombres de aprobados (nota >=7) en mayúsculas y ordenados
        List<String> aprobados = alumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Alumnos aprobados en mayúsculas y ordenados: " + aprobados);

        // Calcular promedio general de notas
        double promedio = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0.0);

        System.out.println("Promedio general: " + promedio);

        // Agrupar alumnos por curso
        Map<String, List<Alumno>> porCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));

        System.out.println("Alumnos por curso: " + porCurso);

        // Obtener los 3 mejores promedios
        List<Alumno> top3 = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Top 3 alumnos: " + top3);
    }
}
