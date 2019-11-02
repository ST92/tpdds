package Entities.tpdds;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "historial_fact_ajustes_por_km", schema = "tp_dds", catalog = "")
@IdClass(HistorialFactAjustesPorKmEntityPK.class)
public class HistorialFactAjustesPorKmEntity {
    private int idHistFactAjustesKm;
    private int idAjusteskm;
    private int idUsuario;
    private double ajustePorKmRealizados;
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;

    @Id
    @Column(name = "id_hist_fact_ajustesKM", nullable = false)
    public int getIdHistFactAjustesKm() {
        return idHistFactAjustesKm;
    }

    public void setIdHistFactAjustesKm(int idHistFactAjustesKm) {
        this.idHistFactAjustesKm = idHistFactAjustesKm;
    }

    @Id
    @Column(name = "id_ajusteskm", nullable = false)
    public int getIdAjusteskm() {
        return idAjusteskm;
    }

    public void setIdAjusteskm(int idAjusteskm) {
        this.idAjusteskm = idAjusteskm;
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
    @Column(name = "ajuste_por_km_realizados", nullable = false, precision = 0)
    public double getAjustePorKmRealizados() {
        return ajustePorKmRealizados;
    }

    public void setAjustePorKmRealizados(double ajustePorKmRealizados) {
        this.ajustePorKmRealizados = ajustePorKmRealizados;
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

        HistorialFactAjustesPorKmEntity that = (HistorialFactAjustesPorKmEntity) o;

        if (idHistFactAjustesKm != that.idHistFactAjustesKm) return false;
        if (idAjusteskm != that.idAjusteskm) return false;
        if (idUsuario != that.idUsuario) return false;
        if (Double.compare(that.ajustePorKmRealizados, ajustePorKmRealizados) != 0) return false;
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
        result = idHistFactAjustesKm;
        result = 31 * result + idAjusteskm;
        result = 31 * result + idUsuario;
        temp = Double.doubleToLongBits(ajustePorKmRealizados);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fechaInicioVigencia != null ? fechaInicioVigencia.hashCode() : 0);
        result = 31 * result + (fechaFinVigencia != null ? fechaFinVigencia.hashCode() : 0);
        return result;
    }
}
