package Entities.tpdds;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class HistorialFactoresCaractEntityPK implements Serializable {
    private int idHistCaract;
    private int idCaract;
    private int idUsuario;

    @Column(name = "id_hist_caract", nullable = false)
    @Id
    public int getIdHistCaract() {
        return idHistCaract;
    }

    public void setIdHistCaract(int idHistCaract) {
        this.idHistCaract = idHistCaract;
    }

    @Column(name = "id_caract", nullable = false)
    @Id
    public int getIdCaract() {
        return idCaract;
    }

    public void setIdCaract(int idCaract) {
        this.idCaract = idCaract;
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

        HistorialFactoresCaractEntityPK that = (HistorialFactoresCaractEntityPK) o;

        if (idHistCaract != that.idHistCaract) return false;
        if (idCaract != that.idCaract) return false;
        if (idUsuario != that.idUsuario) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHistCaract;
        result = 31 * result + idCaract;
        result = 31 * result + idUsuario;
        return result;
    }
}
