/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package final_pbo;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class inputBuku extends javax.swing.JFrame {

    public inputBuku() {
        initComponents();
        Tampilan();
    }

    public void peringatan(String pesan) {
        JOptionPane.showMessageDialog(rootPane, pesan);
    }
    ArrayList<Buku> Buku;

    private void kosongkan_form() {
        isiID.setEditable(true);
        isiID.setText(null);
        isiNama.setText(null);
        isiAngkatan.setText(null);
        isiISBN.setText(null);
        isiJudul.setText(null);
        isiPengarang.setText(null);
        isiPenerbit.setText(null);
        isiTahun.setText(null);
        isiHalaman.setText(null);
        isiJumlah.setText(null);
        isiSub.setText(null);
        isiTgl.setText(null);
    }

    private void updateTable() {
        EntityManager entityManager = Persistence.createEntityManagerFactory("final_pboPU").createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<Buku> querySelectAll = entityManager.createNamedQuery("Buku.findAll", Buku.class);
        List<Buku> results = querySelectAll.getResultList();
        // ... (kode untuk mendapatkan data dari database)
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.addColumn("ID");
        newModel.addColumn("Name");
        newModel.addColumn("Gen");
        newModel.addColumn("ISBN");
        newModel.addColumn("Title");
        newModel.addColumn("Author");
        newModel.addColumn("Publish");
        newModel.addColumn("Public year");
        newModel.addColumn("Categories");
        newModel.addColumn("NoP");
        newModel.addColumn("NoB");
        newModel.addColumn("Subtitle");
        newModel.addColumn("Date");

        for (Buku data : Buku) {
            Object[] rowData = {
                data.getId(),
                data.getNama(),
                data.getAngkatan(),
                data.getIsbn(),
                data.getJudul(),
                data.getPengarang(),
                data.getPenerbit(),
                data.getTahunTerbit(),
                data.getKategori(),
                data.getJumlahHalaman(),
                data.getJumlahBuku(),
                data.getSubJudul(),
                data.getTanggal()};
            newModel.addRow(rowData);
        }
    }


    private void Tampilan() {
//        Skripsi.clear();
        EntityManager entityManager = Persistence.createEntityManagerFactory("final_pboPU").createEntityManager();
        entityManager.getTransaction().begin();
        TypedQuery<Buku> querySelectAll = entityManager.createNamedQuery("Buku.findAll", Buku.class);
        Query query = entityManager.createQuery("SELECT b FROM Buku b");
        List<Buku> results = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();

        DefaultTableModel model = (DefaultTableModel) DefaultTableModel.getModel();
        model.setRowCount(0);
        for (Buku data : results) {
            Object[] baris = new Object[13];
            baris[0] = data.getId();
            baris[1] = data.getNama();
            baris[2] = data.getAngkatan();
            baris[3] = data.getIsbn();
            baris[4] = data.getJudul();
            baris[5] = data.getPengarang();
            baris[6] = data.getPenerbit();
            baris[7] = data.getTahunTerbit();
            baris[8] = data.getKategori();
            baris[9] = data.getJumlahHalaman();
            baris[10] = data.getJumlahBuku();
            baris[11] = data.getSubJudul();
            baris[12] = data.getTanggal();
            model.addRow(baris);
        }
        DefaultTableModel.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        panelKiri = new javax.swing.JPanel();
        jHome = new javax.swing.JButton();
        jBuku = new javax.swing.JButton();
        jSkripsi = new javax.swing.JButton();
        jSearch = new javax.swing.JButton();
        jKeluar = new javax.swing.JButton();
        panelAtas = new javax.swing.JPanel();
        panelTengah = new javax.swing.JPanel();
        panelBuku = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        isiID = new javax.swing.JTextField();
        isiNama = new javax.swing.JTextField();
        isiISBN = new javax.swing.JTextField();
        isiPengarang = new javax.swing.JTextField();
        isiAngkatan = new javax.swing.JTextField();
        isiJudul = new javax.swing.JTextField();
        isiPenerbit = new javax.swing.JTextField();
        isiTahun = new javax.swing.JTextField();
        isiHalaman = new javax.swing.JTextField();
        isiJumlah = new javax.swing.JTextField();
        isiSub = new javax.swing.JTextField();
        isiTgl = new javax.swing.JTextField();
        cKategori = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        DefaultTableModel = new javax.swing.JTable();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        input = new javax.swing.JButton();
        jsearch = new javax.swing.JTextField();
        cSearch = new javax.swing.JComboBox<>();
        print = new javax.swing.JButton();
        peminjamanBuku = new javax.swing.JButton();
        isiKategori = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(248, 243, 230));
        mainPanel.setPreferredSize(new java.awt.Dimension(600, 520));

        panelKiri.setBackground(new java.awt.Color(248, 243, 230));

        jHome.setBackground(new java.awt.Color(248, 243, 230));
        jHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\primary (1).png")); // NOI18N
        jHome.setBorder(null);
        jHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHomeActionPerformed(evt);
            }
        });

        jBuku.setBackground(new java.awt.Color(248, 243, 230));
        jBuku.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Vector.png")); // NOI18N
        jBuku.setBorder(null);
        jBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBukuActionPerformed(evt);
            }
        });

        jSkripsi.setBackground(new java.awt.Color(248, 243, 230));
        jSkripsi.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Vector (1).png")); // NOI18N
        jSkripsi.setBorder(null);
        jSkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSkripsiActionPerformed(evt);
            }
        });

        jSearch.setBackground(new java.awt.Color(248, 243, 230));
        jSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Vector (3).png")); // NOI18N
        jSearch.setBorder(null);
        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchActionPerformed(evt);
            }
        });

        jKeluar.setBackground(new java.awt.Color(248, 243, 230));
        jKeluar.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Vector (2).png")); // NOI18N
        jKeluar.setBorder(null);
        jKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKiriLayout = new javax.swing.GroupLayout(panelKiri);
        panelKiri.setLayout(panelKiriLayout);
        panelKiriLayout.setHorizontalGroup(
            panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKiriLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSkripsi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jKeluar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelKiriLayout.setVerticalGroup(
            panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jHome, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSkripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        panelAtas.setBackground(new java.awt.Color(41, 134, 204));

        javax.swing.GroupLayout panelAtasLayout = new javax.swing.GroupLayout(panelAtas);
        panelAtas.setLayout(panelAtasLayout);
        panelAtasLayout.setHorizontalGroup(
            panelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelAtasLayout.setVerticalGroup(
            panelAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        panelTengah.setBackground(new java.awt.Color(150, 213, 242));
        panelTengah.setLayout(new java.awt.CardLayout());

        panelBuku.setBackground(new java.awt.Color(150, 213, 242));
        panelBuku.setPreferredSize(new java.awt.Dimension(1213, 661));

        jLabel2.setBackground(new java.awt.Color(41, 134, 204));
        jLabel2.setFont(new java.awt.Font("Helvetica Rounded", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(5, 37, 132));
        jLabel2.setText("Book");

        jLabel10.setFont(new java.awt.Font("Helvetica Rounded", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 51));
        jLabel10.setText("ID");

        jPanel3.setBackground(new java.awt.Color(41, 134, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 4));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Helvetica Rounded", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 51));
        jLabel11.setText("Name");

        jLabel12.setFont(new java.awt.Font("Helvetica Rounded", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 51));
        jLabel12.setText("Gen");

        jLabel13.setFont(new java.awt.Font("Helvetica Rounded", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 51));
        jLabel13.setText("ISBN");

        jLabel14.setFont(new java.awt.Font("Helvetica Rounded", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 51));
        jLabel14.setText("Title");

        jLabel15.setFont(new java.awt.Font("Helvetica Rounded", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 51));
        jLabel15.setText("Author");

        jLabel16.setFont(new java.awt.Font("Helvetica Rounded", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 51));
        jLabel16.setText("Publish");

        jLabel17.setFont(new java.awt.Font("Helvetica Rounded", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 51));
        jLabel17.setText("Public year");

        jLabel18.setFont(new java.awt.Font("Helvetica Rounded", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 51));
        jLabel18.setText("Categories");

        jLabel19.setFont(new java.awt.Font("Helvetica Rounded", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 51));
        jLabel19.setText("NoP");

        jLabel20.setFont(new java.awt.Font("Helvetica Rounded", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 51));
        jLabel20.setText("NoB");

        jLabel21.setFont(new java.awt.Font("Helvetica Rounded", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 51));
        jLabel21.setText("Subtitle");

        jLabel22.setFont(new java.awt.Font("Helvetica Rounded", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 51));
        jLabel22.setText("Date");

        isiID.setBackground(new java.awt.Color(246, 246, 246));
        isiID.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        isiID.setForeground(new java.awt.Color(0, 51, 51));

        isiNama.setBackground(new java.awt.Color(246, 246, 246));
        isiNama.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        isiNama.setForeground(new java.awt.Color(0, 51, 51));

        isiISBN.setBackground(new java.awt.Color(246, 246, 246));
        isiISBN.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        isiISBN.setForeground(new java.awt.Color(0, 51, 51));

        isiPengarang.setBackground(new java.awt.Color(246, 246, 246));
        isiPengarang.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        isiPengarang.setForeground(new java.awt.Color(0, 51, 51));

        isiAngkatan.setBackground(new java.awt.Color(246, 246, 246));
        isiAngkatan.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        isiAngkatan.setForeground(new java.awt.Color(0, 51, 51));

        isiJudul.setBackground(new java.awt.Color(246, 246, 246));
        isiJudul.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        isiJudul.setForeground(new java.awt.Color(0, 51, 51));

        isiPenerbit.setBackground(new java.awt.Color(246, 246, 246));
        isiPenerbit.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        isiPenerbit.setForeground(new java.awt.Color(0, 51, 51));

        isiTahun.setBackground(new java.awt.Color(246, 246, 246));
        isiTahun.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        isiTahun.setForeground(new java.awt.Color(0, 51, 51));
        isiTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiTahunActionPerformed(evt);
            }
        });

        isiHalaman.setBackground(new java.awt.Color(246, 246, 246));
        isiHalaman.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        isiHalaman.setForeground(new java.awt.Color(0, 51, 51));

        isiJumlah.setBackground(new java.awt.Color(246, 246, 246));
        isiJumlah.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        isiJumlah.setForeground(new java.awt.Color(0, 51, 51));

        isiSub.setBackground(new java.awt.Color(246, 246, 246));
        isiSub.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        isiSub.setForeground(new java.awt.Color(0, 51, 51));

        isiTgl.setBackground(new java.awt.Color(246, 246, 246));
        isiTgl.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        isiTgl.setForeground(new java.awt.Color(0, 51, 51));

        cKategori.setBackground(new java.awt.Color(246, 246, 246));
        cKategori.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        cKategori.setForeground(new java.awt.Color(0, 51, 51));
        cKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novel", "Magazine", "Dictionary", "Comic", "Encyclopedia", "Biography", "Manuscript", "Anthology" }));
        cKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cKategoriMouseClicked(evt);
            }
        });
        cKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cKategoriActionPerformed(evt);
            }
        });

        DefaultTableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gen", "ISBN", "Title", "Author", "Publish", "Public year", "Categories", "NoP", "NoB", "Subtitle", "Date"
            }
        ));
        DefaultTableModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefaultTableModelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DefaultTableModel);

        simpan.setBackground(new java.awt.Color(41, 134, 204));
        simpan.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        simpan.setForeground(new java.awt.Color(255, 255, 255));
        simpan.setText("Save");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(41, 134, 204));
        edit.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(41, 134, 204));
        hapus.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("Delete");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        input.setBackground(new java.awt.Color(41, 134, 204));
        input.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        input.setForeground(new java.awt.Color(255, 255, 255));
        input.setText("Input");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        jsearch.setBackground(new java.awt.Color(246, 246, 246));
        jsearch.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        jsearch.setForeground(new java.awt.Color(0, 51, 51));
        jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchActionPerformed(evt);
            }
        });
        jsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jsearchKeyReleased(evt);
            }
        });

        cSearch.setBackground(new java.awt.Color(246, 246, 246));
        cSearch.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        cSearch.setForeground(new java.awt.Color(0, 51, 51));
        cSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Gen", "ISBN", "Title", "Categories", "Author", "Publish", "Public year", "NoP", "NoB", "Subtitle", "Date" }));
        cSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSearchActionPerformed(evt);
            }
        });

        print.setBackground(new java.awt.Color(41, 134, 204));
        print.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Page-1.png")); // NOI18N
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        peminjamanBuku.setBackground(new java.awt.Color(248, 243, 230));
        peminjamanBuku.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        peminjamanBuku.setForeground(new java.awt.Color(255, 255, 255));
        peminjamanBuku.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Vector.png")); // NOI18N
        peminjamanBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peminjamanBukuActionPerformed(evt);
            }
        });

        isiKategori.setBackground(new java.awt.Color(246, 246, 246));
        isiKategori.setFont(new java.awt.Font("Helvetica Rounded", 1, 16)); // NOI18N
        isiKategori.setForeground(new java.awt.Color(0, 51, 51));
        isiKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiKategoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBukuLayout = new javax.swing.GroupLayout(panelBuku);
        panelBuku.setLayout(panelBukuLayout);
        panelBukuLayout.setHorizontalGroup(
            panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBukuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBukuLayout.createSequentialGroup()
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelBukuLayout.createSequentialGroup()
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel10))
                        .addGap(34, 34, 34)
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isiPengarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(isiID)
                                .addComponent(isiNama)
                                .addComponent(isiAngkatan)
                                .addComponent(isiISBN)
                                .addComponent(isiJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBukuLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22))
                            .addGroup(panelBukuLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))))
                        .addGap(18, 18, 18)
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isiTgl)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(isiPenerbit)
                                .addComponent(isiTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(isiSub)
                            .addComponent(isiHalaman)
                            .addComponent(isiJumlah))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBukuLayout.createSequentialGroup()
                                .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(panelBukuLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(isiKategori)
                                    .addComponent(cKategori, 0, 166, Short.MAX_VALUE))
                                .addGap(20, 20, 20))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBukuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(peminjamanBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(input)
                        .addGap(20, 20, 20))))
            .addGroup(panelBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelBukuLayout.setVerticalGroup(
            panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBukuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(peminjamanBuku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBukuLayout.createSequentialGroup()
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isiID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isiNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isiAngkatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isiISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(isiJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isiPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel15)))
                    .addGroup(panelBukuLayout.createSequentialGroup()
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isiPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isiKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isiTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isiHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isiJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBukuLayout.createSequentialGroup()
                                .addComponent(isiSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isiTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBukuLayout.createSequentialGroup()
                                .addComponent(cSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelTengah.add(panelBuku, "card3");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(panelKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTengah, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(panelAtas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(panelAtas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelKiri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(panelTengah, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel1.add(mainPanel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1290, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHomeActionPerformed
        new home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jHomeActionPerformed

    private void jBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBukuActionPerformed
        new inputBuku().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBukuActionPerformed

    private void jSkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSkripsiActionPerformed
        new inputSkripsi().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jSkripsiActionPerformed

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchActionPerformed
        new search().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jSearchActionPerformed

    private void isiTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiTahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiTahunActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        String id = isiID.getText();
        String nama = isiNama.getText();
        String angkatan = isiAngkatan.getText();
        String isbn = isiISBN.getText();
        String judul = isiJudul.getText();
        String pengarang = isiPengarang.getText();
        String penerbit = isiPenerbit.getText();
        String tahunTerbit = isiTahun.getText();
        String kategori = (String) cKategori.getSelectedItem();
        String jumlahHalaman = isiHalaman.getText();
        String jumlahBuku = isiJumlah.getText();
        String subJudul = isiSub.getText();
        String tanggal = isiTgl.getText();
        try {
            SimpleDateFormat tgl = new SimpleDateFormat("dd-MM-yyyy");
            EntityManager entityManager = Persistence.createEntityManagerFactory("final_pboPU").createEntityManager();
            entityManager.getTransaction().begin();
            Buku b = new Buku();
            b.setId(id);
            b.setNama(nama);
            b.setAngkatan(angkatan);
            b.setIsbn(isbn);
            b.setJudul(judul);
            b.setPengarang(pengarang);
            b.setPenerbit(penerbit);
            b.setTahunTerbit(tahunTerbit);
            b.setKategori(kategori);
            b.setJumlahHalaman(jumlahHalaman);
            b.setJumlahBuku(jumlahBuku);
            b.setSubJudul(subJudul);
            b.setTanggal(tgl.parse(tanggal));
            entityManager.persist(b);
            entityManager.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Data saved successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Kosongkan form setelah simpan
            updateTable();
            Tampilan();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data failed to save" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        isiID.setText(null);
        isiNama.setText(null);
        isiAngkatan.setText(null);
        isiISBN.setText(null);
        isiJudul.setText(null);
        isiPengarang.setText(null);
        isiPenerbit.setText(null);
        isiTahun.setText(null);
        isiHalaman.setText(null);
        isiJumlah.setText(null);
        isiSub.setText(null);
        isiTgl.setText(null);
    }//GEN-LAST:event_simpanActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        String id = isiID.getText();
        String nama = isiNama.getText();
        String angkatan = isiAngkatan.getText();
        String isbn = isiISBN.getText();
        String judul = isiJudul.getText();
        String pengarang = isiPengarang.getText();
        String penerbit = isiPenerbit.getText();
        String tahunTerbit = isiTahun.getText();
        String kategori = (String) cKategori.getSelectedItem();
        String jumlahHalaman = isiHalaman.getText();
        String jumlahBuku = isiJumlah.getText();
        String subJudul = isiSub.getText();
        String tanggal = isiTgl.getText();
        try {
            SimpleDateFormat tgl = new SimpleDateFormat("dd-MM-yyyy");
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("final_pboPU");
            EntityManager em = emf.createEntityManager();
            Buku b = new Buku();
            b.setId(id);
            b.setNama(nama);
            b.setAngkatan(angkatan);
            b.setIsbn(isbn);
            b.setJudul(judul);
            b.setPengarang(pengarang);
            b.setPenerbit(penerbit);
            b.setTahunTerbit(tahunTerbit);
            b.setKategori(kategori);
            b.setJumlahHalaman(jumlahHalaman);
            b.setJumlahBuku(jumlahBuku);
            b.setSubJudul(subJudul);
            b.setTanggal(tgl.parse(tanggal));
            em.getTransaction().begin();
            em.merge(b);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Data updated successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Perbarui tabel
            Tampilan();
            updateTable();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data failed to update" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        isiID.setText(null);
        isiNama.setText(null);
        isiAngkatan.setText(null);
        isiISBN.setText(null);
        isiJudul.setText(null);
        isiPengarang.setText(null);
        isiPenerbit.setText(null);
        isiTahun.setText(null);
        isiHalaman.setText(null);
        isiJumlah.setText(null);
        isiSub.setText(null);
        isiTgl.setText(null);
    }//GEN-LAST:event_editActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        String isbn = isiISBN.getText();
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("final_pboPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            Buku b = em.find(Buku.class, isbn);
            em.remove(b);

            em.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Data deleted successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data failed to delete" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        isiID.setText(null);
        isiNama.setText(null);
        isiAngkatan.setText(null);
        isiISBN.setText(null);
        isiJudul.setText(null);
        isiPengarang.setText(null);
        isiPenerbit.setText(null);
        isiTahun.setText(null);
        isiHalaman.setText(null);
        isiJumlah.setText(null);
        isiSub.setText(null);
        isiTgl.setText(null);
        Tampilan();
        updateTable();
    }//GEN-LAST:event_hapusActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        JFileChooser filechooser = new JFileChooser();
        int i = filechooser.showOpenDialog(null);
        if (i == JFileChooser.APPROVE_OPTION) {
            EntityManager entityManager = Persistence.createEntityManagerFactory("final_pboPU").createEntityManager();
            entityManager.getTransaction().begin();
            File f = filechooser.getSelectedFile();
            String filepath = f.getPath();
            //Parsing CSV Data
            try {
                SimpleDateFormat tgl = new SimpleDateFormat("dd-MM-yyyy");
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filepath));
                org.apache.commons.csv.CSVParser csvParser = CSVFormat.DEFAULT.parse(inputStreamReader);
                for (CSVRecord csvRecord : csvParser) {
                    Buku b = new Buku();
                    b.setId(csvRecord.get(0));
                    b.setNama(csvRecord.get(1));
                    b.setAngkatan(csvRecord.get(2));
                    b.setIsbn(csvRecord.get(3));
                    b.setJudul(csvRecord.get(4));
                    b.setPengarang(csvRecord.get(5));
                    b.setPenerbit(csvRecord.get(6));
                    b.setTahunTerbit(csvRecord.get(7));
                    b.setKategori(csvRecord.get(8));
                    b.setJumlahHalaman(csvRecord.get(9));
                    b.setJumlahBuku(csvRecord.get(10));
                    b.setSubJudul(csvRecord.get(11));
                    b.setTanggal(tgl.parse(csvRecord.get(12)));
                    entityManager.persist(b);
                }
                Tampilan();
                updateTable();
            } catch (IOException ex) {
                System.out.println("Error in Parsing CSV File");
            } catch (ParseException ex) {
                Logger.getLogger(inputBuku.class.getName()).log(Level.SEVERE, null, ex);
            }
            entityManager.getTransaction().commit();
        }
    }//GEN-LAST:event_inputActionPerformed

    private void peminjamanBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peminjamanBukuActionPerformed
        new pinjamBuku().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_peminjamanBukuActionPerformed

    private void jsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchActionPerformed

    }//GEN-LAST:event_jsearchActionPerformed

    private void jsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsearchKeyReleased
        try {
            String selection = (String) cSearch.getSelectedItem();
            String searchTerm = jsearch.getText().trim().toLowerCase();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT b FROM Buku b WHERE ";

            switch (selection.toLowerCase()) {
                case "id":
                    queryString += "LOWER(b.id) LIKE LOWER(:searchTerm)";
                    break;
                case "name":
                    queryString += "LOWER(b.nama) LIKE LOWER(:searchTerm)";
                    break;
                case "gen":
                    queryString += "LOWER(b.angkatan) LIKE LOWER(:searchTerm)";
                    break;
                case "isbn":
                    queryString += "LOWER(b.isbn) LIKE LOWER(:searchTerm)";
                    break;
                case "title":
                    queryString += "LOWER(b.judul) LIKE LOWER(:searchTerm)";
                    break;
                case "categories":
                    queryString += "LOWER(b.kategori) LIKE LOWER(:searchTerm)";
                    break;
                case "author":
                    queryString += "LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                    break;
                case "publish":
                    queryString += "LOWER(b.penerbit) LIKE LOWER(:searchTerm)";
                    break;
                case "public year":
                    queryString += "LOWER(b.tahunTerbit) LIKE LOWER(:searchTerm)";
                    break;
                case "nop":
                    queryString += "LOWER(b.jumlahHalaman) LIKE LOWER(:searchTerm)";
                    break;
                case "nob":
                    queryString += "LOWER(b.jumlahBuku) LIKE LOWER(:searchTerm)";
                    break;
                case "subtitle":
                    queryString += "LOWER(b.subJudul) LIKE LOWER(:searchTerm)";
                    break;
                case "date":
                    queryString += "LOWER(b.tanggal) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("No search criteria selected.");
            }

            // Create and execute the JPA query
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("final_pboPU");
            EntityManager em = emf.createEntityManager();

            TypedQuery<Buku> query = em.createQuery(queryString, Buku.class);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            List<Buku> results = query.getResultList();

            DefaultTableModel dataModel = new DefaultTableModel();

            // Add columns to the model
            dataModel.addColumn("ID");
            dataModel.addColumn("Name");
            dataModel.addColumn("Gen");
            dataModel.addColumn("ISBN");
            dataModel.addColumn("Title");
            dataModel.addColumn("Author");
            dataModel.addColumn("Publish");
            dataModel.addColumn("Public year");
            dataModel.addColumn("Categories");
            dataModel.addColumn("NoP");
            dataModel.addColumn("NoB");
            dataModel.addColumn("Subtile");
            dataModel.addColumn("Date");
            // ... tambahkan kolom lain sesuai kebutuhan
            // Add rows to the model
            for (Buku result : results) {
                Object[] rowData = {
                    result.getId(),
                    result.getNama(),
                    result.getAngkatan(),
                    result.getIsbn(),
                    result.getJudul(),
                    result.getPengarang(),
                    result.getPenerbit(),
                    result.getTahunTerbit(),
                    result.getKategori(),
                    result.getJumlahHalaman(),
                    result.getJumlahBuku(),
                    result.getSubJudul(),
                    result.getTanggal()};
                dataModel.addRow(rowData);
            }
            // Set jTableBuku with the created model
            DefaultTableModel.setModel(dataModel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jsearchKeyReleased

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        try {
            String reportPath = "src/final_pbo/cetakBuku.jrxml";
            String selection = ((String) cSearch.getSelectedItem()).toLowerCase();
            String searchTerm = jSearch.getText().trim();

            // Building the JPA query dynamically based on the selected criteria
            String queryString = "SELECT b FROM Buku b WHERE ";

            switch (selection.toLowerCase()) {
                case "id":
                    queryString += "LOWER(b.id) LIKE LOWER(:searchTerm)";
                    break;
                case "name":
                    queryString += "LOWER(b.nama) LIKE LOWER(:searchTerm)";
                    break;
                case "gen":
                    queryString += "LOWER(b.angkatan) LIKE LOWER(:searchTerm)";
                    break;
                case "isbn":
                    queryString += "LOWER(b.isbn) LIKE LOWER(:searchTerm)";
                    break;
                case "title":
                    queryString += "LOWER(b.judul) LIKE LOWER(:searchTerm)";
                    break;
                case "author":
                    queryString += "LOWER(b.pengarang) LIKE LOWER(:searchTerm)";
                    break;
                case "publish":
                    queryString += "LOWER(b.penerbit) LIKE LOWER(:searchTerm)";
                    break;
                case "public year":
                    queryString += "LOWER(b.tahunTerbit) LIKE LOWER(:searchTerm)";
                    break;
                case "categories":
                    queryString += "LOWER(b.kategori) LIKE LOWER(:searchTerm)";
                    break;
                case "nop":
                    queryString += "LOWER(b.jumlahHalaman) LIKE LOWER(:searchTerm)";
                    break;
                case "nob":
                    queryString += "LOWER(b.jumlahBuku) LIKE LOWER(:searchTerm)";
                    break;
                case "subtitle":
                    queryString += "LOWER(b.subJudul) LIKE LOWER(:searchTerm)";
                    break;
                case "date":
                    queryString += "LOWER(b.tanggal) LIKE LOWER(:searchTerm)";
                    break;
                default:
                    throw new IllegalArgumentException("No search criteria selected.");
            }

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("final_pboPU");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Buku> cq = cb.createQuery(Buku.class);
            Root<Buku> bok = cq.from(Buku.class);
            cq.select(bok);

            // Check if WHERE clause is not empty
            if (queryString.endsWith(" WHERE ")) {
                throw new IllegalArgumentException("No search criteria selected.");
            }

            TypedQuery<Buku> q = em.createQuery(cq);
            List<Buku> list = q.getResultList();
            Query query = em.createQuery(queryString);
            query.setParameter("searchTerm", "%" + searchTerm + "%");

            SimpleDateFormat tgl = new SimpleDateFormat("dd-MM-yyyy");
            List<Buku> results = query.getResultList();
            Map<String, Object> parameter = new HashMap<>();
            parameter.put("querySearch", searchTerm);
            parameter.put("searchBy", selection);
            List<Object[]> data = new ArrayList<>();
            for (Buku result : results) {
                Object[] rowData = {
                    result.getId(),
                    result.getNama(),
                    result.getAngkatan(),
                    result.getIsbn(),
                    result.getJudul(),
                    result.getPengarang(),
                    result.getPenerbit(),
                    result.getTahunTerbit(),
                    result.getKategori(),
                    result.getJumlahHalaman(),
                    result.getJumlahBuku(),
                    result.getSubJudul(),
                    result.getTanggal()};
                data.add(rowData);
            }
            em.getTransaction().commit();
            em.close();
            emf.close();

            // Membuat sumber data untuk JasperReports dari data hasil pencarian
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(results);

            // Memuat file desain laporan (*.jrxml)
            JasperReport jasperReport = JasperCompileManager.compileReport(reportPath);
            JasperPrint print = JasperFillManager.fillReport(jasperReport, null, dataSource);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(inputBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printActionPerformed

    private void DefaultTableModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefaultTableModelMouseClicked
        int baris = DefaultTableModel.rowAtPoint(evt.getPoint());
        String id = DefaultTableModel.getValueAt(baris, 0).toString();
        isiID.setText(id);

        String nama = DefaultTableModel.getValueAt(baris, 1).toString();
        isiNama.setText(nama);

        String angkatan = DefaultTableModel.getValueAt(baris, 2).toString();
        isiAngkatan.setText(angkatan);

        String isbn = DefaultTableModel.getValueAt(baris, 3).toString();
        isiISBN.setText(isbn);

        String judul = DefaultTableModel.getValueAt(baris, 4).toString();
        isiJudul.setText(judul);

        String pengarang = DefaultTableModel.getValueAt(baris, 5).toString();
        isiPengarang.setText(pengarang);

        String penerbit = DefaultTableModel.getValueAt(baris, 6).toString();
        isiPenerbit.setText(penerbit);

        String tahunTerbit = DefaultTableModel.getValueAt(baris, 7).toString();
        isiTahun.setText(tahunTerbit);

        String jumlahHalaman = DefaultTableModel.getValueAt(baris, 9).toString();
        isiHalaman.setText(jumlahHalaman);

        String kategori = DefaultTableModel.getValueAt(baris, 8).toString();
       isiKategori.setText(kategori);

        String jumlahBuku = DefaultTableModel.getValueAt(baris, 10).toString();
        isiJumlah.setText(jumlahBuku);

        String subJudul = DefaultTableModel.getValueAt(baris, 11).toString();
        isiSub.setText(subJudul);

        String tanggal = DefaultTableModel.getValueAt(baris, 12).toString();
        isiTgl.setText(tanggal);
    }//GEN-LAST:event_DefaultTableModelMouseClicked

    private void jKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKeluarActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null, "Are you serious?", "Logout", JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            // Keluar dari aplikasi
            System.exit(0);
        }
    }//GEN-LAST:event_jKeluarActionPerformed

    private void cKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cKategoriMouseClicked

    }//GEN-LAST:event_cKategoriMouseClicked

    private void cKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cKategoriActionPerformed

    private void cSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cSearchActionPerformed

    private void isiKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiKategoriActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inputBuku.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inputBuku.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inputBuku.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inputBuku.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inputBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DefaultTableModel;
    private javax.swing.JComboBox<String> cKategori;
    private javax.swing.JComboBox<String> cSearch;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JButton input;
    private javax.swing.JTextField isiAngkatan;
    private javax.swing.JTextField isiHalaman;
    private javax.swing.JTextField isiID;
    private javax.swing.JTextField isiISBN;
    private javax.swing.JTextField isiJudul;
    private javax.swing.JTextField isiJumlah;
    private javax.swing.JTextField isiKategori;
    private javax.swing.JTextField isiNama;
    private javax.swing.JTextField isiPenerbit;
    private javax.swing.JTextField isiPengarang;
    private javax.swing.JTextField isiSub;
    private javax.swing.JTextField isiTahun;
    private javax.swing.JTextField isiTgl;
    private javax.swing.JButton jBuku;
    private javax.swing.JButton jHome;
    private javax.swing.JButton jKeluar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearch;
    private javax.swing.JButton jSkripsi;
    private javax.swing.JTextField jsearch;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelAtas;
    private javax.swing.JPanel panelBuku;
    private javax.swing.JPanel panelKiri;
    private javax.swing.JPanel panelTengah;
    private javax.swing.JButton peminjamanBuku;
    private javax.swing.JButton print;
    private javax.swing.JButton simpan;
    // End of variables declaration//GEN-END:variables
}
