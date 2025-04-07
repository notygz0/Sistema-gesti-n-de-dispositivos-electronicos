public class DetalleCompra {
    private DispositivoTecnologico dispositivo;
    private int cantidad;

    public DetalleCompra(DispositivoTecnologico dispositivo, int cantidad) {
        this.dispositivo = dispositivo;
        this.cantidad = cantidad;
    }

    public DispositivoTecnologico getDispositivo() {
        return dispositivo;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "DetalleCompra [Dispositivo=" + dispositivo.getModelo() + ", Cantidad=" + cantidad + "]";
    }

    public String toJSON() {
        return "{ \"dispositivo\": " + dispositivo.toJSON() + ", " +
                "\"cantidad\": " + cantidad + " }";
    }

}
