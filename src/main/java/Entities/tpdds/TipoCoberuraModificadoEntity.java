package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "tipo_coberura_modificado", schema = "tp_dds", catalog = "")
public class TipoCoberuraModificadoEntity {
    private int idCobertura;
    private int tipo;
    private String descripcion;
    private int nroPolizaModif;

    @Id
    @Column(name = "id_cobertura", nullable = false)
    public int getIdCobertura() {
        return idCobertura;
    }

    public void setIdCobertura(int idCobertura) {
        this.idCobertura = idCobertura;
    }

    @Basic
    @Column(name = "tipo", nullable = false)
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Basic
    @Column(name = "descripcion", nullable = false, length = 150)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "nro_poliza_modif", nullable = false)
    public int getNroPolizaModif() {
        return nroPolizaModif;
    }

    public void setNroPolizaModif(int nroPolizaModif) {
        this.nroPolizaModif = nroPolizaModif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipoCoberuraModificadoEntity that = (TipoCoberuraModificadoEntity) o;

        if (idCobertura != that.idCobertura) return false;
        if (tipo != that.tipo) return false;
        if (nroPolizaModif != that.nroPolizaModif) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCobertura;
        result = 31 * result + tipo;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + nroPolizaModif;
        return result;
    }
}
