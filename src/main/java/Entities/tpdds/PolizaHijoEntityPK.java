package Entities.tpdds;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PolizaHijoEntityPK implements Serializable {
    private String dni;
    private int nroPoliza;

    @Column(name = "dni", nullable = false, length = 8)
    @Id
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Column(name = "nro_poliza", nullable = false)
    @Id
    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PolizaHijoEntityPK that = (PolizaHijoEntityPK) o;

        if (nroPoliza != that.nroPoliza) return false;
        if (dni != null ? !dni.equals(that.dni) : that.dni != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dni != null ? dni.hashCode() : 0;
        result = 31 * result + nroPoliza;
        return result;
    }
}
