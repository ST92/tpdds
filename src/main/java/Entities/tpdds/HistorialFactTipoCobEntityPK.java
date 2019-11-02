package Entities.tpdds;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class HistorialFactTipoCobEntityPK implements Serializable {
    private int idHistFactTipoCob;
    private int idCobertura;
    private int idUsuario;

    @Column(name = "id_hist_fact_tipo_cob", nullable = false)
    @Id
    public int getIdHistFactTipoCob() {
        return idHistFactTipoCob;
    }

    public void setIdHistFactTipoCob(int idHistFactTipoCob) {
        this.idHistFactTipoCob = idHistFactTipoCob;
    }

    @Column(name = "id_cobertura", nullable = false)
    @Id
    public int getIdCobertura() {
        return idCobertura;
    }

    public void setIdCobertura(int idCobertura) {
        this.idCobertura = idCobertura;
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

        HistorialFactTipoCobEntityPK that = (HistorialFactTipoCobEntityPK) o;

        if (idHistFactTipoCob != that.idHistFactTipoCob) return false;
        if (idCobertura != that.idCobertura) return false;
        if (idUsuario != that.idUsuario) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHistFactTipoCob;
        result = 31 * result + idCobertura;
        result = 31 * result + idUsuario;
        return result;
    }
}
