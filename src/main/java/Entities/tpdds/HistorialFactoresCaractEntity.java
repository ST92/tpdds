package Entities.tpdds;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "historial_factores_caract", schema = "tp_dds", catalog = "")
@IdClass(HistorialFactoresCaractEntityPK.class)
public class HistorialFactoresCaractEntity {
    private int idHistCaract;
    private int idCaract;
    private int idUsuario;
    private double ajustePorHijo;
    private double derechoDeEmisión;
    private double descuentoPorUnidadAdicional;
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;

    @Id
    @Column(name = "id_hist_caract", nullable = false)
    public int getIdHistCaract() {
        return idHistCaract;
    }

    public void setIdHistCaract(int idHistCaract) {
        this.idHistCaract = idHistCaract;
    }

    @Id
    @Column(name = "id_caract", nullable = false)
    public int getIdCaract() {
        return idCaract;
    }

    public void setIdCaract(int idCaract) {
        this.idCaract = idCaract;
    }

    @Id
    @Column(name = "id_usuario", nullable = false)
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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
    @Column(name = "derecho_de_emisión", nullable = false, precision = 0)
    public double getDerechoDeEmisión() {
        return derechoDeEmisión;
    }

    public void setDerechoDeEmisión(double derechoDeEmisión) {
        this.derechoDeEmisión = derechoDeEmisión;
    }

    @Basic
    @Column(name = "descuento_por_unidad_adicional", nullable = false, precision = 0)
    public double getDescuentoPorUnidadAdicional() {
        return descuentoPorUnidadAdicional;
    }

    public void setDescuentoPorUnidadAdicional(double descuentoPorUnidadAdicional) {
        this.descuentoPorUnidadAdicional = descuentoPorUnidadAdicional;
    }

    @Basic
    @Column(name = "fecha_inicio_vigencia", nullable = false)
    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    @Basic
    @Column(name = "fecha_fin_vigencia", nullable = false)
    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistorialFactoresCaractEntity that = (HistorialFactoresCaractEntity) o;

        if (idHistCaract != that.idHistCaract) return false;
        if (idCaract != that.idCaract) return false;
        if (idUsuario != that.idUsuario) return false;
        if (Double.compare(that.ajustePorHijo, ajustePorHijo) != 0) return false;
        if (Double.compare(that.derechoDeEmisión, derechoDeEmisión) != 0) return false;
        if (Double.compare(that.descuentoPorUnidadAdicional, descuentoPorUnidadAdicional) != 0) return false;
        if (fechaInicioVigencia != null ? !fechaInicioVigencia.equals(that.fechaInicioVigencia) : that.fechaInicioVigencia != null)
            return false;
        if (fechaFinVigencia != null ? !fechaFinVigencia.equals(that.fechaFinVigencia) : that.fechaFinVigencia != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idHistCaract;
        result = 31 * result + idCaract;
        result = 31 * result + idUsuario;
        temp = Double.doubleToLongBits(ajustePorHijo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(derechoDeEmisión);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(descuentoPorUnidadAdicional);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fechaInicioVigencia != null ? fechaInicioVigencia.hashCode() : 0);
        result = 31 * result + (fechaFinVigencia != null ? fechaFinVigencia.hashCode() : 0);
        return result;
    }
}
