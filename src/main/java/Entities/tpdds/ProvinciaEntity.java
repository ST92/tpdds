package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "provincia", schema = "tp_dds", catalog = "")
public class ProvinciaEntity {
    private int idProvincia;
    private String nombreProvincia;

    @Id
    @Column(name = "id_provincia", nullable = false)
    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    @Basic
    @Column(name = "nombre_provincia", nullable = false, length = 50)
    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProvinciaEntity that = (ProvinciaEntity) o;

        if (idProvincia != that.idProvincia) return false;
        if (nombreProvincia != null ? !nombreProvincia.equals(that.nombreProvincia) : that.nombreProvincia != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProvincia;
        result = 31 * result + (nombreProvincia != null ? nombreProvincia.hashCode() : 0);
        return result;
    }
}
