import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Curso> cursos = new HashMap<>();

        cursos.put("CS101", new Curso("Programación Java", "Prof. Juan Pérez"));
        cursos.put("CS102", new Curso("Estructuras de Datos", "Prof. Ana Gómez"));
        cursos.put("CS103", new Curso("Bases de Datos", "Prof. Carlos Ruiz"));

        Curso cursoRecuperado = cursos.get("CS102");
        System.out.println("Curso recuperado: " + cursoRecuperado);
        
        System.out.println("\nTodos los cursos:");
        for (Map.Entry<String, Curso> entry : cursos.entrySet()) {
            String codigo = entry.getKey();
            Curso curso = entry.getValue();
            System.out.println("Código: " + codigo + " -> " + curso);
        }
    }
}