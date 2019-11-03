package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "enum_estado_poliza", schema = "tp_dds", catalog = "")
public class EnumEstadoPolizaEntity {
    private int idEnumEstadoPoliza;
    private String descripción;

    @Id
    @Column(name = "id_enumEstadoPoliza", nullable = false)
    public int getIdEnumEstadoPoliza() {
        return idEnumEstadoPoliza;
    }

    public void setIdEnumEstadoPoliza(int idEnumEstadoPoliza) {
        this.idEnumEstadoPoliza = idEnumEstadoPoliza;
    }

    @Basic
    @Column(name = "descripción", nullable = false, length = 20)
    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnumEstadoPolizaEntity that = (EnumEstadoPolizaEntity) o;

        if (idEnumEstadoPoliza != that.idEnumEstadoPoliza) return false;
        if (descripción != null ? !descripción.equals(that.descripción) : that.descripción != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEnumEstadoPoliza;
        result = 31 * result + (descripción != null ? descripción.hashCode() : 0);
        return result;
    }
}
