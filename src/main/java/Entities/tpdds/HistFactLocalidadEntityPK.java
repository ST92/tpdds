package Entities.tpdds;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class HistFactLocalidadEntityPK implements Serializable {
    private int idHistFactLocalidad;
    private int idLocalidad;
    private int idUsuario;

    @Column(name = "id_hist_fact_localidad", nullable = false)
    @Id
    public int getIdHistFactLocalidad() {
        return idHistFactLocalidad;
    }

    public void setIdHistFactLocalidad(int idHistFactLocalidad) {
        this.idHistFactLocalidad = idHistFactLocalidad;
    }

    @Column(name = "id_localidad", nullable = false)
    @Id
    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    @Column(name = "id_usuario", nullable = false)
    @Id
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistFactLocalidadEntityPK that = (HistFactLocalidadEntityPK) o;

        if (idHistFactLocalidad != that.idHistFactLocalidad) return false;
        if (idLocalidad != that.idLocalidad) return false;
        if (idUsuario != that.idUsuario) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHistFactLocalidad;
        result = 31 * result + idLocalidad;
        result = 31 * result + idUsuario;
        return result;
    }
}
