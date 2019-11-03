package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "ajustes_por_km", schema = "tp_dds", catalog = "")
public class AjustesPorKmEntity {
    private int idAjusteskm;
    private double ajustePorKmRealizados;

    @Id
    @Column(name = "id_ajusteskm", nullable = false)
    public int getIdAjusteskm() {
        return idAjusteskm;
    }

    public void setIdAjusteskm(int idAjusteskm) {
        this.idAjusteskm = idAjusteskm;
    }

    @Basic
    @Column(name = "ajuste_por_km_realizados", nullable = false, precision = 0)
    public double getAjustePorKmRealizados() {
        return ajustePorKmRealizados;
    }

    public void setAjustePorKmRealizados(double ajustePorKmRealizados) {
        this.ajustePorKmRealizados = ajustePorKmRealizados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AjustesPorKmEntity that = (AjustesPorKmEntity) o;

        if (idAjusteskm != that.idAjusteskm) return false;
        if (Double.compare(that.ajustePorKmRealizados, ajustePorKmRealizados) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idAjusteskm;
        temp = Double.doubleToLongBits(ajustePorKmRealizados);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
