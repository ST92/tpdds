package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "siniestros_fc", schema = "tp_dds", catalog = "")
public class SiniestrosFcEntity {
    private int idSiniestros;
    private String descripcion;
    private double valor;

    @Id
    @Column(name = "id_siniestros", nullable = false)
    public int getIdSiniestros() {
        return idSiniestros;
    }

    public void setIdSiniestros(int idSiniestros) {
        this.idSiniestros = idSiniestros;
    }

    @Basic
    @Column(name = "descripcion", nullable = false, length = 50)
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "valor", nullable = false, precision = 0)
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SiniestrosFcEntity that = (SiniestrosFcEntity) o;

        if (idSiniestros != that.idSiniestros) return false;
        if (Double.compare(that.valor, valor) != 0) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idSiniestros;
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        temp = Double.doubleToLongBits(valor);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
