package Meliot.Ejercicio_SpringBoot_Cursos.controller;

import Meliot.Ejercicio_SpringBoot_Cursos.model.Estudiante;
import Meliot.Ejercicio_SpringBoot_Cursos.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes") // URL base
public class EstudianteController {

    private final EstudianteService estudianteService;

    @Autowired
    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    // Listar estudiantes --> GET /api/estudiantes
    @GetMapping
    public ResponseEntity<List<Estudiante>> listarEstudiantes() {
        List<Estudiante> estudiantes = estudianteService.listarTodos();
        return new ResponseEntity<>(estudiantes, HttpStatus.OK);
    }

    // Crear estudiantes --> POST /api/estudiantes
    @PostMapping
    public ResponseEntity<Estudiante> crearEstudiante(@RequestBody Estudiante estudiante) {
        Estudiante nuevoEstudiante = estudianteService.crearEstudiante(estudiante);
        return new ResponseEntity<>(nuevoEstudiante, HttpStatus.CREATED);
    }
}
