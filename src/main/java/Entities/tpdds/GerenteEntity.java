package Entities.tpdds;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "gerente", schema = "tp_dds", catalog = "")
public class GerenteEntity {
    private int usuario;
    private int password;

    @Basic
    @Column(name = "usuario", nullable = false)
    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    @Basic
    @Column(name = "password", nullable = false)
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GerenteEntity that = (GerenteEntity) o;

        if (usuario != that.usuario) return false;
        if (password != that.password) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = usuario;
        result = 31 * result + password;
        return result;
    }
}
