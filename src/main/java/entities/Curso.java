package entities;

public class Curso{
    private int idcurso;
    private String nombre;
    private String descripcion;

    public Curso(){

    }

    public Curso(int idcurso, String nombre, String descripcion) {
        this.idcurso = idcurso;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}