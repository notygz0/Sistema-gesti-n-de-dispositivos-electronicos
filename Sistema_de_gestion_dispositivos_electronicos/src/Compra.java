import java.time.LocalDate;
import java.util.List;

public class Compra {
    Cliente cliente;
    List<DispositivoTecnologico> dispositivos;
    LocalDate fecha;

    public Compra(Cliente cliente, List<DispositivoTecnologico> dispositivos) {
        this.cliente = cliente;
        this.dispositivos = dispositivos;
        this.fecha = LocalDate.now();
    }

    public String toJSON() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  \"cliente\": ").append(cliente.toJSON()).append(",\n");
        sb.append("  \"fecha\": \"").append(fecha.toString()).append("\",\n");
        sb.append("  \"dispositivos\": [\n");
        for (int i = 0; i < dispositivos.size(); i++) {
            sb.append("    ").append(dispositivos.get(i).toJSON());
            if (i < dispositivos.size() - 1) {
                sb.append(",");
            }
            sb.append("\n");
        }
        sb.append("  ]\n");
        sb.append("}");
        return sb.toString();
    }
}

