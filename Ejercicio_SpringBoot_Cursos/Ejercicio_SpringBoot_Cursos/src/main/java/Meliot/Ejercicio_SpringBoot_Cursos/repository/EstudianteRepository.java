package Meliot.Ejercicio_SpringBoot_Cursos.repository;
import Meliot.Ejercicio_SpringBoot_Cursos.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
