public class ComputadorEscritorio extends DispositivoTecnologico {
    private String tarjetaVideo;
    private String fuentePoder;
    private String chasis;
    private Pantalla pantalla;

    public ComputadorEscritorio(String marca, int ram, int almacenamiento, String procesador,
                                String modelo, int ano, double precio, int stock,
                                String tarjetaVideo, String fuentePoder, String chasis, Pantalla pantalla) {
        super(marca, ram, almacenamiento, procesador, modelo, ano, precio, stock);
        this.tarjetaVideo = tarjetaVideo;
        this.fuentePoder = fuentePoder;
        this.chasis = chasis;
        this.pantalla = pantalla;
    }

    @Override
    public void mostrarEspecificaciones() {
        System.out.println("Computador de Escritorio");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Procesador: " + procesador);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Almacenamiento: " + almacenamiento + " GB");
        System.out.println("AÃ±o: " + ano);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Tarjeta de Video: " + tarjetaVideo);
        System.out.println("Fuente de Poder: " + fuentePoder);
        System.out.println("Chasis: " + chasis);
        System.out.println("Pantalla: " + pantalla.toString());
    }

    @Override
    public String toJSON() {
        return "{ \"tipo\": \"ComputadorEscritorio\", " +
                "\"marca\": \"" + marca + "\", " +
                "\"modelo\": \"" + modelo + "\", " +
                "\"procesador\": \"" + procesador + "\", " +
                "\"ram\": " + ram + ", " +
                "\"almacenamiento\": " + almacenamiento + ", " +
                "\"ano\": " + ano + ", " +
                "\"precio\": " + precio + ", " +
                "\"stock\": " + stock + ", " +
                "\"tarjetaVideo\": \"" + tarjetaVideo + "\", " +
                "\"fuentePoder\": \"" + fuentePoder + "\", " +
                "\"chasis\": \"" + chasis + "\", " +
                "\"pantalla\": " + pantalla.toJSON() +
                " }";
    }
}
