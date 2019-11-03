package Entities.tpdds;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class HistFactVehiculoEntityPK implements Serializable {
    private int idHistFactVehiculo;
    private int idModelo;
    private int idUsuario;

    @Column(name = "id_hist_fact_vehiculo", nullable = false)
    @Id
    public int getIdHistFactVehiculo() {
        return idHistFactVehiculo;
    }

    public void setIdHistFactVehiculo(int idHistFactVehiculo) {
        this.idHistFactVehiculo = idHistFactVehiculo;
    }

    @Column(name = "id_modelo", nullable = false)
    @Id
    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
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

        HistFactVehiculoEntityPK that = (HistFactVehiculoEntityPK) o;

        if (idHistFactVehiculo != that.idHistFactVehiculo) return false;
        if (idModelo != that.idModelo) return false;
        if (idUsuario != that.idUsuario) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHistFactVehiculo;
        result = 31 * result + idModelo;
        result = 31 * result + idUsuario;
        return result;
    }
}
