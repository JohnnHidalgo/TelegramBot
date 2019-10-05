package entities;

public class Test {
    private String id_yest;
    private String nombre;
    private String descripcion;

    public Test(String id_yest, String nombre, String descripcion) {
        this.id_yest = id_yest;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getId_yest() {
        return id_yest;

    }
    public void setId_yest(String id_yest) {
        this.id_yest = id_yest;

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
