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
        System.out.println("Notebook");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Procesador: " + procesador);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("Año: " + ano);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Resolución de Pantalla: " + resolucionPantalla);
        System.out.println("Tipo de Teclado: " + tipoTeclado);
        System.out.println("Batería (mAh): " + bateria);
    }

    @Override
    public String toJSON() {
        return "{ \"tipo\": \"Notebook\", " +
                "\"marca\": \"" + marca + "\", " +
                "\"modelo\": \"" + modelo + "\", " +
                "\"procesador\": \"" + procesador + "\", " +
                "\"ram\": " + ram + ", " +
                "\"almacenamiento\": " + almacenamiento + ", " +
                "\"ano\": " + ano + ", " +
                "\"precio\": " + precio + ", " +
                "\"stock\": " + stock + ", " +
                "\"resolucionPantalla\": \"" + resolucionPantalla + "\", " +
                "\"tipoTeclado\": \"" + tipoTeclado + "\", " +
                "\"bateria\": \"" + bateria + "\" " +
                "}";
    }
}

