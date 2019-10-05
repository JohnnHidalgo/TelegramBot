package entities;

public class Respuesta {

    private int id_resp;
    private String descripcion;

    public Respuesta(int id_resp, String descripcion) {
        this.id_resp = id_resp;
        this.descripcion = descripcion;
    }

    public int getId_resp() {
        return id_resp;

    }

    public void setId_resp(int id_resp) {
        this.id_resp = id_resp;

    }

    public String getDescripcion() {
        return descripcion;

    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;

    }
}
