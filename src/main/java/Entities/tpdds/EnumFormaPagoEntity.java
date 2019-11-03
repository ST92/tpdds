package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "enum_forma_pago", schema = "tp_dds", catalog = "")
public class EnumFormaPagoEntity {
    private int idEnumFormaPago;
    private String descripción;

    @Id
    @Column(name = "id_enumFormaPago", nullable = false)
    public int getIdEnumFormaPago() {
        return idEnumFormaPago;
    }

    public void setIdEnumFormaPago(int idEnumFormaPago) {
        this.idEnumFormaPago = idEnumFormaPago;
    }

    @Basic
    @Column(name = "descripción", nullable = false, length = 15)
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

        EnumFormaPagoEntity that = (EnumFormaPagoEntity) o;

        if (idEnumFormaPago != that.idEnumFormaPago) return false;
        if (descripción != null ? !descripción.equals(that.descripción) : that.descripción != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEnumFormaPago;
        result = 31 * result + (descripción != null ? descripción.hashCode() : 0);
        return result;
    }
}
