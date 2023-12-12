/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_pbo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Bambang Sumadi
 */
@Entity
@Table(name = "pengguna")
@NamedQueries({
    @NamedQuery(name = "Pengguna.findAll", query = "SELECT p FROM Pengguna p"),
    @NamedQuery(name = "Pengguna.findById", query = "SELECT p FROM Pengguna p WHERE p.id = :id"),
    @NamedQuery(name = "Pengguna.findByNama", query = "SELECT p FROM Pengguna p WHERE p.nama = :nama"),
    @NamedQuery(name = "Pengguna.findByPasword", query = "SELECT p FROM Pengguna p WHERE p.pasword = :pasword")})
public class Pengguna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "pasword")
    private String pasword;

    public Pengguna() {
    }

    public Pengguna(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pengguna)) {
            return false;
        }
        Pengguna other = (Pengguna) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "final_pbo.Pengguna[ id=" + id + " ]";
    }
    
}
