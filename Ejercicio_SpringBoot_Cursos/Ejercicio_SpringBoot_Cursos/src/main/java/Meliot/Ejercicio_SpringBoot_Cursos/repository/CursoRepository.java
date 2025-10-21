package Meliot.Ejercicio_SpringBoot_Cursos.repository;

import Meliot.Ejercicio_SpringBoot_Cursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    List<Curso> findByEstudiantes_Id(Long estudianteId);
}
