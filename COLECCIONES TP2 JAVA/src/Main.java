import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Producto> productos = new HashSet<>();

        productos.add(new Producto(101, "Notebook"));
        productos.add(new Producto(102, "Mouse"));
        productos.add(new Producto(101, "Notebook Pro")); // duplicado según código
        
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}