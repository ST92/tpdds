package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "localidad", schema = "tp_dds", catalog = "")
public class LocalidadEntity {
    private int idLocalidad;
    private String nombreLocalidad;
    private String codigoPostal;
    private int idProvincia;

    @Id
    @Column(name = "id_localidad", nullable = false)
    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    @Basic
    @Column(name = "nombre_localidad", nullable = false, length = 50)
    public String getNombreLocalidad() {
        return nombreLocalidad;
    }

    public void setNombreLocalidad(String nombreLocalidad) {
        this.nombreLocalidad = nombreLocalidad;
    }

    @Basic
    @Column(name = "codigo_postal", nullable = false, length = 6)
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Basic
    @Column(name = "id_provincia", nullable = false)
    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocalidadEntity that = (LocalidadEntity) o;

        if (idLocalidad != that.idLocalidad) return false;
        if (idProvincia != that.idProvincia) return false;
        if (nombreLocalidad != null ? !nombreLocalidad.equals(that.nombreLocalidad) : that.nombreLocalidad != null)
            return false;
        if (codigoPostal != null ? !codigoPostal.equals(that.codigoPostal) : that.codigoPostal != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLocalidad;
        result = 31 * result + (nombreLocalidad != null ? nombreLocalidad.hashCode() : 0);
        result = 31 * result + (codigoPostal != null ? codigoPostal.hashCode() : 0);
        result = 31 * result + idProvincia;
        return result;
    }
}
