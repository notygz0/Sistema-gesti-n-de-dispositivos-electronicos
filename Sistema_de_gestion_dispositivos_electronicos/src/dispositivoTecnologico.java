public abstract class dispositivoTecnologico {

    String marca, modelo, procesador;
    int ram, almacenamiento, anio, stock;
    double precio;

    public dispositivoTecnologico(String marca, int ram, int almacenamiento, String procesador, String modelo, int anio, double precio, int stock) {
        this.marca = marca;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.procesador = procesador;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.stock = stock;
    }

    public abstract void mostrarEspecificaciones();

}
