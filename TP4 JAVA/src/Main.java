import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        Producto p1 = new Producto(101, "Notebook", 1500.0);
        Producto p2 = new Producto(102, "Mouse", 25.0);
        Producto p3 = new Producto(101, "Notebook Pro", 1800.0);

        // Agregar productos evitando duplicados
        if (!productos.contains(p1)) productos.add(p1);
        if (!productos.contains(p2)) productos.add(p2);
        if (!productos.contains(p3)) productos.add(p3);

        System.out.println(productos);
    }
}