package Meliot.Ejercicio_SpringBoot_Cursos.controller;

import Meliot.Ejercicio_SpringBoot_Cursos.model.Profesor;
import Meliot.Ejercicio_SpringBoot_Cursos.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesores") // URL base: http://localhost:8080/api/profesores
public class ProfesorController {

    private final ProfesorService profesorService;

    @Autowired
    public ProfesorController(ProfesorService profesorService) {
        this.profesorService = profesorService;
    }

    // Listar profesores --> GET /api/profesores
    @GetMapping
    public ResponseEntity<List<Profesor>> listarProfesores() {
        List<Profesor> profesores = profesorService.listarTodos();
        return new ResponseEntity<>(profesores, HttpStatus.OK);
    }

    // Crear profesores --> POST /api/profesores
    @PostMapping
    public ResponseEntity<Profesor> crearProfesor(@RequestBody Profesor profesor) {
        Profesor nuevoProfesor = profesorService.crearProfesor(profesor);

        return new ResponseEntity<>(nuevoProfesor, HttpStatus.CREATED);
    }
}