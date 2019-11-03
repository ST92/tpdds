package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "modelo", schema = "tp_dds", catalog = "")
public class ModeloEntity {
    private int idModelo;
    private int idMarca;
    private String nombre;
    private double roboPorModelo;

    @Id
    @Column(name = "id_modelo", nullable = false)
    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    @Basic
    @Column(name = "id_marca", nullable = false)
    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "robo_por_modelo", nullable = false, precision = 0)
    public double getRoboPorModelo() {
        return roboPorModelo;
    }

    public void setRoboPorModelo(double roboPorModelo) {
        this.roboPorModelo = roboPorModelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModeloEntity that = (ModeloEntity) o;

        if (idModelo != that.idModelo) return false;
        if (idMarca != that.idMarca) return false;
        if (Double.compare(that.roboPorModelo, roboPorModelo) != 0) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idModelo;
        result = 31 * result + idMarca;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        temp = Double.doubleToLongBits(roboPorModelo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
