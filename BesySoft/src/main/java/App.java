import model.Categoria;
import model.Producto;
import model.Vendedor;
import service.ProductoService;
import service.VentaService;

public class App {
    private static VentaService ventaService = new VentaService();
    private static ProductoService productoService = new ProductoService();
    public static void main(String[] args) {
        Categoria lacteo = new Categoria(1, "Lacteo");
        Categoria carne = new Categoria(2, "Carne");
        Categoria bebida = new Categoria(3, "Bebida");

        Vendedor juan = new Vendedor(1, "Juan", 100d);
        Vendedor kevin = new Vendedor(2, "Kevin", 150d);
        Vendedor pablo = new Vendedor(3, "Pablo", 200d);

        Producto yogur = new Producto(1, "Yogur", 10d, lacteo);
        Producto manteca = new Producto(2, "Manteca", 5d, lacteo);
        Producto asado = new Producto(3, "Asado", 10d, carne);
        Producto queso = new Producto(4, "Queso", 10d, lacteo);
        Producto vacio = new Producto(5, "Vacio", 10d, carne);
        Producto cocacola = new Producto(6, "Coca Cola", 10d, bebida);
        Producto cafe = new Producto(7, "Café", 10d, bebida);

        ventaService.guardarVenta(cafe, pablo, 5);

        Double comisionPablo = ventaService.getTotalComisionPorVendedor(juan);

        System.out.println(comisionPablo);


    }
}