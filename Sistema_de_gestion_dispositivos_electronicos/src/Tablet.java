import java.util.List;

public class Tablet extends DispositivoTecnologico{

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
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("procesador: " + procesador);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("almacenamiento: " + almacenamiento + " GB");
        System.out.println("ano: " + ano);
        System.out.println("precio: " + precio);
        System.out.println("stock: " + stock);
        System.out.println("resolucion de la Pantalla: " + resolucionPantalla);
        System.out.println("accesorios: " + accesorios);
    }

}
