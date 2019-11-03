package Entities.tpdds;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "cliente", schema = "tp_dds", catalog = "")
public class ClienteEntity {
    private int idCliente;
    private int idEnumTipoDni;
    private int idEnumCondIva;
    private int idEnumCliente;
    private int idEnumSexo;
    private int idEnumEstadoCivil;
    private int idDireccion;
    private int dni;
    private int cuilCuit;
    private String apellido;
    private String nombre;
    private int cantidadSiniestros;
    private String email;
    private String profesion;
    private Date anioRegistro;

    @Id
    @Column(name = "id_cliente", nullable = false)
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Basic
    @Column(name = "id_enumTipoDni", nullable = false)
    public int getIdEnumTipoDni() {
        return idEnumTipoDni;
    }

    public void setIdEnumTipoDni(int idEnumTipoDni) {
        this.idEnumTipoDni = idEnumTipoDni;
    }

    @Basic
    @Column(name = "id_enumCondIva", nullable = false)
    public int getIdEnumCondIva() {
        return idEnumCondIva;
    }

    public void setIdEnumCondIva(int idEnumCondIva) {
        this.idEnumCondIva = idEnumCondIva;
    }

    @Basic
    @Column(name = "id_enumCliente", nullable = false)
    public int getIdEnumCliente() {
        return idEnumCliente;
    }

    public void setIdEnumCliente(int idEnumCliente) {
        this.idEnumCliente = idEnumCliente;
    }

    @Basic
    @Column(name = "id_enumSexo", nullable = false)
    public int getIdEnumSexo() {
        return idEnumSexo;
    }

    public void setIdEnumSexo(int idEnumSexo) {
        this.idEnumSexo = idEnumSexo;
    }

    @Basic
    @Column(name = "id_enumEstadoCivil", nullable = false)
    public int getIdEnumEstadoCivil() {
        return idEnumEstadoCivil;
    }

    public void setIdEnumEstadoCivil(int idEnumEstadoCivil) {
        this.idEnumEstadoCivil = idEnumEstadoCivil;
    }

    @Basic
    @Column(name = "id_direccion", nullable = false)
    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    @Basic
    @Column(name = "dni", nullable = false)
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Basic
    @Column(name = "cuil_cuit", nullable = false)
    public int getCuilCuit() {
        return cuilCuit;
    }

    public void setCuilCuit(int cuilCuit) {
        this.cuilCuit = cuilCuit;
    }

    @Basic
    @Column(name = "apellido", nullable = false, length = 50)
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    @Column(name = "cantidad_siniestros", nullable = false)
    public int getCantidadSiniestros() {
        return cantidadSiniestros;
    }

    public void setCantidadSiniestros(int cantidadSiniestros) {
        this.cantidadSiniestros = cantidadSiniestros;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "profesion", nullable = false, length = 50)
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Basic
    @Column(name = "anio_registro", nullable = false)
    public Date getAnioRegistro() {
        return anioRegistro;
    }

    public void setAnioRegistro(Date anioRegistro) {
        this.anioRegistro = anioRegistro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClienteEntity that = (ClienteEntity) o;

        if (idCliente != that.idCliente) return false;
        if (idEnumTipoDni != that.idEnumTipoDni) return false;
        if (idEnumCondIva != that.idEnumCondIva) return false;
        if (idEnumCliente != that.idEnumCliente) return false;
        if (idEnumSexo != that.idEnumSexo) return false;
        if (idEnumEstadoCivil != that.idEnumEstadoCivil) return false;
        if (idDireccion != that.idDireccion) return false;
        if (dni != that.dni) return false;
        if (cuilCuit != that.cuilCuit) return false;
        if (cantidadSiniestros != that.cantidadSiniestros) return false;
        if (apellido != null ? !apellido.equals(that.apellido) : that.apellido != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (profesion != null ? !profesion.equals(that.profesion) : that.profesion != null) return false;
        if (anioRegistro != null ? !anioRegistro.equals(that.anioRegistro) : that.anioRegistro != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCliente;
        result = 31 * result + idEnumTipoDni;
        result = 31 * result + idEnumCondIva;
        result = 31 * result + idEnumCliente;
        result = 31 * result + idEnumSexo;
        result = 31 * result + idEnumEstadoCivil;
        result = 31 * result + idDireccion;
        result = 31 * result + dni;
        result = 31 * result + cuilCuit;
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + cantidadSiniestros;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (profesion != null ? profesion.hashCode() : 0);
        result = 31 * result + (anioRegistro != null ? anioRegistro.hashCode() : 0);
        return result;
    }
}
