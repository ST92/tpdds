package Entities.tpdds;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "poliza_modificada", schema = "tp_dds", catalog = "")
public class PolizaModificadaEntity {
    private int nroPolizaModif;
    private int nroPoliza;
    private int anioVehiculo;
    private String patente;
    private String motor;
    private String chasis;
    private double kmAnio;
    private int numSiniestrosAnio;
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;
    private int nroModificacion;

    @Id
    @Column(name = "nro_poliza_modif", nullable = false)
    public int getNroPolizaModif() {
        return nroPolizaModif;
    }

    public void setNroPolizaModif(int nroPolizaModif) {
        this.nroPolizaModif = nroPolizaModif;
    }

    @Basic
    @Column(name = "nro_poliza", nullable = false)
    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    @Basic
    @Column(name = "anio_vehiculo", nullable = false)
    public int getAnioVehiculo() {
        return anioVehiculo;
    }

    public void setAnioVehiculo(int anioVehiculo) {
        this.anioVehiculo = anioVehiculo;
    }

    @Basic
    @Column(name = "patente", nullable = false, length = 9)
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Basic
    @Column(name = "motor", nullable = false, length = 20)
    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Basic
    @Column(name = "chasis", nullable = false, length = 20)
    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    @Basic
    @Column(name = "km_anio", nullable = false, precision = 0)
    public double getKmAnio() {
        return kmAnio;
    }

    public void setKmAnio(double kmAnio) {
        this.kmAnio = kmAnio;
    }

    @Basic
    @Column(name = "num_siniestros_anio", nullable = false)
    public int getNumSiniestrosAnio() {
        return numSiniestrosAnio;
    }

    public void setNumSiniestrosAnio(int numSiniestrosAnio) {
        this.numSiniestrosAnio = numSiniestrosAnio;
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
    @Column(name = "nro_modificacion", nullable = false)
    public int getNroModificacion() {
        return nroModificacion;
    }

    public void setNroModificacion(int nroModificacion) {
        this.nroModificacion = nroModificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PolizaModificadaEntity that = (PolizaModificadaEntity) o;

        if (nroPolizaModif != that.nroPolizaModif) return false;
        if (nroPoliza != that.nroPoliza) return false;
        if (anioVehiculo != that.anioVehiculo) return false;
        if (Double.compare(that.kmAnio, kmAnio) != 0) return false;
        if (numSiniestrosAnio != that.numSiniestrosAnio) return false;
        if (nroModificacion != that.nroModificacion) return false;
        if (patente != null ? !patente.equals(that.patente) : that.patente != null) return false;
        if (motor != null ? !motor.equals(that.motor) : that.motor != null) return false;
        if (chasis != null ? !chasis.equals(that.chasis) : that.chasis != null) return false;
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
        result = nroPolizaModif;
        result = 31 * result + nroPoliza;
        result = 31 * result + anioVehiculo;
        result = 31 * result + (patente != null ? patente.hashCode() : 0);
        result = 31 * result + (motor != null ? motor.hashCode() : 0);
        result = 31 * result + (chasis != null ? chasis.hashCode() : 0);
        temp = Double.doubleToLongBits(kmAnio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + numSiniestrosAnio;
        result = 31 * result + (fechaInicioVigencia != null ? fechaInicioVigencia.hashCode() : 0);
        result = 31 * result + (fechaFinVigencia != null ? fechaFinVigencia.hashCode() : 0);
        result = 31 * result + nroModificacion;
        return result;
    }
}
