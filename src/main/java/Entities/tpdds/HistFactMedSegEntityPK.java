package Entities.tpdds;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class HistFactMedSegEntityPK implements Serializable {
    private int idHistFactMedSeg;
    private int idMedidasSeguridad;
    private int idUsuario;

    @Column(name = "id_hist_fact_med_seg", nullable = false)
    @Id
    public int getIdHistFactMedSeg() {
        return idHistFactMedSeg;
    }

    public void setIdHistFactMedSeg(int idHistFactMedSeg) {
        this.idHistFactMedSeg = idHistFactMedSeg;
    }

    @Column(name = "id_MedidasSeguridad", nullable = false)
    @Id
    public int getIdMedidasSeguridad() {
        return idMedidasSeguridad;
    }

    public void setIdMedidasSeguridad(int idMedidasSeguridad) {
        this.idMedidasSeguridad = idMedidasSeguridad;
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

        HistFactMedSegEntityPK that = (HistFactMedSegEntityPK) o;

        if (idHistFactMedSeg != that.idHistFactMedSeg) return false;
        if (idMedidasSeguridad != that.idMedidasSeguridad) return false;
        if (idUsuario != that.idUsuario) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHistFactMedSeg;
        result = 31 * result + idMedidasSeguridad;
        result = 31 * result + idUsuario;
        return result;
    }
}
