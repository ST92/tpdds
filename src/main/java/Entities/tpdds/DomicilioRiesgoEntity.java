package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "domicilio_riesgo", schema = "tp_dds", catalog = "")
public class DomicilioRiesgoEntity {
    private int idDom;
    private int idLocalidad;

    @Id
    @Column(name = "id_dom", nullable = false)
    public int getIdDom() {
        return idDom;
    }

    public void setIdDom(int idDom) {
        this.idDom = idDom;
    }

    @Basic
    @Column(name = "id_localidad", nullable = false)
    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DomicilioRiesgoEntity that = (DomicilioRiesgoEntity) o;

        if (idDom != that.idDom) return false;
        if (idLocalidad != that.idLocalidad) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idDom;
        result = 31 * result + idLocalidad;
        return result;
    }
}
