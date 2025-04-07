public class ComputadorEscritorio extends dispositivoTecnologico {
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
        System.out.println("computador de escritorio");
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("procesador: " + procesador);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("almacenamiento: " + almacenamiento + " GB");
        System.out.println("ano: " + ano);
        System.out.println("precio: " + precio);
        System.out.println("stock: " + stock);
        System.out.println("tarjeta de video: " + tarjetaVideo);
        System.out.println("fuente de poder: " + fuentePoder);
        System.out.println("chasis: " + chasis);
        System.out.println("pantalla: " + pantalla.toString());
    }
}
