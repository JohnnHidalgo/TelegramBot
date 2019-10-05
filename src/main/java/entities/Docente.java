package entities;

public class Docente extends Usuario {

    private final String tipo_usuario="docente";

    public Docente(int id, String nombre, String nombreuser) {
        super(id, nombre, nombreuser);
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }
}
