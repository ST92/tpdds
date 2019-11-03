package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "enum_tipo_cobertura", schema = "tp_dds", catalog = "")
public class EnumTipoCoberturaEntity {
    private int idEnumTipoCobertura;
    private String descripción;

    @Id
    @Column(name = "id_enumTipoCobertura", nullable = false)
    public int getIdEnumTipoCobertura() {
        return idEnumTipoCobertura;
    }

    public void setIdEnumTipoCobertura(int idEnumTipoCobertura) {
        this.idEnumTipoCobertura = idEnumTipoCobertura;
    }

    @Basic
    @Column(name = "descripción", nullable = false, length = 50)
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

        EnumTipoCoberturaEntity that = (EnumTipoCoberturaEntity) o;

        if (idEnumTipoCobertura != that.idEnumTipoCobertura) return false;
        if (descripción != null ? !descripción.equals(that.descripción) : that.descripción != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEnumTipoCobertura;
        result = 31 * result + (descripción != null ? descripción.hashCode() : 0);
        return result;
    }
}
