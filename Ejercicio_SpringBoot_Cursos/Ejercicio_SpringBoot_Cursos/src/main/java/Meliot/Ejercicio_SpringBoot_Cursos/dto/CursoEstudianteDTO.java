package Meliot.Ejercicio_SpringBoot_Cursos.dto;

import Meliot.Ejercicio_SpringBoot_Cursos.model.Profesor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // Lombok para constructor vacío
public class CursoEstudianteDTO {
    private Long id;
    private String nombreCurso;
    private Profesor profesor;

}
