import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String direccion;
    private List<DispositivoTecnologico> catalogo;

    public Tienda(String direccion) {
        this.direccion = direccion;
        this.catalogo = new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String nuevaDireccion) {
        this.direccion = nuevaDireccion;
    }

    public void agregarDispositivo(DispositivoTecnologico dispositivo) {
        catalogo.add(dispositivo);
    }

    public List<DispositivoTecnologico> buscarPorMarca(String marca) {
        List<DispositivoTecnologico> resultado = new ArrayList<>();
        for (DispositivoTecnologico d : catalogo) {
            if(d.getMarca().equalsIgnoreCase(marca)) {
                resultado.add(d);
            }
        }
        return resultado;
    }

    public List<DispositivoTecnologico> buscarPorModelo(String modelo) {
        List<DispositivoTecnologico> resultado = new ArrayList<>();
        for (DispositivoTecnologico d : catalogo) {
            if(d.getModelo().equalsIgnoreCase(modelo)) {
                resultado.add(d);
            }
        }
        return resultado;
    }

    public List<DispositivoTecnologico> buscarPorTipo(String tipo) {
        List<DispositivoTecnologico> resultado = new ArrayList<>();
        for (DispositivoTecnologico d : catalogo) {
            if(tipo.equalsIgnoreCase("Computador de escritorio") && d instanceof ComputadorEscritorio) {
                resultado.add(d);
            } else if(tipo.equalsIgnoreCase("Notebook") && d instanceof Notebook) {
                resultado.add(d);
            } else if(tipo.equalsIgnoreCase("Tablet") && d instanceof Tablet) {
                resultado.add(d);
            }
        }
        return resultado;
    }

    public void mostrarCatalogo() {
        for (DispositivoTecnologico d : catalogo) {
            d.mostrarEspecificaciones();
            System.out.println("-----------------------------------");
        }
    }

    public String toJSON() {
        StringBuilder catalogoJson = new StringBuilder("[");
        for (int i = 0; i < catalogo.size(); i++) {
            catalogoJson.append(catalogo.get(i).toJSON());
            if(i < catalogo.size() - 1) {
                catalogoJson.append(", ");
            }
        }
        catalogoJson.append("]");

        return "{ \"direccion\": \"" + direccion + "\", " +
                "\"catalogo\": " + catalogoJson.toString() + " }";
    }
}
