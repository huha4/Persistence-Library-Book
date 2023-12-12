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
@Table(name = "buku")
@NamedQueries({
    @NamedQuery(name = "Buku.findAll", query = "SELECT b FROM Buku b"),
    @NamedQuery(name = "Buku.findById", query = "SELECT b FROM Buku b WHERE b.id = :id"),
    @NamedQuery(name = "Buku.findByNama", query = "SELECT b FROM Buku b WHERE b.nama = :nama"),
    @NamedQuery(name = "Buku.findByAngkatan", query = "SELECT b FROM Buku b WHERE b.angkatan = :angkatan"),
    @NamedQuery(name = "Buku.findByIsbn", query = "SELECT b FROM Buku b WHERE b.isbn = :isbn"),
    @NamedQuery(name = "Buku.findByJudul", query = "SELECT b FROM Buku b WHERE b.judul = :judul"),
    @NamedQuery(name = "Buku.findByPengarang", query = "SELECT b FROM Buku b WHERE b.pengarang = :pengarang"),
    @NamedQuery(name = "Buku.findByPenerbit", query = "SELECT b FROM Buku b WHERE b.penerbit = :penerbit"),
    @NamedQuery(name = "Buku.findByTahunTerbit", query = "SELECT b FROM Buku b WHERE b.tahunTerbit = :tahunTerbit"),
    @NamedQuery(name = "Buku.findByKategori", query = "SELECT b FROM Buku b WHERE b.kategori = :kategori"),
    @NamedQuery(name = "Buku.findByJumlahHalaman", query = "SELECT b FROM Buku b WHERE b.jumlahHalaman = :jumlahHalaman"),
    @NamedQuery(name = "Buku.findByJumlahBuku", query = "SELECT b FROM Buku b WHERE b.jumlahBuku = :jumlahBuku"),
    @NamedQuery(name = "Buku.findBySubJudul", query = "SELECT b FROM Buku b WHERE b.subJudul = :subJudul"),
    @NamedQuery(name = "Buku.findByTanggal", query = "SELECT b FROM Buku b WHERE b.tanggal = :tanggal")})
public class Buku implements Serializable {

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
    @Column(name = "judul")
    private String judul;
    @Column(name = "pengarang")
    private String pengarang;
    @Column(name = "penerbit")
    private String penerbit;
    @Column(name = "tahun_terbit")
    private String tahunTerbit;
    @Column(name = "kategori")
    private String kategori;
    @Column(name = "jumlah_halaman")
    private String jumlahHalaman;
    @Column(name = "jumlah_buku")
    private String jumlahBuku;
    @Column(name = "sub_judul")
    private String subJudul;
    @Column(name = "tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "buku")
    private PeminjamanBuku peminjamanBuku;

    public Buku() {
    }

    public Buku(String isbn) {
        this.isbn = isbn;
    }

    public Buku(String isbn, String id) {
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

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(String jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getJumlahBuku() {
        return jumlahBuku;
    }

    public void setJumlahBuku(String jumlahBuku) {
        this.jumlahBuku = jumlahBuku;
    }

    public String getSubJudul() {
        return subJudul;
    }

    public void setSubJudul(String subJudul) {
        this.subJudul = subJudul;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public PeminjamanBuku getPeminjamanBuku() {
        return peminjamanBuku;
    }

    public void setPeminjamanBuku(PeminjamanBuku peminjamanBuku) {
        this.peminjamanBuku = peminjamanBuku;
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
        if (!(object instanceof Buku)) {
            return false;
        }
        Buku other = (Buku) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "final_pbo.Buku[ isbn=" + isbn + " ]";
    }
    
}
