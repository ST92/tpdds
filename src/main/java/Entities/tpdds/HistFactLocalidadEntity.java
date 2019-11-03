package Entities.tpdds;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "hist_fact_localidad", schema = "tp_dds", catalog = "")
@IdClass(HistFactLocalidadEntityPK.class)
public class HistFactLocalidadEntity {
    private int idHistFactLocalidad;
    private int idLocalidad;
    private int idUsuario;
    private double factLocalidad;
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;

    @Id
    @Column(name = "id_hist_fact_localidad", nullable = false)
    public int getIdHistFactLocalidad() {
        return idHistFactLocalidad;
    }

    public void setIdHistFactLocalidad(int idHistFactLocalidad) {
        this.idHistFactLocalidad = idHistFactLocalidad;
    }

    @Id
    @Column(name = "id_localidad", nullable = false)
    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
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
    @Column(name = "fact_localidad", nullable = false, precision = 0)
    public double getFactLocalidad() {
        return factLocalidad;
    }

    public void setFactLocalidad(double factLocalidad) {
        this.factLocalidad = factLocalidad;
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

        HistFactLocalidadEntity that = (HistFactLocalidadEntity) o;

        if (idHistFactLocalidad != that.idHistFactLocalidad) return false;
        if (idLocalidad != that.idLocalidad) return false;
        if (idUsuario != that.idUsuario) return false;
        if (Double.compare(that.factLocalidad, factLocalidad) != 0) return false;
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
        result = idHistFactLocalidad;
        result = 31 * result + idLocalidad;
        result = 31 * result + idUsuario;
        temp = Double.doubleToLongBits(factLocalidad);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fechaInicioVigencia != null ? fechaInicioVigencia.hashCode() : 0);
        result = 31 * result + (fechaFinVigencia != null ? fechaFinVigencia.hashCode() : 0);
        return result;
    }
}
