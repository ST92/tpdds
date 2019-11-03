package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "poliza_hijo", schema = "tp_dds", catalog = "")
@IdClass(PolizaHijoEntityPK.class)
public class PolizaHijoEntity {
    private String dni;
    private int nroPoliza;

    @Id
    @Column(name = "dni", nullable = false, length = 8)
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Id
    @Column(name = "nro_poliza", nullable = false)
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

        PolizaHijoEntity that = (PolizaHijoEntity) o;

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
