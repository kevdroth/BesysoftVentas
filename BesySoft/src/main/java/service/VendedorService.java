package service;

import model.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class VendedorService {

    private List<Vendedor> vendedores = new ArrayList<>();

    public void agregarVendedor(Vendedor vendedor) {
        this.vendedores.add(vendedor);
    }
}
