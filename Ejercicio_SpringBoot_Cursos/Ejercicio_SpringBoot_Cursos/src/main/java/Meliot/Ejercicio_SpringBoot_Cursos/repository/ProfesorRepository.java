package Meliot.Ejercicio_SpringBoot_Cursos.repository;

import Meliot.Ejercicio_SpringBoot_Cursos.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
