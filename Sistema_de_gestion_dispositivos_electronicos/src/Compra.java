import java.time.LocalDate;
import java.util.List;

public class Compra {
    private Cliente cliente;
    private List<DetalleCompra> detalles;
    private LocalDate fecha;

    public Compra(Cliente cliente, List<DetalleCompra> detalles) {
        this.cliente = cliente;
        this.detalles = detalles;
        this.fecha = LocalDate.now();
    }

    // metodo apara realizar la compra
    public void realizarCompra() {
        for (DetalleCompra detalle : detalles) {
            detalle.getDispositivo().reducirStock(detalle.getCantidad());
        }
    }

    // Metodo que muestra los detalles de la compra
    public void mostrarCompra() {
        System.out.println("Cliente: " + cliente.toString());
        System.out.println("Fecha: " + fecha.toString());
        System.out.println("Detalles de la compra:");
        for (DetalleCompra detalle : detalles) {
            System.out.println(detalle.toString());
        }
    }

    public String toJSON() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  \"cliente\": ").append(cliente.toJSON()).append(",\n");
        sb.append("  \"fecha\": \"").append(fecha.toString()).append("\",\n");
        sb.append("  \"detalles\": [\n");
        for (int i = 0; i < detalles.size(); i++) {
            sb.append("    ").append(detalles.get(i).toJSON());
            if (i < detalles.size() - 1) {
                sb.append(",");
            }
            sb.append("\n");
        }
        sb.append("  ]\n");
        sb.append("}");
        return sb.toString();
    }
}
