package Entities.tpdds;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "poliza", schema = "tp_dds", catalog = "")
public class PolizaEntity {
    private int nroPoliza;
    private int estadoPoliza;
    private int idDom;
    private int formaPago;
    private int idPoliza;
    private int idCobertura;
    private int idCarac;
    private int idAjusteskm;
    private double sumaAsegurada;
    private double kmAnio;
    private Date fechaInicioVigencia;
    private Date fechaFinVigencia;
    private double premio;
    private double importePorDescuento;
    private Date ultimoDiaPago;
    private double montoTotalAAbonar;

    @Id
    @Column(name = "nro_poliza", nullable = false)
    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    @Basic
    @Column(name = "estado_poliza", nullable = false)
    public int getEstadoPoliza() {
        return estadoPoliza;
    }

    public void setEstadoPoliza(int estadoPoliza) {
        this.estadoPoliza = estadoPoliza;
    }

    @Basic
    @Column(name = "id_dom", nullable = false)
    public int getIdDom() {
        return idDom;
    }

    public void setIdDom(int idDom) {
        this.idDom = idDom;
    }

    @Basic
    @Column(name = "forma_pago", nullable = false)
    public int getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(int formaPago) {
        this.formaPago = formaPago;
    }

    @Basic
    @Column(name = "id_poliza", nullable = false)
    public int getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(int idPoliza) {
        this.idPoliza = idPoliza;
    }

    @Basic
    @Column(name = "id_cobertura", nullable = false)
    public int getIdCobertura() {
        return idCobertura;
    }

    public void setIdCobertura(int idCobertura) {
        this.idCobertura = idCobertura;
    }

    @Basic
    @Column(name = "id_carac", nullable = false)
    public int getIdCarac() {
        return idCarac;
    }

    public void setIdCarac(int idCarac) {
        this.idCarac = idCarac;
    }

    @Basic
    @Column(name = "id_ajusteskm", nullable = false)
    public int getIdAjusteskm() {
        return idAjusteskm;
    }

    public void setIdAjusteskm(int idAjusteskm) {
        this.idAjusteskm = idAjusteskm;
    }

    @Basic
    @Column(name = "suma_asegurada", nullable = false, precision = 0)
    public double getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(double sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    @Basic
    @Column(name = "km_anio", nullable = false, precision = 0)
    public double getKmAnio() {
        return kmAnio;
    }

    public void setKmAnio(double kmAnio) {
        this.kmAnio = kmAnio;
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

    @Basic
    @Column(name = "premio", nullable = false, precision = 0)
    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Basic
    @Column(name = "importe_por_descuento", nullable = false, precision = 0)
    public double getImportePorDescuento() {
        return importePorDescuento;
    }

    public void setImportePorDescuento(double importePorDescuento) {
        this.importePorDescuento = importePorDescuento;
    }

    @Basic
    @Column(name = "ultimo_dia_pago", nullable = false)
    public Date getUltimoDiaPago() {
        return ultimoDiaPago;
    }

    public void setUltimoDiaPago(Date ultimoDiaPago) {
        this.ultimoDiaPago = ultimoDiaPago;
    }

    @Basic
    @Column(name = "monto_total_a_abonar", nullable = false, precision = 0)
    public double getMontoTotalAAbonar() {
        return montoTotalAAbonar;
    }

    public void setMontoTotalAAbonar(double montoTotalAAbonar) {
        this.montoTotalAAbonar = montoTotalAAbonar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PolizaEntity that = (PolizaEntity) o;

        if (nroPoliza != that.nroPoliza) return false;
        if (estadoPoliza != that.estadoPoliza) return false;
        if (idDom != that.idDom) return false;
        if (formaPago != that.formaPago) return false;
        if (idPoliza != that.idPoliza) return false;
        if (idCobertura != that.idCobertura) return false;
        if (idCarac != that.idCarac) return false;
        if (idAjusteskm != that.idAjusteskm) return false;
        if (Double.compare(that.sumaAsegurada, sumaAsegurada) != 0) return false;
        if (Double.compare(that.kmAnio, kmAnio) != 0) return false;
        if (Double.compare(that.premio, premio) != 0) return false;
        if (Double.compare(that.importePorDescuento, importePorDescuento) != 0) return false;
        if (Double.compare(that.montoTotalAAbonar, montoTotalAAbonar) != 0) return false;
        if (fechaInicioVigencia != null ? !fechaInicioVigencia.equals(that.fechaInicioVigencia) : that.fechaInicioVigencia != null)
            return false;
        if (fechaFinVigencia != null ? !fechaFinVigencia.equals(that.fechaFinVigencia) : that.fechaFinVigencia != null)
            return false;
        if (ultimoDiaPago != null ? !ultimoDiaPago.equals(that.ultimoDiaPago) : that.ultimoDiaPago != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nroPoliza;
        result = 31 * result + estadoPoliza;
        result = 31 * result + idDom;
        result = 31 * result + formaPago;
        result = 31 * result + idPoliza;
        result = 31 * result + idCobertura;
        result = 31 * result + idCarac;
        result = 31 * result + idAjusteskm;
        temp = Double.doubleToLongBits(sumaAsegurada);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(kmAnio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fechaInicioVigencia != null ? fechaInicioVigencia.hashCode() : 0);
        result = 31 * result + (fechaFinVigencia != null ? fechaFinVigencia.hashCode() : 0);
        temp = Double.doubleToLongBits(premio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(importePorDescuento);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (ultimoDiaPago != null ? ultimoDiaPago.hashCode() : 0);
        temp = Double.doubleToLongBits(montoTotalAAbonar);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
