import java.util.ArrayList;
import java.util.List;

public class Tienda {
    String direccion;
    List<Cliente> clientes = new ArrayList<>();
    List<DispositivoTecnologico> inventario = new ArrayList<>();

    public Tienda(String direccion) {
        this.direccion = direccion;
    }

    public void modificarDireccion(String nuevaDireccion) {
        this.direccion = nuevaDireccion;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarDispositivo(DispositivoTecnologico d) {
        inventario.add(d);
    }

    public void realizarVenta(Cliente cliente, List<DispositivoTecnologico> productos) {
        for (DispositivoTecnologico d : productos) {
            if (d.stock > 0) d.stock--;
            else System.out.println("Sin stock: " + d.modelo);
        }
        Venta venta = new Venta(cliente, productos);
    }

    public List<DispositivoTecnologico> buscar(String marca, String modelo, String tipo) {
        List<DispositivoTecnologico> resultado = new ArrayList<>();
        for (DispositivoTecnologico d : inventario) {
            if ((marca == null || d.marca.equalsIgnoreCase(marca)) &&
                    (modelo == null || d.modelo.equalsIgnoreCase(modelo)) &&
                    (tipo == null || d.getClass().getSimpleName().equalsIgnoreCase(tipo))) {
                resultado.add(d);
            }
        }
        return resultado;
    }
}
