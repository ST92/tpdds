package Entities.tpdds;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "cuota", schema = "tp_dds", catalog = "")
public class CuotaEntity {
    private int idCuota;
    private int idPago;
    private int nroPoliza;
    private int numCuota;
    private Date fechaVencimiento;
    private double monto;
    private double recargos;
    private double bonificacionPagoAdelantado;

    @Id
    @Column(name = "id_cuota", nullable = false)
    public int getIdCuota() {
        return idCuota;
    }

    public void setIdCuota(int idCuota) {
        this.idCuota = idCuota;
    }

    @Basic
    @Column(name = "id_pago", nullable = false)
    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    @Basic
    @Column(name = "nro_poliza", nullable = false)
    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    @Basic
    @Column(name = "num_cuota", nullable = false)
    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    @Basic
    @Column(name = "fecha_vencimiento", nullable = false)
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Basic
    @Column(name = "monto", nullable = false, precision = 0)
    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Basic
    @Column(name = "recargos", nullable = false, precision = 0)
    public double getRecargos() {
        return recargos;
    }

    public void setRecargos(double recargos) {
        this.recargos = recargos;
    }

    @Basic
    @Column(name = "bonificacion_pago_adelantado", nullable = false, precision = 0)
    public double getBonificacionPagoAdelantado() {
        return bonificacionPagoAdelantado;
    }

    public void setBonificacionPagoAdelantado(double bonificacionPagoAdelantado) {
        this.bonificacionPagoAdelantado = bonificacionPagoAdelantado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CuotaEntity that = (CuotaEntity) o;

        if (idCuota != that.idCuota) return false;
        if (idPago != that.idPago) return false;
        if (nroPoliza != that.nroPoliza) return false;
        if (numCuota != that.numCuota) return false;
        if (Double.compare(that.monto, monto) != 0) return false;
        if (Double.compare(that.recargos, recargos) != 0) return false;
        if (Double.compare(that.bonificacionPagoAdelantado, bonificacionPagoAdelantado) != 0) return false;
        if (fechaVencimiento != null ? !fechaVencimiento.equals(that.fechaVencimiento) : that.fechaVencimiento != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idCuota;
        result = 31 * result + idPago;
        result = 31 * result + nroPoliza;
        result = 31 * result + numCuota;
        result = 31 * result + (fechaVencimiento != null ? fechaVencimiento.hashCode() : 0);
        temp = Double.doubleToLongBits(monto);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(recargos);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bonificacionPagoAdelantado);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
