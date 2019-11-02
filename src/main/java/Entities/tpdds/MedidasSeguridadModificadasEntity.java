package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "medidas_seguridad_modificadas", schema = "tp_dds", catalog = "")
public class MedidasSeguridadModificadasEntity {
    private int idMedidasSeguridadM;
    private int nroPolizaModif;
    private String descripcion;
    private int factor;

    @Id
    @Column(name = "id_MedidasSeguridadM", nullable = false)
    public int getIdMedidasSeguridadM() {
        return idMedidasSeguridadM;
    }

    public void setIdMedidasSeguridadM(int idMedidasSeguridadM) {
        this.idMedidasSeguridadM = idMedidasSeguridadM;
    }

    @Basic
    @Column(name = "nro_poliza_modif", nullable = false)
    public int getNroPolizaModif() {
        return nroPolizaModif;
    }

    public void setNroPolizaModif(int nroPolizaModif) {
        this.nroPolizaModif = nroPolizaModif;
    }

    @Basic
    @Column(name = "descripcion", nullable = false, length = 50)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "factor", nullable = false)
    public int getFactor() {
        return factor;
    }

    public void setFactor(int factor) {
        this.factor = factor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MedidasSeguridadModificadasEntity that = (MedidasSeguridadModificadasEntity) o;

        if (idMedidasSeguridadM != that.idMedidasSeguridadM) return false;
        if (nroPolizaModif != that.nroPolizaModif) return false;
        if (factor != that.factor) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMedidasSeguridadM;
        result = 31 * result + nroPolizaModif;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + factor;
        return result;
    }
}
