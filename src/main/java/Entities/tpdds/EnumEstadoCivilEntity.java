package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "enum_estado_civil", schema = "tp_dds", catalog = "")
public class EnumEstadoCivilEntity {
    private int idEnumEstadoCivil;
    private String descripción;

    @Id
    @Column(name = "id_enumEstadoCivil", nullable = false)
    public int getIdEnumEstadoCivil() {
        return idEnumEstadoCivil;
    }

    public void setIdEnumEstadoCivil(int idEnumEstadoCivil) {
        this.idEnumEstadoCivil = idEnumEstadoCivil;
    }

    @Basic
    @Column(name = "descripción", nullable = false, length = 10)
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

        EnumEstadoCivilEntity that = (EnumEstadoCivilEntity) o;

        if (idEnumEstadoCivil != that.idEnumEstadoCivil) return false;
        if (descripción != null ? !descripción.equals(that.descripción) : that.descripción != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEnumEstadoCivil;
        result = 31 * result + (descripción != null ? descripción.hashCode() : 0);
        return result;
    }
}
