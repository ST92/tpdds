package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "enum_tipo_usuario", schema = "tp_dds", catalog = "")
public class EnumTipoUsuarioEntity {
    private int idEnumTipoUsuario;
    private String descripción;

    @Id
    @Column(name = "id_enumTipoUsuario", nullable = false)
    public int getIdEnumTipoUsuario() {
        return idEnumTipoUsuario;
    }

    public void setIdEnumTipoUsuario(int idEnumTipoUsuario) {
        this.idEnumTipoUsuario = idEnumTipoUsuario;
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

        EnumTipoUsuarioEntity that = (EnumTipoUsuarioEntity) o;

        if (idEnumTipoUsuario != that.idEnumTipoUsuario) return false;
        if (descripción != null ? !descripción.equals(that.descripción) : that.descripción != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEnumTipoUsuario;
        result = 31 * result + (descripción != null ? descripción.hashCode() : 0);
        return result;
    }
}
