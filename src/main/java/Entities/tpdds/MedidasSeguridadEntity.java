package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "medidas_seguridad", schema = "tp_dds", catalog = "")
public class MedidasSeguridadEntity {
    private int idMedidasSeguridad;
    private String descripcion;
    private double factor;

    @Id
    @Column(name = "id_MedidasSeguridad", nullable = false)
    public int getIdMedidasSeguridad() {
        return idMedidasSeguridad;
    }

    public void setIdMedidasSeguridad(int idMedidasSeguridad) {
        this.idMedidasSeguridad = idMedidasSeguridad;
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
    @Column(name = "factor", nullable = false, precision = 0)
    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) {
        this.factor = factor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MedidasSeguridadEntity that = (MedidasSeguridadEntity) o;

        if (idMedidasSeguridad != that.idMedidasSeguridad) return false;
        if (Double.compare(that.factor, factor) != 0) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idMedidasSeguridad;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        temp = Double.doubleToLongBits(factor);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
