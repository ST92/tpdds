package Entities.tpdds;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "hijo_modificado", schema = "tp_dds", catalog = "")
public class HijoModificadoEntity {
    private int dni;
    private Date fechaNac;
    private int idEnumSexo;
    private int idEnumEstadoCivil;
    private int nroPolizaModif;

    @Id
    @Column(name = "dni", nullable = false)
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Basic
    @Column(name = "fecha_nac", nullable = false)
    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Basic
    @Column(name = "id_enumSexo", nullable = false)
    public int getIdEnumSexo() {
        return idEnumSexo;
    }

    public void setIdEnumSexo(int idEnumSexo) {
        this.idEnumSexo = idEnumSexo;
    }

    @Basic
    @Column(name = "id_enumEstadoCivil", nullable = false)
    public int getIdEnumEstadoCivil() {
        return idEnumEstadoCivil;
    }

    public void setIdEnumEstadoCivil(int idEnumEstadoCivil) {
        this.idEnumEstadoCivil = idEnumEstadoCivil;
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

        HijoModificadoEntity that = (HijoModificadoEntity) o;

        if (dni != that.dni) return false;
        if (idEnumSexo != that.idEnumSexo) return false;
        if (idEnumEstadoCivil != that.idEnumEstadoCivil) return false;
        if (nroPolizaModif != that.nroPolizaModif) return false;
        if (fechaNac != null ? !fechaNac.equals(that.fechaNac) : that.fechaNac != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dni;
        result = 31 * result + (fechaNac != null ? fechaNac.hashCode() : 0);
        result = 31 * result + idEnumSexo;
        result = 31 * result + idEnumEstadoCivil;
        result = 31 * result + nroPolizaModif;
        return result;
    }
}
