package entities;

public class Institucion {

    private int id_inst;
    private String nombre;
    private String direccion;
    private int telefono;
    private String descripcion;

    public int getId_inst() {
        return id_inst;
    }

    public void setId_inst(int id_inst) {
        this.id_inst = id_inst;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
