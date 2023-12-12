/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_pbo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Bambang Sumadi
 */
@Entity
@Table(name = "peminjaman_skripsi")
@NamedQueries({
    @NamedQuery(name = "PeminjamanSkripsi.findAll", query = "SELECT p FROM PeminjamanSkripsi p"),
    @NamedQuery(name = "PeminjamanSkripsi.findById", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.id = :id"),
    @NamedQuery(name = "PeminjamanSkripsi.findByNama", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.nama = :nama"),
    @NamedQuery(name = "PeminjamanSkripsi.findByAngkatan", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.angkatan = :angkatan"),
    @NamedQuery(name = "PeminjamanSkripsi.findByIdSkripsi", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.idSkripsi = :idSkripsi"),
    @NamedQuery(name = "PeminjamanSkripsi.findByJudulSkripsi", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.judulSkripsi = :judulSkripsi"),
    @NamedQuery(name = "PeminjamanSkripsi.findByTanggal", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.tanggal = :tanggal"),
    @NamedQuery(name = "PeminjamanSkripsi.findByJumlah", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.jumlah = :jumlah"),
    @NamedQuery(name = "PeminjamanSkripsi.findByStatus", query = "SELECT p FROM PeminjamanSkripsi p WHERE p.status = :status")})
public class PeminjamanSkripsi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "angkatan")
    private String angkatan;
    @Id
    @Basic(optional = false)
    @Column(name = "id_skripsi")
    private String idSkripsi;
    @Column(name = "judul_skripsi")
    private String judulSkripsi;
    @Column(name = "tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @Column(name = "jumlah")
    private String jumlah;
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "id_skripsi", referencedColumnName = "id_skripsi", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Skripsi skripsi;

    public PeminjamanSkripsi() {
    }

    public PeminjamanSkripsi(String idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    public PeminjamanSkripsi(String idSkripsi, String id) {
        this.idSkripsi = idSkripsi;
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

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getIdSkripsi() {
        return idSkripsi;
    }

    public void setIdSkripsi(String idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    public String getJudulSkripsi() {
        return judulSkripsi;
    }

    public void setJudulSkripsi(String judulSkripsi) {
        this.judulSkripsi = judulSkripsi;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Skripsi getSkripsi() {
        return skripsi;
    }

    public void setSkripsi(Skripsi skripsi) {
        this.skripsi = skripsi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSkripsi != null ? idSkripsi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanSkripsi)) {
            return false;
        }
        PeminjamanSkripsi other = (PeminjamanSkripsi) object;
        if ((this.idSkripsi == null && other.idSkripsi != null) || (this.idSkripsi != null && !this.idSkripsi.equals(other.idSkripsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "final_pbo.PeminjamanSkripsi[ idSkripsi=" + idSkripsi + " ]";
    }
    
}
