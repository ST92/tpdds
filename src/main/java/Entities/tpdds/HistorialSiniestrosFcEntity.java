package Entities.tpdds;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "historial_siniestros_fc", schema = "tp_dds", catalog = "")
@IdClass(HistorialSiniestrosFcEntityPK.class)
public class HistorialSiniestrosFcEntity {
    private int idSiniestrosHist;
    private int idSiniestros;
    private int idUsuario;
    private Date fechaFinVigencia;
    private String descripcion;
    private double valor;
    private Date fechaInicioVigencia;

    @Id
    @Column(name = "id_siniestros_hist", nullable = false)
    public int getIdSiniestrosHist() {
        return idSiniestrosHist;
    }

    public void setIdSiniestrosHist(int idSiniestrosHist) {
        this.idSiniestrosHist = idSiniestrosHist;
    }

    @Id
    @Column(name = "id_siniestros", nullable = false)
    public int getIdSiniestros() {
        return idSiniestros;
    }

    public void setIdSiniestros(int idSiniestros) {
        this.idSiniestros = idSiniestros;
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
    @Column(name = "fecha_fin_vigencia", nullable = false)
    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
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

    @Basic
    @Column(name = "fecha_inicio_vigencia", nullable = false)
    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HistorialSiniestrosFcEntity that = (HistorialSiniestrosFcEntity) o;

        if (idSiniestrosHist != that.idSiniestrosHist) return false;
        if (idSiniestros != that.idSiniestros) return false;
        if (idUsuario != that.idUsuario) return false;
        if (Double.compare(that.valor, valor) != 0) return false;
        if (fechaFinVigencia != null ? !fechaFinVigencia.equals(that.fechaFinVigencia) : that.fechaFinVigencia != null)
            return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (fechaInicioVigencia != null ? !fechaInicioVigencia.equals(that.fechaInicioVigencia) : that.fechaInicioVigencia != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idSiniestrosHist;
        result = 31 * result + idSiniestros;
        result = 31 * result + idUsuario;
        result = 31 * result + (fechaFinVigencia != null ? fechaFinVigencia.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        temp = Double.doubleToLongBits(valor);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fechaInicioVigencia != null ? fechaInicioVigencia.hashCode() : 0);
        return result;
    }
}
