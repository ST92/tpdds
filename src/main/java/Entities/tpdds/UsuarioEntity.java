package Entities.tpdds;

import javax.persistence.*;

@Entity
@Table(name = "usuario", schema = "tp_dds", catalog = "")
public class UsuarioEntity {
    private int idUsuario;
    private String usuario;
    private String password;
    private int idEnumTipoUsuario;

    @Id
    @Column(name = "id_usuario", nullable = false)
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "usuario", nullable = false, length = 50)
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "id_enumTipoUsuario", nullable = false)
    public int getIdEnumTipoUsuario() {
        return idEnumTipoUsuario;
    }

    public void setIdEnumTipoUsuario(int idEnumTipoUsuario) {
        this.idEnumTipoUsuario = idEnumTipoUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioEntity that = (UsuarioEntity) o;

        if (idUsuario != that.idUsuario) return false;
        if (idEnumTipoUsuario != that.idEnumTipoUsuario) return false;
        if (usuario != null ? !usuario.equals(that.usuario) : that.usuario != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario;
        result = 31 * result + (usuario != null ? usuario.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + idEnumTipoUsuario;
        return result;
    }
}
