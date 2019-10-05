package entities;

public class Usuario {

    private int id;
    private String nombre;
    private String nombreuser;


    public Usuario(int id, String nombre, String nombreuser) {
        this.id = id;
        this.nombre = nombre;
        this.nombreuser = nombreuser;
    }

    public Usuario(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreuser() {
        return nombreuser;
    }

    public void setNombreuser(String nombreuser) {
        this.nombreuser = nombreuser;
    }
}