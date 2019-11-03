package Entities.tpdds;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class HistorialSiniestrosFcEntityPK implements Serializable {
    private int idSiniestrosHist;
    private int idSiniestros;
    private int idUsuario;

    @Column(name = "id_siniestros_hist", nullable = false)
    @Id
    public int getIdSiniestrosHist() {
        return idSiniestrosHist;
    }

    public void setIdSiniestrosHist(int idSiniestrosHist) {
        this.idSiniestrosHist = idSiniestrosHist;
    }

    @Column(name = "id_siniestros", nullable = false)
    @Id
    public int getIdSiniestros() {
        return idSiniestros;
    }

    public void setIdSiniestros(int idSiniestros) {
        this.idSiniestros = idSiniestros;
    }

    @Column(name = "id_usuario", nullable = false)
    @Id
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistorialSiniestrosFcEntityPK that = (HistorialSiniestrosFcEntityPK) o;

        if (idSiniestrosHist != that.idSiniestrosHist) return false;
        if (idSiniestros != that.idSiniestros) return false;
        if (idUsuario != that.idUsuario) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSiniestrosHist;
        result = 31 * result + idSiniestros;
        result = 31 * result + idUsuario;
        return result;
    }
}
