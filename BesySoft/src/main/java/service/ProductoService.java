package service;

import model.Categoria;
import model.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductoService {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public List<Producto> productosPorCategoria(Categoria categoria) {
        return this.productos
                .stream()
                .filter(p -> p.getCategoria() == categoria)
                .collect(Collectors.toList());
    }

}