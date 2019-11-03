package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "enum_cond_iva", schema = "tp_dds", catalog = "")
public class EnumCondIvaEntity {
    private int idEnumCondIva;
    private String descripcion;

    @Id
    @Column(name = "id_enumCondIva", nullable = false)
    public int getIdEnumCondIva() {
        return idEnumCondIva;
    }

    public void setIdEnumCondIva(int idEnumCondIva) {
        this.idEnumCondIva = idEnumCondIva;
    }

    @Basic
    @Column(name = "descripcion", nullable = false, length = 20)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnumCondIvaEntity that = (EnumCondIvaEntity) o;

        if (idEnumCondIva != that.idEnumCondIva) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEnumCondIva;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
