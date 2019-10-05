package entities;

public class CursoPrivado extends Curso{
    private String clave;
    private final String tipo_curso="privado";

    public CursoPrivado(int idcurso, String nombre, String descripcion, String clave) {
        super(idcurso, nombre, descripcion);
        this.clave = clave;
    }

    public CursoPrivado(int idcurso, String nombre, String descripcion) {
        super(idcurso, nombre, descripcion);
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipo_curso() {
        return tipo_curso;
    }
}
