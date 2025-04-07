public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private String correo;
    private String numeroContacto;
    private String estadoCivil;
    private String ciudad;

    public Cliente(int id, String nombre, String apellido, String correo,
                   String numeroContacto, String estadoCivil, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numeroContacto = numeroContacto;
        this.estadoCivil = estadoCivil;
        this.ciudad = ciudad;
    }
}
