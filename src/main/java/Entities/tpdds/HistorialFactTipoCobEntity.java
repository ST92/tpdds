package Entities.tpdds;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "historial_fact_tipo_cob", schema = "tp_dds", catalog = "")
@IdClass(HistorialFactTipoCobEntityPK.class)
public class HistorialFactTipoCobEntity {
    private int idHistFactTipoCob;
    private int idCobertura;
    private int idUsuario;
    private double valor;
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;

    @Id
    @Column(name = "id_hist_fact_tipo_cob", nullable = false)
    public int getIdHistFactTipoCob() {
        return idHistFactTipoCob;
    }

    public void setIdHistFactTipoCob(int idHistFactTipoCob) {
        this.idHistFactTipoCob = idHistFactTipoCob;
    }

    @Id
    @Column(name = "id_cobertura", nullable = false)
    public int getIdCobertura() {
        return idCobertura;
    }

    public void setIdCobertura(int idCobertura) {
        this.idCobertura = idCobertura;
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
    @Column(name = "valor", nullable = false, precision = 0)
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

        HistorialFactTipoCobEntity that = (HistorialFactTipoCobEntity) o;

        if (idHistFactTipoCob != that.idHistFactTipoCob) return false;
        if (idCobertura != that.idCobertura) return false;
        if (idUsuario != that.idUsuario) return false;
        if (Double.compare(that.valor, valor) != 0) return false;
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
        result = idHistFactTipoCob;
        result = 31 * result + idCobertura;
        result = 31 * result + idUsuario;
        temp = Double.doubleToLongBits(valor);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fechaInicioVigencia != null ? fechaInicioVigencia.hashCode() : 0);
        result = 31 * result + (fechaFinVigencia != null ? fechaFinVigencia.hashCode() : 0);
        return result;
    }
}
