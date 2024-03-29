package classgenerates;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "cp_estudiante", schema = "kajoydatabase", catalog = "")
public class CpEstudianteEntity {
    private long hEstudId;
    private int idEstudiante;
    private String nombre;
    private int status;
    private String txUser;
    private Date txDate;

    @Id
    @Column(name = "h_estud_id")
    public long gethEstudId() {
        return hEstudId;
    }

    public void sethEstudId(long hEstudId) {
        this.hEstudId = hEstudId;
    }

    @Basic
    @Column(name = "id_estudiante")
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "tx_user")
    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    @Basic
    @Column(name = "tx_date")
    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CpEstudianteEntity that = (CpEstudianteEntity) o;

        if (hEstudId != that.hEstudId) return false;
        if (idEstudiante != that.idEstudiante) return false;
        if (status != that.status) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (txUser != null ? !txUser.equals(that.txUser) : that.txUser != null) return false;
        if (txDate != null ? !txDate.equals(that.txDate) : that.txDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (hEstudId ^ (hEstudId >>> 32));
        result = 31 * result + idEstudiante;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (txUser != null ? txUser.hashCode() : 0);
        result = 31 * result + (txDate != null ? txDate.hashCode() : 0);
        return result;
    }
}
