import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
public class GestorDatos {
    public static void actualizarDatos(Tienda tienda, List<Cliente> clientes, List<Compra> compras) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("data.json"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("{\n");
            sb.append("  \"tienda\": ").append(tienda.toJSON()).append(",\n");

            sb.append("  \"clientes\": [\n");
            for (int i = 0; i < clientes.size(); i++) {
                sb.append("    ").append(clientes.get(i).toJSON());
                if (i < clientes.size() - 1) {
                    sb.append(",");
                }
                sb.append("\n");
            }
            sb.append("  ],\n");

            sb.append("  \"compras\": [\n");
            for (int i = 0; i < compras.size(); i++) {
                sb.append("    ").append(compras.get(i).toJSON());
                if (i < compras.size() - 1) {
                    sb.append(",");
                }
                sb.append("\n");
            }
            sb.append("  ]\n");
            sb.append("}");

            pw.write(sb.toString());
            System.out.println("Datos actualizados en data.json");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo de datos: " + e.getMessage());
        }
    }
}
