package Meliot.Ejercicio_SpringBoot_Cursos.service;

import Meliot.Ejercicio_SpringBoot_Cursos.model.Profesor;
import Meliot.Ejercicio_SpringBoot_Cursos.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    private final ProfesorRepository profesorRepository;

    @Autowired
    public ProfesorService(ProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    // Listar profesores.

    public List<Profesor> listarTodos() {
        return profesorRepository.findAll();
    }

    // Crear un nuevo profesor.

    public Profesor crearProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }
}
