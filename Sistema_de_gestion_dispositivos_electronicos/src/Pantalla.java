public class Pantalla {
    private String marca;
    private String modelo;
    private String ano;

    public Pantalla(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Pantalla{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio='" + ano + '\'' +
                '}';
    }
}
