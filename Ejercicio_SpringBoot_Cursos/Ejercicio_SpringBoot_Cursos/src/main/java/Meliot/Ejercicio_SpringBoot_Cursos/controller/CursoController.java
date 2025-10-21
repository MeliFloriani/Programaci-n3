package Meliot.Ejercicio_SpringBoot_Cursos.controller;

import Meliot.Ejercicio_SpringBoot_Cursos.model.Curso;
import Meliot.Ejercicio_SpringBoot_Cursos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Meliot.Ejercicio_SpringBoot_Cursos.dto.CursoEstudianteDTO;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cursos") // URL base

public class CursoController {

    private final CursoService cursoService;

    @Autowired
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    // Listar cursos --> GET /api/cursos

    @GetMapping
    public ResponseEntity<List<Curso>> listarCursos() {
        List<Curso> cursos = cursoService.listarTodos();
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }

    // Crear nuevos cursos con su profesor --> POST /api/cursos?profesorId={id}

    @PostMapping
    public ResponseEntity<Curso> crearCurso(
            @RequestBody Curso curso,
            @RequestParam Long profesorId) {

        Optional<Curso> nuevoCursoOpt = cursoService.crearCurso(curso, profesorId);

        if (nuevoCursoOpt.isPresent()) {
            return new ResponseEntity<>(nuevoCursoOpt.get(), HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    // Asignar estudiantes a un curso --> PUT /api/cursos/{cursoId}/estudiantes/{estudianteId}

    @PutMapping("/{cursoId}/estudiantes/{estudianteId}")
    public ResponseEntity<String> asignarEstudianteACurso(
            @PathVariable Long cursoId,
            @PathVariable Long estudianteId) {

        boolean asignado = cursoService.asignarEstudianteACurso(cursoId, estudianteId);

        if (asignado) {
            return new ResponseEntity<>("Estudiante asignado exitosamente.", HttpStatus.OK);
        } else {

            return new ResponseEntity<>("Error: Curso o Estudiante no encontrado.", HttpStatus.NOT_FOUND);
        }
    }

    // Devolver la lista de cursos en los que esta un estudiante --> GET /api/cursos/estudiante/{estudianteId}

    @GetMapping("/estudiante/{estudianteId}")
    public ResponseEntity<List<CursoEstudianteDTO>> listarCursosPorEstudiante(@PathVariable Long estudianteId) {
        List<CursoEstudianteDTO> cursos = cursoService.buscarCursosPorEstudiante(estudianteId);
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }
}