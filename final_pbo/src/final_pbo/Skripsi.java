/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final_pbo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "skripsi")
@NamedQueries({
    @NamedQuery(name = "Skripsi.findAll", query = "SELECT s FROM Skripsi s"),
    @NamedQuery(name = "Skripsi.findById", query = "SELECT s FROM Skripsi s WHERE s.id = :id"),
    @NamedQuery(name = "Skripsi.findByNama", query = "SELECT s FROM Skripsi s WHERE s.nama = :nama"),
    @NamedQuery(name = "Skripsi.findByAngkatan", query = "SELECT s FROM Skripsi s WHERE s.angkatan = :angkatan"),
    @NamedQuery(name = "Skripsi.findByIdSkripsi", query = "SELECT s FROM Skripsi s WHERE s.idSkripsi = :idSkripsi"),
    @NamedQuery(name = "Skripsi.findByJudulSkripsi", query = "SELECT s FROM Skripsi s WHERE s.judulSkripsi = :judulSkripsi"),
    @NamedQuery(name = "Skripsi.findByTahunTerbit", query = "SELECT s FROM Skripsi s WHERE s.tahunTerbit = :tahunTerbit"),
    @NamedQuery(name = "Skripsi.findByJumlahHalaman", query = "SELECT s FROM Skripsi s WHERE s.jumlahHalaman = :jumlahHalaman"),
    @NamedQuery(name = "Skripsi.findByTanggal", query = "SELECT s FROM Skripsi s WHERE s.tanggal = :tanggal")})
public class Skripsi implements Serializable {

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
    @Column(name = "tahun_terbit")
    private String tahunTerbit;
    @Column(name = "jumlah_halaman")
    private String jumlahHalaman;
    @Column(name = "tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "skripsi")
    private PeminjamanSkripsi peminjamanSkripsi;

    public Skripsi() {
    }

    public Skripsi(String idSkripsi) {
        this.idSkripsi = idSkripsi;
    }

    public Skripsi(String idSkripsi, String id) {
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

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(String jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public PeminjamanSkripsi getPeminjamanSkripsi() {
        return peminjamanSkripsi;
    }

    public void setPeminjamanSkripsi(PeminjamanSkripsi peminjamanSkripsi) {
        this.peminjamanSkripsi = peminjamanSkripsi;
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
        if (!(object instanceof Skripsi)) {
            return false;
        }
        Skripsi other = (Skripsi) object;
        if ((this.idSkripsi == null && other.idSkripsi != null) || (this.idSkripsi != null && !this.idSkripsi.equals(other.idSkripsi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "final_pbo.Skripsi[ idSkripsi=" + idSkripsi + " ]";
    }
    
}
