package Entities.tpdds;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "hijo", schema = "tp_dds", catalog = "")
public class HijoEntity {
    private int dni;
    private Date fechaNac;
    private int idEnumSexo;
    private int idEnumEstadoCivil;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HijoEntity that = (HijoEntity) o;

        if (dni != that.dni) return false;
        if (idEnumSexo != that.idEnumSexo) return false;
        if (idEnumEstadoCivil != that.idEnumEstadoCivil) return false;
        if (fechaNac != null ? !fechaNac.equals(that.fechaNac) : that.fechaNac != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dni;
        result = 31 * result + (fechaNac != null ? fechaNac.hashCode() : 0);
        result = 31 * result + idEnumSexo;
        result = 31 * result + idEnumEstadoCivil;
        return result;
    }
}
