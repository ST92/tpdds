package Entities.tpdds;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "hist_fact_med_seg", schema = "tp_dds", catalog = "")
@IdClass(HistFactMedSegEntityPK.class)
public class HistFactMedSegEntity {
    private int idHistFactMedSeg;
    private int idMedidasSeguridad;
    private int idUsuario;
    private String descripcion;
    private double factor;
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;

    @Id
    @Column(name = "id_hist_fact_med_seg", nullable = false)
    public int getIdHistFactMedSeg() {
        return idHistFactMedSeg;
    }

    public void setIdHistFactMedSeg(int idHistFactMedSeg) {
        this.idHistFactMedSeg = idHistFactMedSeg;
    }

    @Id
    @Column(name = "id_MedidasSeguridad", nullable = false)
    public int getIdMedidasSeguridad() {
        return idMedidasSeguridad;
    }

    public void setIdMedidasSeguridad(int idMedidasSeguridad) {
        this.idMedidasSeguridad = idMedidasSeguridad;
    }

    @Id
    @Column(name = "id_usuario", nullable = false)
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    @Basic
    @Column(name = "fecha_inicio_vigencia", nullable = false)
    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    @Basic
    @Column(name = "fecha_fin_vigencia", nullable = false)
    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistFactMedSegEntity that = (HistFactMedSegEntity) o;

        if (idHistFactMedSeg != that.idHistFactMedSeg) return false;
        if (idMedidasSeguridad != that.idMedidasSeguridad) return false;
        if (idUsuario != that.idUsuario) return false;
        if (Double.compare(that.factor, factor) != 0) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (fechaInicioVigencia != null ? !fechaInicioVigencia.equals(that.fechaInicioVigencia) : that.fechaInicioVigencia != null)
            return false;
        if (fechaFinVigencia != null ? !fechaFinVigencia.equals(that.fechaFinVigencia) : that.fechaFinVigencia != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idHistFactMedSeg;
        result = 31 * result + idMedidasSeguridad;
        result = 31 * result + idUsuario;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        temp = Double.doubleToLongBits(factor);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fechaInicioVigencia != null ? fechaInicioVigencia.hashCode() : 0);
        result = 31 * result + (fechaFinVigencia != null ? fechaFinVigencia.hashCode() : 0);
        return result;
    }
}
