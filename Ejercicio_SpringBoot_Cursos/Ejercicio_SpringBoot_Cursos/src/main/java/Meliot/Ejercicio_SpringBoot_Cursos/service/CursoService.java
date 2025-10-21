package Meliot.Ejercicio_SpringBoot_Cursos.service;

import Meliot.Ejercicio_SpringBoot_Cursos.model.Curso;
import Meliot.Ejercicio_SpringBoot_Cursos.model.Profesor;
import Meliot.Ejercicio_SpringBoot_Cursos.model.Estudiante;
import Meliot.Ejercicio_SpringBoot_Cursos.repository.CursoRepository;
import Meliot.Ejercicio_SpringBoot_Cursos.repository.ProfesorRepository;
import Meliot.Ejercicio_SpringBoot_Cursos.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.stream.Collectors;
import Meliot.Ejercicio_SpringBoot_Cursos.dto.CursoEstudianteDTO;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;
    private final ProfesorRepository profesorRepository;
    private final EstudianteRepository estudianteRepository;

    @Autowired
    public CursoService(
            CursoRepository cursoRepository,
            ProfesorRepository profesorRepository,
            EstudianteRepository estudianteRepository) {
        this.cursoRepository = cursoRepository;
        this.profesorRepository = profesorRepository;
        this.estudianteRepository = estudianteRepository;
    }

    // Listar cursos

    public List<Curso> listarTodos() {
        return cursoRepository.findAll();
    }

    // Crear un nuevo curso con su profesor

    public Optional<Curso> crearCurso(Curso curso, Long profesorId) {

        Optional<Profesor> profesorOpt = profesorRepository.findById(profesorId);

        if (profesorOpt.isPresent()) {

            curso.setProfesor(profesorOpt.get());

            return Optional.of(cursoRepository.save(curso));
        } else {

            return Optional.empty();
        }
    }

    // Asignar estudiantes a un curso

    public boolean asignarEstudianteACurso(Long cursoId, Long estudianteId) {

        Optional<Curso> cursoOpt = cursoRepository.findById(cursoId);
        Optional<Estudiante> estudianteOpt = estudianteRepository.findById(estudianteId);

        if (cursoOpt.isPresent() && estudianteOpt.isPresent()) {
            Curso curso = cursoOpt.get();
            Estudiante estudiante = estudianteOpt.get();

            curso.agregarEstudiante(estudiante);

            cursoRepository.save(curso);
            return true;
        }
        return false;
    }

    // Devolver la lista de cursos en los que esta un estudiante.

    public List<CursoEstudianteDTO> buscarCursosPorEstudiante(Long estudianteId) {

        List<Curso> cursos = cursoRepository.findByEstudiantes_Id(estudianteId);

        return cursos.stream().map(curso -> {
            CursoEstudianteDTO dto = new CursoEstudianteDTO();
            dto.setId(curso.getId());
            dto.setNombreCurso(curso.getNombreCurso());

            dto.setProfesor(curso.getProfesor());

            return dto;
        }).collect(Collectors.toList());
    }
}