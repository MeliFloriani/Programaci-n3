package Meliot.Ejercicio_SpringBoot_Cursos.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCurso;

    // Relación con Profesor

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "profesor_id")
    @EqualsAndHashCode.Exclude
    private Profesor profesor;

    // Relación con Estudiante

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "curso_estudiante",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "estudiante_id")
    )
    @EqualsAndHashCode.Exclude
    private Set<Estudiante> estudiantes = new HashSet<>();

    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }
}