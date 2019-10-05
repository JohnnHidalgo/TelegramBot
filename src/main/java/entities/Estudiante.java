package entities;

public class Estudiante extends Usuario{

    private final String tipo_usuario="estudiante";

    public Estudiante(int id, String nombre, String nombreuser) {
        super(id, nombre, nombreuser);
    }

    public String getTipo_usuario() {
        return tipo_usuario;
    }
}
