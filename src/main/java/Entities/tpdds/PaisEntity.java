package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "pais", schema = "tp_dds", catalog = "")
public class PaisEntity {
    private int idPais;
    private String nombrePais;

    @Id
    @Column(name = "id_pais", nullable = false)
    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    @Basic
    @Column(name = "nombre_pais", nullable = false, length = 50)
    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaisEntity that = (PaisEntity) o;

        if (idPais != that.idPais) return false;
        if (nombrePais != null ? !nombrePais.equals(that.nombrePais) : that.nombrePais != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPais;
        result = 31 * result + (nombrePais != null ? nombrePais.hashCode() : 0);
        return result;
    }
}
