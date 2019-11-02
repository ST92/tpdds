package Entities.tpdds;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "hist_fact_vehiculo", schema = "tp_dds", catalog = "")
@IdClass(HistFactVehiculoEntityPK.class)
public class HistFactVehiculoEntity {
    private int idHistFactVehiculo;
    private int idModelo;
    private int idUsuario;
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;
    private double roboPorModelo;

    @Id
    @Column(name = "id_hist_fact_vehiculo", nullable = false)
    public int getIdHistFactVehiculo() {
        return idHistFactVehiculo;
    }

    public void setIdHistFactVehiculo(int idHistFactVehiculo) {
        this.idHistFactVehiculo = idHistFactVehiculo;
    }

    @Id
    @Column(name = "id_modelo", nullable = false)
    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
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

    @Basic
    @Column(name = "robo_por_modelo", nullable = false, precision = 0)
    public double getRoboPorModelo() {
        return roboPorModelo;
    }

    public void setRoboPorModelo(double roboPorModelo) {
        this.roboPorModelo = roboPorModelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistFactVehiculoEntity that = (HistFactVehiculoEntity) o;

        if (idHistFactVehiculo != that.idHistFactVehiculo) return false;
        if (idModelo != that.idModelo) return false;
        if (idUsuario != that.idUsuario) return false;
        if (Double.compare(that.roboPorModelo, roboPorModelo) != 0) return false;
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
        result = idHistFactVehiculo;
        result = 31 * result + idModelo;
        result = 31 * result + idUsuario;
        result = 31 * result + (fechaInicioVigencia != null ? fechaInicioVigencia.hashCode() : 0);
        result = 31 * result + (fechaFinVigencia != null ? fechaFinVigencia.hashCode() : 0);
        temp = Double.doubleToLongBits(roboPorModelo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
