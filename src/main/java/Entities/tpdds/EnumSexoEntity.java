package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "enum_sexo", schema = "tp_dds", catalog = "")
public class EnumSexoEntity {
    private int idEnumSexo;
    private String descripción;

    @Id
    @Column(name = "id_enumSexo", nullable = false)
    public int getIdEnumSexo() {
        return idEnumSexo;
    }

    public void setIdEnumSexo(int idEnumSexo) {
        this.idEnumSexo = idEnumSexo;
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

        EnumSexoEntity that = (EnumSexoEntity) o;

        if (idEnumSexo != that.idEnumSexo) return false;
        if (descripción != null ? !descripción.equals(that.descripción) : that.descripción != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEnumSexo;
        result = 31 * result + (descripción != null ? descripción.hashCode() : 0);
        return result;
    }
}
