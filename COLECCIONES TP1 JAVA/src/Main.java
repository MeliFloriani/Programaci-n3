import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();

        listaAlumnos.add(new Alumno("Juan", 8.5));
        listaAlumnos.add(new Alumno("María", 9.0));
        listaAlumnos.add(new Alumno("Pedro", 7.5));
        listaAlumnos.add(new Alumno("María", 9.0));
        
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno);
        }
    }
}