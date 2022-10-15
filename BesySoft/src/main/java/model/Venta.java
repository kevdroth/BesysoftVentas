package model;

import java.time.LocalDateTime;

public class Venta {
    private Producto producto;
    private Vendedor vendedor;
    private LocalDateTime fechaHoraVenta;
    private Integer cantidad;

    public Venta(Producto producto, Vendedor vendedor, Integer cantidad) {
        this.producto = producto;
        this.vendedor = vendedor;
        this.cantidad = cantidad;
        this.fechaHoraVenta = LocalDateTime.now();
    }

    public Vendedor getVendedor() {
        return this.vendedor;
    }

    public Double getComision() {
        Double total = this.total();

        if(cantidad <= 2) {
            return total * 0.05;
        }

        return total * 0.10;
    }

    public Double total() {
        return this.cantidad * this.producto.getPrecio();
    }
}