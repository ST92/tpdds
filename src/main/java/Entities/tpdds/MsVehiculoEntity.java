package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "ms_vehiculo", schema = "tp_dds", catalog = "")
@IdClass(MsVehiculoEntityPK.class)
public class MsVehiculoEntity {
    private int idMedidasSeguridad;
    private int idAuto;

    @Id
    @Column(name = "id_MedidasSeguridad", nullable = false)
    public int getIdMedidasSeguridad() {
        return idMedidasSeguridad;
    }

    public void setIdMedidasSeguridad(int idMedidasSeguridad) {
        this.idMedidasSeguridad = idMedidasSeguridad;
    }

    @Id
    @Column(name = "id_auto", nullable = false)
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

        MsVehiculoEntity that = (MsVehiculoEntity) o;

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
