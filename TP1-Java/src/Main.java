import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> listaEstudiantes = new ArrayList<>();

        listaEstudiantes.add(new Estudiante("Juan", 20, "Ingeniería en Sistemas"));
        listaEstudiantes.add(new Estudiante("María", 22, "Diseño Gráfico"));
        listaEstudiantes.add(new Estudiante("Pedro", 21, "Medicina"));

        System.out.println(listaEstudiantes);
    }
}