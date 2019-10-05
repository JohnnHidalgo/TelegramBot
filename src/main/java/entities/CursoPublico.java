package entities;

public class CursoPublico extends  Curso{


    private final String tipo_curso="publico";

    public CursoPublico() {
    }

    public CursoPublico(int idcurso, String nombre, String descripcion) {

        super(idcurso, nombre, descripcion);
    }

    public String getTipo_curso() {
        return tipo_curso;
    }

}
