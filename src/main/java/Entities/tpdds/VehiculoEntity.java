package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "vehiculo", schema = "tp_dds", catalog = "")
public class VehiculoEntity {
    private int idAuto;
    private int idModelo;
    private int anioVehiculo;
    private String motor;
    private String chasis;
    private String patente;

    @Id
    @Column(name = "id_auto", nullable = false)
    public int getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(int idAuto) {
        this.idAuto = idAuto;
    }

    @Basic
    @Column(name = "id_modelo", nullable = false)
    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
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
    @Column(name = "patente", nullable = false, length = 15)
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiculoEntity that = (VehiculoEntity) o;

        if (idAuto != that.idAuto) return false;
        if (idModelo != that.idModelo) return false;
        if (anioVehiculo != that.anioVehiculo) return false;
        if (motor != null ? !motor.equals(that.motor) : that.motor != null) return false;
        if (chasis != null ? !chasis.equals(that.chasis) : that.chasis != null) return false;
        if (patente != null ? !patente.equals(that.patente) : that.patente != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAuto;
        result = 31 * result + idModelo;
        result = 31 * result + anioVehiculo;
        result = 31 * result + (motor != null ? motor.hashCode() : 0);
        result = 31 * result + (chasis != null ? chasis.hashCode() : 0);
        result = 31 * result + (patente != null ? patente.hashCode() : 0);
        return result;
    }
}
