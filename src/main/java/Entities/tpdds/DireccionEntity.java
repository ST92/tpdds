package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "direccion", schema = "tp_dds", catalog = "")
public class DireccionEntity {
    private int idDireccion;
    private String nombreCalle;
    private int numCalle;
    private String numDpto;

    @Id
    @Column(name = "id_direccion", nullable = false)
    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    @Basic
    @Column(name = "nombre_calle", nullable = false, length = 50)
    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    @Basic
    @Column(name = "num_calle", nullable = false)
    public int getNumCalle() {
        return numCalle;
    }

    public void setNumCalle(int numCalle) {
        this.numCalle = numCalle;
    }

    @Basic
    @Column(name = "num_dpto", nullable = false, length = 4)
    public String getNumDpto() {
        return numDpto;
    }

    public void setNumDpto(String numDpto) {
        this.numDpto = numDpto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DireccionEntity that = (DireccionEntity) o;

        if (idDireccion != that.idDireccion) return false;
        if (numCalle != that.numCalle) return false;
        if (nombreCalle != null ? !nombreCalle.equals(that.nombreCalle) : that.nombreCalle != null) return false;
        if (numDpto != null ? !numDpto.equals(that.numDpto) : that.numDpto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDireccion;
        result = 31 * result + (nombreCalle != null ? nombreCalle.hashCode() : 0);
        result = 31 * result + numCalle;
        result = 31 * result + (numDpto != null ? numDpto.hashCode() : 0);
        return result;
    }
}
