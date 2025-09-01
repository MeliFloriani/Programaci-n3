class Producto {
    private int codigo;
    private String nombre;
    private double precio;

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Producto{codigo=" + codigo + ", nombre='" + nombre + "', precio=" + precio + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto otro = (Producto) obj;
        return this.codigo == otro.codigo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }
}
