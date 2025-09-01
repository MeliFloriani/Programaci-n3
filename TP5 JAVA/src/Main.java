import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        Producto p1 = new Producto(101, "Notebook", 1500.0);
        Producto p2 = new Producto(102, "Mouse", 25.0);
        Producto p3 = new Producto(101, "Notebook Pro", 1800.0);

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);

        System.out.println(productos);
    }
}