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
@Table(name = "peminjaman_buku")
@NamedQueries({
    @NamedQuery(name = "PeminjamanBuku.findAll", query = "SELECT p FROM PeminjamanBuku p"),
    @NamedQuery(name = "PeminjamanBuku.findById", query = "SELECT p FROM PeminjamanBuku p WHERE p.id = :id"),
    @NamedQuery(name = "PeminjamanBuku.findByNama", query = "SELECT p FROM PeminjamanBuku p WHERE p.nama = :nama"),
    @NamedQuery(name = "PeminjamanBuku.findByAngkatan", query = "SELECT p FROM PeminjamanBuku p WHERE p.angkatan = :angkatan"),
    @NamedQuery(name = "PeminjamanBuku.findByIsbn", query = "SELECT p FROM PeminjamanBuku p WHERE p.isbn = :isbn"),
    @NamedQuery(name = "PeminjamanBuku.findByJudulBuku", query = "SELECT p FROM PeminjamanBuku p WHERE p.judulBuku = :judulBuku"),
    @NamedQuery(name = "PeminjamanBuku.findByKategori", query = "SELECT p FROM PeminjamanBuku p WHERE p.kategori = :kategori"),
    @NamedQuery(name = "PeminjamanBuku.findByTanggal", query = "SELECT p FROM PeminjamanBuku p WHERE p.tanggal = :tanggal"),
    @NamedQuery(name = "PeminjamanBuku.findByJumlah", query = "SELECT p FROM PeminjamanBuku p WHERE p.jumlah = :jumlah"),
    @NamedQuery(name = "PeminjamanBuku.findByStatus", query = "SELECT p FROM PeminjamanBuku p WHERE p.status = :status")})
public class PeminjamanBuku implements Serializable {

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
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "judul_buku")
    private String judulBuku;
    @Column(name = "kategori")
    private String kategori;
    @Column(name = "tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @Column(name = "jumlah")
    private String jumlah;
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "isbn", referencedColumnName = "isbn", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Buku buku;

    public PeminjamanBuku() {
    }

    public PeminjamanBuku(String isbn) {
        this.isbn = isbn;
    }

    public PeminjamanBuku(String isbn, String id) {
        this.isbn = isbn;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
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

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PeminjamanBuku)) {
            return false;
        }
        PeminjamanBuku other = (PeminjamanBuku) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "final_pbo.PeminjamanBuku[ isbn=" + isbn + " ]";
    }
    
}
