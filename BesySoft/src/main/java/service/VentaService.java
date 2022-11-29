package service;

import model.Producto;
import model.Vendedor;
import model.Venta;

import java.util.ArrayList;
import java.util.List;

public class VentaService {
    private List<Venta> ventas = new ArrayList<>();

    public void guardarVenta(Producto producto, Vendedor vendedor, Integer cantidad) {
        Venta venta = new Venta(producto, vendedor, cantidad);
        this.ventas.add(venta);
    }

    public Double getTotalComisionPorVendedor(Vendedor vendedor) {
        try {
            return this.ventas
                    .stream()
                    .filter(v -> v.getVendedor().equals(vendedor))
                    .map(v -> v.getComision())
                    .reduce(0d, Double::sum);
        } catch (Exception e) {
            System.out.println("El vendedor no existe");
        }
        return null;
    }
}