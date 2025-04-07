public abstract class DispositivoTecnologico {

    String marca, modelo, procesador;
    int ram, almacenamiento, ano, stock;
    double precio;

    public DispositivoTecnologico(String marca, int ram, int almacenamiento, String procesador, String modelo, int ano, double precio, int stock) {
        this.marca = marca;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.procesador = procesador;
        this.modelo = modelo;
        this.ano = ano;
        this.precio = precio;
        this.stock = stock;
    }

    public abstract void mostrarEspecificaciones();

}
