public class Notebook extends DispositivoTecnologico {
    private String resolucionPantalla;
    private String tipoTeclado;
    private String bateria;

    public Notebook(String marca, int ram, int almacenamiento, String procesador,
                    String modelo, int ano, double precio, int stock,
                    String resolucionPantalla, String tipoTeclado, String bateria) {
        super(marca, ram, almacenamiento, procesador, modelo, ano, precio, stock);
        this.resolucionPantalla = resolucionPantalla;
        this.tipoTeclado = tipoTeclado;
        this.bateria = bateria;
    }

    @Override
    public void mostrarEspecificaciones() {
        System.out.println("notebook");
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("procesador: " + procesador);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("almacenamiento: " + almacenamiento + " GB");
        System.out.println("año: " + ano);
        System.out.println("precio: " + precio);
        System.out.println("stock: " + stock);
        System.out.println("resolucion de pantalla: " + resolucionPantalla);
        System.out.println("tipo de teclado: " + tipoTeclado);
        System.out.println("bateria (mAh): " + bateria);
    }
}

