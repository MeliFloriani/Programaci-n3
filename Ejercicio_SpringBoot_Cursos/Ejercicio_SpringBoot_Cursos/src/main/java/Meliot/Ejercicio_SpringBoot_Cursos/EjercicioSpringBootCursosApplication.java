package Meliot.Ejercicio_SpringBoot_Cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("Meliot.Ejercicio_SpringBoot_Cursos.repository")
@SpringBootApplication
public class EjercicioSpringBootCursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioSpringBootCursosApplication.class, args);
	}

}
