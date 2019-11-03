package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "enum_tipo_dni", schema = "tp_dds", catalog = "")
public class EnumTipoDniEntity {
    private int idEnumTipoDni;
    private String descripción;

    @Id
    @Column(name = "id_enumTipoDni", nullable = false)
    public int getIdEnumTipoDni() {
        return idEnumTipoDni;
    }

    public void setIdEnumTipoDni(int idEnumTipoDni) {
        this.idEnumTipoDni = idEnumTipoDni;
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

        EnumTipoDniEntity that = (EnumTipoDniEntity) o;

        if (idEnumTipoDni != that.idEnumTipoDni) return false;
        if (descripción != null ? !descripción.equals(that.descripción) : that.descripción != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEnumTipoDni;
        result = 31 * result + (descripción != null ? descripción.hashCode() : 0);
        return result;
    }
}
