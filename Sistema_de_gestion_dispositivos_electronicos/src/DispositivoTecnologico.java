public abstract class DispositivoTecnologico {
    protected String marca, modelo, procesador;
    protected int ram, almacenamiento, ano, stock;
    protected double precio;

    public DispositivoTecnologico(String marca, int ram, int almacenamiento, String procesador,
                                  String modelo, int ano, double precio, int stock) {
        this.marca = marca;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.procesador = procesador;
        this.modelo = modelo;
        this.ano = ano;
        this.precio = precio;
        this.stock = stock;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getStock() {
        return stock;
    }

    public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }

    public abstract void mostrarEspecificaciones();

    public abstract String toJSON();
}
