public class Pantalla {
    private String marca;
    private String modelo;
    private int ano;

    public Pantalla(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Pantalla [Marca=" + marca + ", Modelo=" + modelo + ", Año=" + ano + "]";
    }

    


}
