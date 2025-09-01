import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Juan", 20, "Ingeniería en Sistemas");
        Estudiante e2 = new Estudiante("María", 22, "Diseño Gráfico");
        Estudiante e3 = new Estudiante("Pedro", 21, "Medicina");

        Curso curso1 = new Curso("Estructuras de Datos", "Prof. Carlos Ruiz");
        Curso curso2 = new Curso("Bases de Datos", "Prof. Ana Gómez");

        curso1.agregarEstudiante(e1);
        curso1.agregarEstudiante(e2);
        curso2.agregarEstudiante(e3);

        System.out.println(curso1);
        System.out.println(curso2);
    }
}