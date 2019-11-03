package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "tipo_cobertura", schema = "tp_dds", catalog = "")
public class TipoCoberturaEntity {
    private int idCobertura;
    private int idEnumTipoCobertura;
    private String descripcion;

    @Id
    @Column(name = "id_cobertura", nullable = false)
    public int getIdCobertura() {
        return idCobertura;
    }

    public void setIdCobertura(int idCobertura) {
        this.idCobertura = idCobertura;
    }

    @Basic
    @Column(name = "id_enumTipoCobertura", nullable = false)
    public int getIdEnumTipoCobertura() {
        return idEnumTipoCobertura;
    }

    public void setIdEnumTipoCobertura(int idEnumTipoCobertura) {
        this.idEnumTipoCobertura = idEnumTipoCobertura;
    }

    @Basic
    @Column(name = "descripcion", nullable = false, length = 150)
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

        TipoCoberturaEntity that = (TipoCoberturaEntity) o;

        if (idCobertura != that.idCobertura) return false;
        if (idEnumTipoCobertura != that.idEnumTipoCobertura) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCobertura;
        result = 31 * result + idEnumTipoCobertura;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        return result;
    }
}
