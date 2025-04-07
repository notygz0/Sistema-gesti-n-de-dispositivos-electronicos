import java.util.List;

public class Tablet extends DispositivoTecnologico {
    private String resolucionPantalla;
    private List<String> accesorios;

    public Tablet(String marca, int ram, int almacenamiento, String procesador,
                  String modelo, int ano, double precio, int stock,
                  String resolucionPantalla, List<String> accesorios) {
        super(marca, ram, almacenamiento, procesador, modelo, ano, precio, stock);
        this.resolucionPantalla = resolucionPantalla;
        this.accesorios = accesorios;
    }

    @Override
    public void mostrarEspecificaciones() {
        System.out.println("Tablet");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Procesador: " + procesador);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("Año: " + ano);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Resolución de la Pantalla: " + resolucionPantalla);
        System.out.println("Accesorios: " + accesorios);
    }

    @Override
    public String toJSON() {
        StringBuilder accesoriosJson = new StringBuilder("[");
        for (int i = 0; i < accesorios.size(); i++) {
            accesoriosJson.append("\"").append(accesorios.get(i)).append("\"");
            if (i < accesorios.size() - 1) {
                accesoriosJson.append(", ");
            }
        }
        accesoriosJson.append("]");

        return "{ \"tipo\": \"Tablet\", " +
                "\"marca\": \"" + marca + "\", " +
                "\"modelo\": \"" + modelo + "\", " +
                "\"procesador\": \"" + procesador + "\", " +
                "\"ram\": " + ram + ", " +
                "\"almacenamiento\": " + almacenamiento + ", " +
                "\"ano\": " + ano + ", " +
                "\"precio\": " + precio + ", " +
                "\"stock\": " + stock + ", " +
                "\"resolucionPantalla\": \"" + resolucionPantalla + "\", " +
                "\"accesorios\": " + accesoriosJson.toString() +
                " }";
    }
}
