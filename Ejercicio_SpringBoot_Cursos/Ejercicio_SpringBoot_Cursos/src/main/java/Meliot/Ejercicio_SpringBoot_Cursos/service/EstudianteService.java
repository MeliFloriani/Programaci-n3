package Meliot.Ejercicio_SpringBoot_Cursos.service;

import Meliot.Ejercicio_SpringBoot_Cursos.model.Estudiante;
import Meliot.Ejercicio_SpringBoot_Cursos.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    private final EstudianteRepository estudianteRepository;

    @Autowired
    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    // Listar estudiantes.

    public List<Estudiante> listarTodos() {
        return estudianteRepository.findAll();
    }

    // Crear un nuevo estudiante.

    public Estudiante crearEstudiante(Estudiante estudiante) {

        return estudianteRepository.save(estudiante);
    }

    // Buscar por ID

    public Optional<Estudiante> buscarPorId(Long id) {
        return estudianteRepository.findById(id);
    }
}
