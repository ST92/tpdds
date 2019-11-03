package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "marca", schema = "tp_dds", catalog = "")
public class MarcaEntity {
    private int idMarca;
    private String nombre;

    @Id
    @Column(name = "id_marca", nullable = false)
    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 20)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarcaEntity that = (MarcaEntity) o;

        if (idMarca != that.idMarca) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMarca;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        return result;
    }
}
