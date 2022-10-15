package model;

public class Producto {
    private Integer codigo;
    private String nombre;
    private Double precio;
    private Categoria categoria;

    public Producto(Integer codigo, String nombre, Double precio, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public Double getPrecio() {
        return this.precio;
    }
}
