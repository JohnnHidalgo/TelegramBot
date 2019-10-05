package entities;

public class RespuestaErronea extends  Respuesta {

    private final boolean respuesta=false;

    public RespuestaErronea(int id_resp, String descripcion) {

        super(id_resp, descripcion);
    }


}
