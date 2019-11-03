package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "enum_estado_cliente", schema = "tp_dds", catalog = "")
public class EnumEstadoClienteEntity {
    private int idEnumEstadoCliente;
    private String descripción;

    @Id
    @Column(name = "id_enumEstadoCliente", nullable = false)
    public int getIdEnumEstadoCliente() {
        return idEnumEstadoCliente;
    }

    public void setIdEnumEstadoCliente(int idEnumEstadoCliente) {
        this.idEnumEstadoCliente = idEnumEstadoCliente;
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

        EnumEstadoClienteEntity that = (EnumEstadoClienteEntity) o;

        if (idEnumEstadoCliente != that.idEnumEstadoCliente) return false;
        if (descripción != null ? !descripción.equals(that.descripción) : that.descripción != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEnumEstadoCliente;
        result = 31 * result + (descripción != null ? descripción.hashCode() : 0);
        return result;
    }
}
