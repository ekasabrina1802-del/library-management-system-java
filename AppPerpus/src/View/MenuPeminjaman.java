package View;

/**
 *
 * @author Sabrina
 */
import Config.Koneksi;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class MenuPeminjaman extends javax.swing.JPanel {

    private Connection conn = null;
    private String userID;
    private boolean closable;
    

    public MenuPeminjaman( String userID) {
        initComponents();

        conn = Koneksi.getConnection();
        this.userID = userID;
        setTabelModel();
        setTabelModelSementara();
        loadData();
        loadDataSementara();
        actionButton();

    }

    public MenuPeminjaman() {
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        panelAdd = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTanggalPinjam = new javax.swing.JTextField();
        txtTanggalKembali = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdAnggota = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTelepon = new javax.swing.JTextField();
        btnSetAnggota = new javax.swing.JButton();
        txtJumlah = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPengarang = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPenerbit = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnSetBuku = new javax.swing.JButton();
        txtIdBuku = new javax.swing.JTextField();
        lbTotal = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDataSementara = new javax.swing.JTable();

        dateChooser1.setTextRefernce(txtTanggalPinjam);

        dateChooser2.setTextRefernce(txtTanggalKembali);

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setPreferredSize(new java.awt.Dimension(1133, 649));

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblData);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Peminjaman Buku Perpustakaan");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Data Peminjaman Buku Perpustakaan");

        btnAdd.setBackground(new java.awt.Color(51, 51, 255));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("TAMBAH");

        btnCancel.setBackground(new java.awt.Color(255, 102, 0));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("BATAL");

        txtSearch.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Search");
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));
        panelAdd.setOpaque(false);
        panelAdd.setPreferredSize(new java.awt.Dimension(1133, 636));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Tambah Data Peminjaman Buku Perpustakaan");

        btnSave.setBackground(new java.awt.Color(51, 51, 255));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SIMPAN");

        btnCancel2.setBackground(new java.awt.Color(255, 102, 0));
        btnCancel2.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel2.setText("BATAL");

        txtID.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtID.setForeground(new java.awt.Color(153, 153, 153));
        txtID.setText("ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ID");

        txtTanggalPinjam.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtTanggalPinjam.setForeground(new java.awt.Color(153, 153, 153));
        txtTanggalPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalPinjamActionPerformed(evt);
            }
        });

        txtTanggalKembali.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtTanggalKembali.setForeground(new java.awt.Color(153, 153, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tanggal Pinjam");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tanggal Kembali");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTanggalKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        txtIdAnggota.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtIdAnggota.setForeground(new java.awt.Color(153, 153, 153));
        txtIdAnggota.setText("ID Anggota");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Anggota");

        txtNama.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtNama.setForeground(new java.awt.Color(153, 153, 153));
        txtNama.setText("Nama");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Nama");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("Email");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Email");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Telepon");

        txtTelepon.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtTelepon.setForeground(new java.awt.Color(153, 153, 153));
        txtTelepon.setText("Telepon");

        btnSetAnggota.setText("...........");
        btnSetAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetAnggotaActionPerformed(evt);
            }
        });

        txtJumlah.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtJumlah.setForeground(new java.awt.Color(153, 153, 153));
        txtJumlah.setText("Jumlah");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Jumlah");

        txtJudul.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtJudul.setForeground(new java.awt.Color(153, 153, 153));
        txtJudul.setText("Judul");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Judul");

        txtPengarang.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtPengarang.setForeground(new java.awt.Color(153, 153, 153));
        txtPengarang.setText("Pengarang");

        btnDelete.setBackground(new java.awt.Color(204, 0, 51));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("HAPUS");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(51, 51, 255));
        btnUbah.setForeground(new java.awt.Color(255, 255, 255));
        btnUbah.setText("UBAH");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Pengarang");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Penerbit");

        txtPenerbit.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtPenerbit.setForeground(new java.awt.Color(153, 153, 153));
        txtPenerbit.setText("Penerbit");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Buku");

        btnSetBuku.setText("..........");

        txtIdBuku.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtIdBuku.setForeground(new java.awt.Color(153, 153, 153));
        txtIdBuku.setText("ID");

        lbTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTotal.setText("TOTAL");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Total Pinjam");

        tblDataSementara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblDataSementara);

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)))
                        .addGap(18, 18, 18)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSetAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTelepon)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtJudul, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPengarang, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSetBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotal)
                    .addComponent(jLabel17))
                .addGap(194, 194, 194))
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addGap(17, 17, 17)
                                .addComponent(lbTotal))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(btnSetBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(9, 9, 9)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(11, 11, 11)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)))))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(btnSetAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        searchData();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSetAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSetAnggotaActionPerformed

    private void txtTanggalPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalPinjamActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancel2;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSetAnggota;
    private javax.swing.JButton btnSetBuku;
    private javax.swing.JButton btnUbah;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JTable tblData;
    private javax.swing.JTable tblDataSementara;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIdAnggota;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTanggalKembali;
    private javax.swing.JTextField txtTanggalPinjam;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables

    // Button Add, Save, Delete, Cancel, Search, TableMouseClick
    private void actionButton(){
          btnAdd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                panelMain.removeAll();
                panelMain.add(panelAdd);
                panelMain.repaint();
                panelMain.revalidate();
                
                txtID.setText(setIdPeminjaman());
                if(btnAdd.getText().equals("UBAH")){
                    dataTabel();
                    btnSave.setText("PERBARUI");
                }
            }
        });
          btnSave.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            if (btnSave.getText().equals("TAMBAH")) {
                btnSave.setText("SIMPAN");
            } else if (btnSave.getText().equals("SIMPAN")) {
                insertData();
            } else if (btnSave.getText().endsWith("PERBARUI")) {
                updateData();
            }       
            }
        });
          
           btnUbah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              deleteData();
            }
        });
           
           btnCancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              showPanel();
              loadData();
            }
        });
           
           btnCancel2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              showPanel();
              loadData();
            }
        });
           
        txtSearch.addKeyListener(new KeyAdapter() {
        @Override
        public void keyReleased(KeyEvent e) {
               searchData();
           }
        });
        
        tblData.addMouseListener(new MouseAdapter() {
            @Override
                public void mouseClicked(MouseEvent e) {
                if (btnAdd.getText().equals("TAMBAH")) {
                    btnAdd.setText("UBAH");
                    btnUbah.setVisible(true);
                    btnCancel.setVisible(true);
                 }
            }
        });
        
            btnSetAnggota.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setAnggota();
            }
        });
            btnSetBuku.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                setBuku();
            }
        });
            
            txtJumlah.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                insertDataSementara();
            }
            });
    }
     // Button Add, Save, Delete, Cancel, Search, TableMouseClick
    
    
    // Fungsi Yg Lainnya
    
    private void loadData() {
    int startIndex = 0;         // mulai dari baris pertama
    int entriesPage = 100;      // jumlah baris yang ingin diambil
    DefaultTableModel model = (DefaultTableModel) tblData.getModel();

    getData(startIndex, entriesPage, model);
        btnUbah.setVisible(false);
        btnCancel.setVisible(false);
    }
    
    private void loadDataSementara(){
        getDataSementara((DefaultTableModel) tblDataSementara.getModel());
}

    private void showPanel() {
        panelMain.removeAll();
        panelMain.add(new MenuPeminjaman(userID));
        panelMain.repaint();
        panelMain.revalidate();
    }

    private void setTabelModel() {
    // Hapus model lama dan buat model baru
    String[] columnNames = {"ID Peminjaman", "Tanggal Peminjaman", "Tanggal Pengembalian","Total", "Nama Anggota", "Petugas"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    tblData.setModel(model);
}

    public void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT pm.ID_Peminjaman, pm.Tanggal_Peminjaman, pm.Tanggal_Pengembalian, pm.Total_Pinjam, agt.Nama_Anggota, usr.Nama_User\n" +
                         "FROM peminjaman pm\n" +
                         "INNER JOIN anggota agt ON agt.ID_Anggota = pm.ID_Anggota\n" +
                         "INNER JOIN USER usr ON usr.ID_User = pm.ID_User ORDER BY pm.ID_Peminjaman ASC LIMIT ?,?";
            try (PreparedStatement st =  conn.prepareStatement(sql)) {
                st.setInt(1, startIndex);
                st.setInt(2, entriesPage);
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idPeminjaman         = rs.getString("ID_Peminjaman");
                    String tanggalPinjam        = rs.getString("Tanggal_Peminjaman");
                    String tanggalKembali       = rs.getString("Tanggal_Pengembalian");
                    String totalPinjam          = rs.getString("Total_Pinjam");
                    String namaAnggota          = rs.getString("Nama_Anggota");
                    String namaUser             = rs.getString("Nama_User");
                    

                    Object[] rowData = {idPeminjaman,
                        tanggalPinjam,
                        tanggalKembali,
                        totalPinjam,
                        namaAnggota,
                        namaUser};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
        private void setTabelModelSementara() {
    // Hapus model lama dan buat model baru
    String[] columnNames = {"ID ", "Judul", "Pengarang","Penerbit", "Jumlah"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    tblDataSementara.setModel(model);
}

    private String setIdPeminjaman() {
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);

        String sql = "SELECT RIGHT(ID_Peminjaman, 4) AS Nomor "
                + "FROM peminjaman "
                + "WHERE ID_Peminjaman LIKE 'PM" + no + "%' "
                + "ORDER BY ID_Peminjaman DESC "
                + "LIMIT 1";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "PM" + no + String.format("%04d", nomor);
            } else {
                urutan = "PM" + no + "0001";
            }

        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }

        return urutan;
    }
    
     public void getDataSementara(DefaultTableModel model) {
        model.setRowCount(0);
        
        try {
            String sql = "SELECT * FROM sementara";
            try (PreparedStatement st =  conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idBuku                = rs.getString("Id_Peminjaman");
                    String judulBuku             = rs.getString("Judul_Buku");
                    String pengarangBuku         = rs.getString("Pengarang_Buku");
                    String penerbitBuku          = rs.getString("Penerbit_Buku");
                    String jumlahPinjam          = rs.getString("Jumlah_Pinjam");               

                    Object[] rowData = {idBuku,
                        judulBuku,
                       pengarangBuku,
                        penerbitBuku,
                         jumlahPinjam};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    private void setAnggota(){
        boolean closable = true;
        DataAnggota anggota = new DataAnggota(null, closable);
        anggota.setVisible(true);
        
        txtIdAnggota.setText(anggota.getIdAnggota());
        txtNama.setText(anggota.getNamaAnggota());
        txtEmail.setText(anggota.getEmailAnggota());
        txtTelepon.setText(anggota.getTeleponeAnggota());
        
        txtIdAnggota.setEnabled(false);
        txtNama.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelepon.setEnabled(false);
        
    }
    
        private void setBuku(){
        boolean closable = true;
        DataBuku buku = new DataBuku(null, closable);
        buku.setVisible(true);
        
        txtIdBuku.setText(buku.getIdBuku());
        txtJudul.setText(buku.getJudulBuku());
        txtPengarang.setText(buku.getPengarangBuku());
        txtPenerbit.setText(buku.getPenerbitBuku());
        
        txtIdBuku.setEnabled(false);
        txtJudul.setEnabled(false);
        txtPengarang.setEnabled(false);
        txtPenerbit.setEnabled(false);
    }

    private void updateData() {
    String idBuku = txtID.getText();
    String judulBuku = txtJudul.getText();
    String pengarangBuku = txtPengarang.getText();
    
    if (idBuku.isEmpty()
            || judulBuku.isEmpty()
            || pengarangBuku.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Semua kolom harus dipilih dan diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // PERBAIKAN: Tambah =? dan ubah urutan parameter
        String sql = "UPDATE buku SET Judul_Buku=?, Pengarang_Buku=?, Tahun_Terbit=?,ID_Kategori=?,ID_Penerbit=? ";
                sql +=  "WHERE ID_Peminjaman=?";
                
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, judulBuku);
            st.setString(2, pengarangBuku);
            st.setString(6, idBuku);  // ID di parameter terakhir

            int rowUpdated = st.executeUpdate();
        }
    } catch (SQLException e) {
        Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
    }
}

   private void dataTabel() {
    panelView.setVisible(false);
    panelAdd.setVisible(true);

    int row = tblData.getSelectedRow();
    jLabel4.setText("Perbarui Data Buku Perpustakaan");

    txtID.setEnabled(false);
    String id = tblData.getModel().getValueAt(row,0).toString();

    txtID.setText(tblData.getValueAt(row, 0).toString());     // Kolom 0: ID
    txtJudul.setText(tblData.getValueAt(row, 1).toString());   // Kolom 1: Judul
    txtPengarang.setText(tblData.getValueAt(row, 2).toString());  // Kolom 2: Pengarang_Buku
}
   
private void insertDataSementara() {
    String idBuku = txtIdBuku.getText();
    String judulBuku = txtJudul.getText();
    String pengarangBuku = txtPengarang.getText();
    String penerbitBuku = txtPenerbit.getText();
    String jumlahPinjam = txtJumlah.getText();
    String statusPinjam = "Sedang Dipinjam";
    
    if (idBuku.isEmpty()
            || judulBuku.isEmpty()
            || pengarangBuku.isEmpty()
            || penerbitBuku.isEmpty()
            || jumlahPinjam.isEmpty()
            || statusPinjam.isEmpty()){
        JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
    }
            
    try {
        String sql = "INSERT INTO sementara (ID_Peminjaman, Judul_Buku, Pengarang_Buku,Tahun_Terbit, ID_Kategori, ID_Penerbit) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idBuku);
            st.setString(2, judulBuku);
            st.setString(3, pengarangBuku);
            st.setString(4, penerbitBuku);
            st.setString(5, jumlahPinjam);
            st.setString(6, statusPinjam);
            
            
             st.executeUpdate();
             int totalPinjam = getTotalPinjam();
             lbTotal.setText(String.valueOf(totalPinjam));
             loadDataSementara();
             
             if (JOptionPane.showConfirmDialog(this, "Mau Tambah Buku?", 
        "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
    
            resetFormBuku();
            btnSetBuku.requestFocus();

        } else {

            resetFormBuku();
            btnSave.requestFocus();
        }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
}

private int getTotalPinjam(){
    int totalPinjam = 0;

try {
    String sql = "SELECT SUM(Jumlah_Pinjam) as total FROM sementara";
    try (PreparedStatement st = conn.prepareStatement(sql)) {
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            totalPinjam = rs.getInt("total");
        }
    }
} catch (SQLException e) {
    Logger.getLogger(TransaksiPeminjaman.class.getName()).log(Level.SEVERE, null, e);
}

return totalPinjam;

}



private void insertData() {
   String idBuku = txtIdBuku.getText();
    String judulBuku = txtJudul.getText();
    String pengarangBuku = txtPengarang.getText();
    String penerbitBuku = txtPenerbit.getText();
    String jumlahPinjam = txtJumlah.getText();
    String statusPinjam = "Sedang Dipinjam";
    
    if (idBuku.isEmpty()
            || judulBuku.isEmpty()
            || pengarangBuku.isEmpty()
            || penerbitBuku.isEmpty()
            || jumlahPinjam.isEmpty()
            || statusPinjam.isEmpty()){
        JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
    }
            
    try {
        String sql = "INSERT INTO sementara (ID_Peminjaman, Judul_Buku, Pengarang_Buku, Penerbit_Buku, Jumlah_Pinjam, Status_Pinjam) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idBuku);
            st.setString(2, judulBuku);
            st.setString(3, pengarangBuku);
            st.setString(4, penerbitBuku);
            st.setString(5, jumlahPinjam);
            st.setString(6, statusPinjam);
            
            
             st.executeUpdate();
             int totalPinjam = getTotalPinjam();
             lbTotal.setText(String.valueOf(totalPinjam));
             loadDataSementara();
             
             if (JOptionPane.showConfirmDialog(this, "Mau Tambah Buku?", 
        "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
    
            resetFormBuku();
            btnSetBuku.requestFocus();

        } else {

            resetFormBuku();
            btnSave.requestFocus();
        }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
}
    private void resetForm() {
        txtID.setText("");
        txtJudul.setText("");
        txtPengarang.setText("");

    }
    
    private void resetFormBuku(){
        txtIdBuku.setText("");
        txtJudul.setText("");
        txtPengarang.setText("");
        txtPenerbit.setText("");
        txtJumlah.setText("");

}

    private void deleteData() {
        int selectedRow = tblData.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this,
                "Apakah yakin ingin menghapus data ini ?",
                "Konfirmasi Hapus Data",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            String id = tblData.getValueAt(selectedRow, 0).toString();
            try {
                String sql = "DELETE FROM buku WHERE ID_Peminjaman=?";
                try (PreparedStatement st = conn.prepareStatement(sql)) {
                    st.setString(1, id);

                    int rowDeleted = st.executeUpdate();
                    if (rowDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");

                    } else {
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }
                }
            } catch (SQLException e) {
                Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        resetForm();
        loadData();
        showPanel();
    }

    private void searchData() {
        String kataKunci = txtSearch.getText();

        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);

        try {
            String sql = """
                         SELECT bk.ID_Peminjaman, bk.Judul_Buku, bk.Pengarang_Buku, bk.Tahun_Terbit, ktg.ID_Kategori, ktg.Nama_Kategori, pnb.ID_Penerbit, pnb.Nama_Penerbit
                                         FROM buku bk 
                                         INNER JOIN kategori ktg ON ktg.ID_Kategori = bk.ID_Kategori
                                         INNER JOIN penerbit pnb ON pnb.ID_pENERBIT = bk.ID_Penerbit
                                         WHERE bk.Judul_Buku LIKE ? OR bk.Pengarang_Buku LIKE ?""";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();

               while (rs.next()) {
                    String idBuku           = rs.getString("ID_Peminjaman");
                    String judulBuku        = rs.getString("Judul_Buku");
                    String pengarangBuku    = rs.getString("Pengarang_Buku");
                    String tahunTerbit      = rs.getString("Tahun_Terbit");
                    String idKategori       = rs.getString("ID_Kategori");
                    String namaKategori     = rs.getString("Nama_Kategori");
                    String idPenerbit       = rs.getString("ID_Penerbit");
                    String namaPenerbit     = rs.getString("Nama_Penerbit");
                    

                    Object[] rowData = {idBuku,
                        judulBuku,
                        pengarangBuku,
                        tahunTerbit,
                        idKategori,
                        namaKategori,
                        idPenerbit,
                        namaPenerbit,};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPeminjaman.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(() -> {
        javax.swing.JFrame frame = new javax.swing.JFrame("Test MenuBuku");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new MenuPeminjaman());
        frame.pack();
        frame.setLocationRelativeTo(null); // center di layar
        frame.setVisible(true);
    });
}

    private static class TransaksiPeminjaman {

        public TransaksiPeminjaman() {
        }
    }

  
}
