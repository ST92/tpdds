package Entities.tpdds;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MsVehiculoEntityPK implements Serializable {
    private int idMedidasSeguridad;
    private int idAuto;

    @Column(name = "id_MedidasSeguridad", nullable = false)
    @Id
    public int getIdMedidasSeguridad() {
        return idMedidasSeguridad;
    }

    public void setIdMedidasSeguridad(int idMedidasSeguridad) {
        this.idMedidasSeguridad = idMedidasSeguridad;
    }

    @Column(name = "id_auto", nullable = false)
    @Id
    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MsVehiculoEntityPK that = (MsVehiculoEntityPK) o;

        if (idMedidasSeguridad != that.idMedidasSeguridad) return false;
        if (idAuto != that.idAuto) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMedidasSeguridad;
        result = 31 * result + idAuto;
        return result;
    }
}
