package Entities.tpdds;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class HistorialFactAjustesPorKmEntityPK implements Serializable {
    private int idHistFactAjustesKm;
    private int idAjusteskm;
    private int idUsuario;

    @Column(name = "id_hist_fact_ajustesKM", nullable = false)
    @Id
    public int getIdHistFactAjustesKm() {
        return idHistFactAjustesKm;
    }

    public void setIdHistFactAjustesKm(int idHistFactAjustesKm) {
        this.idHistFactAjustesKm = idHistFactAjustesKm;
    }

    @Column(name = "id_ajusteskm", nullable = false)
    @Id
    public int getIdAjusteskm() {
        return idAjusteskm;
    }

    public void setIdAjusteskm(int idAjusteskm) {
        this.idAjusteskm = idAjusteskm;
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

        HistorialFactAjustesPorKmEntityPK that = (HistorialFactAjustesPorKmEntityPK) o;

        if (idHistFactAjustesKm != that.idHistFactAjustesKm) return false;
        if (idAjusteskm != that.idAjusteskm) return false;
        if (idUsuario != that.idUsuario) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHistFactAjustesKm;
        result = 31 * result + idAjusteskm;
        result = 31 * result + idUsuario;
        return result;
    }
}
