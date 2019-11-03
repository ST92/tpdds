package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "factores_caracteristicas", schema = "tp_dds", catalog = "")
public class FactoresCaracteristicasEntity {
    private int idCaract;
    private double ajustePorHijo;
    private double derechoDeEmision;
    private double descuentoPorUnidadAdicional;

    @Id
    @Column(name = "id_caract", nullable = false)
    public int getIdCaract() {
        return idCaract;
    }

    public void setIdCaract(int idCaract) {
        this.idCaract = idCaract;
    }

    @Basic
    @Column(name = "ajuste_por_hijo", nullable = false, precision = 0)
    public double getAjustePorHijo() {
        return ajustePorHijo;
    }

    public void setAjustePorHijo(double ajustePorHijo) {
        this.ajustePorHijo = ajustePorHijo;
    }

    @Basic
    @Column(name = "derecho_de_emision", nullable = false, precision = 0)
    public double getDerechoDeEmision() {
        return derechoDeEmision;
    }

    public void setDerechoDeEmision(double derechoDeEmision) {
        this.derechoDeEmision = derechoDeEmision;
    }

    @Basic
    @Column(name = "descuento_por_unidad_adicional", nullable = false, precision = 0)
    public double getDescuentoPorUnidadAdicional() {
        return descuentoPorUnidadAdicional;
    }

    public void setDescuentoPorUnidadAdicional(double descuentoPorUnidadAdicional) {
        this.descuentoPorUnidadAdicional = descuentoPorUnidadAdicional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FactoresCaracteristicasEntity that = (FactoresCaracteristicasEntity) o;

        if (idCaract != that.idCaract) return false;
        if (Double.compare(that.ajustePorHijo, ajustePorHijo) != 0) return false;
        if (Double.compare(that.derechoDeEmision, derechoDeEmision) != 0) return false;
        if (Double.compare(that.descuentoPorUnidadAdicional, descuentoPorUnidadAdicional) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idCaract;
        temp = Double.doubleToLongBits(ajustePorHijo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(derechoDeEmision);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(descuentoPorUnidadAdicional);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
