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

public class MenuBuku extends javax.swing.JPanel {
    private String idKategori;
    private String idPenerbit;

    private final Connection conn;

    public MenuBuku() {
        initComponents();

        conn = Koneksi.getConnection();
        setTabelModel();
        loadData();
        actionButton();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        panelAdd = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPengarang = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTahun = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbxKategori = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbxPenerbit = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        panelMain.setLayout(new java.awt.CardLayout());

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
        jLabel1.setText("Data Buku");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Data Buku Perpustakaan");

        btnAdd.setBackground(new java.awt.Color(51, 51, 255));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("TAMBAH");

        btnDelete.setBackground(new java.awt.Color(204, 0, 51));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("HAPUS");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancel))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, Short.MAX_VALUE)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(110, 110, 110))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Tambah Data Buku Perpustakaan");

        btnSave.setBackground(new java.awt.Color(51, 51, 255));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SIMPAN");

        jButton6.setBackground(new java.awt.Color(255, 102, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BATAL");

        txtID.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtID.setForeground(new java.awt.Color(153, 153, 153));
        txtID.setText("ID");

        txtJudul.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtJudul.setForeground(new java.awt.Color(153, 153, 153));
        txtJudul.setText("Judul Buku");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Judul Buku");

        txtPengarang.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtPengarang.setForeground(new java.awt.Color(153, 153, 153));
        txtPengarang.setText("Nama Pengarang");
        txtPengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPengarangActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Pengarang");

        txtTahun.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtTahun.setForeground(new java.awt.Color(153, 153, 153));
        txtTahun.setText("Tahun Terbit");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Tahun Terbit");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Kategori");

        cbxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kategori" }));
        cbxKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxKategoriActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Penerbit");

        cbxPenerbit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Penerbit" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Kategori");

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(txtJudul)
                            .addComponent(txtPengarang)
                            .addComponent(txtTahun))))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel12))
                    .addComponent(jLabel11)
                    .addComponent(cbxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(720, Short.MAX_VALUE))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void txtPengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPengarangActionPerformed

    private void cbxKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxKategoriActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        searchData();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed

    }//GEN-LAST:event_txtSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbxKategori;
    private javax.swing.JComboBox<String> cbxPenerbit;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTahun;
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
                
                txtID.setText(setIDBuku());
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
          
           btnDelete.addActionListener(new ActionListener(){
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
           
           btnCancel.addActionListener(new ActionListener(){
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
                    btnDelete.setVisible(true);
                    btnCancel.setVisible(true);
                 }
            }
        });
    }
     // Button Add, Save, Delete, Cancel, Search, TableMouseClick
    
    
    // Fungsi Yg Lainnya
    
    private void loadData() {
        getKategori();
        getPenerbit();
        getData((DefaultTableModel) tblData.getModel());
    }

    private void showPanel() {
        panelMain.removeAll();
        panelMain.add(new MenuBuku());
        panelMain.repaint();
        panelMain.revalidate();
    }

    private void setTabelModel() {
    // Hapus model lama dan buat model baru
    String[] columnNames = {"ID Buku", "Judul", "Pengarang", "Tahun Terbit", "ID Kategori", "Nama Kategori",  "ID Penerbit",  "Nama Penerbit"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    tblData.setModel(model);
}

    private void getData(DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = """
                SELECT bk.ID_Buku, bk.Judul_Buku, bk.Pengarang_Buku, bk.Tahun_Terbit, 
                ktg.ID_Kategori, ktg.Nama_Kategori, 
                pnb.ID_Penerbit, pnb.Nama_Penerbit
                FROM buku bk
                INNER JOIN kategori ktg ON ktg.ID_Kategori = bk.ID_Kategori
                INNER JOIN penerbit pnb ON pnb.ID_pENERBIT = bk.ID_Penerbit
                ORDER BY bk.ID_Buku DESC
                   """;

            try (PreparedStatement st = (PreparedStatement) conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idBuku           = rs.getString("ID_Buku");
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
            Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private String setIDBuku() {
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);

        String sql = "SELECT RIGHT(ID_Buku, 4) AS Nomor "
                + "FROM buku "
                + "WHERE ID_Buku LIKE 'BK" + no + "%' "
                + "ORDER BY ID_Buku DESC "
                + "LIMIT 1";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "BK" + no + String.format("%04d", nomor);
            } else {
                urutan = "BK" + no + "0001";
            }

        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
        }

        return urutan;
    }
    
    private void getKategori (){
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Kategori");
            String sql = "SELECT ID_Kategori, Nama_Kategori FROM kategori";
            PreparedStatement st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                String namaKategori = rs.getString("Nama_Kategori");
                model.addElement (namaKategori);
            }
            cbxKategori.setModel(model);
            cbxKategori.addActionListener(e -> {
                int selectIndex = cbxKategori.getSelectedIndex();
                
                if(selectIndex > 0){
                  try { 
                      rs.absolute(selectIndex);
                      idKategori = rs.getString("ID_Kategori");
                  } catch (SQLException ex) {
                      ex.printStackTrace();
                      
                  }
              }
        });
           
        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    private void getPenerbit (){
         try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Penerbit");
            String sql = "SELECT ID_Penerbit, Nama_Penerbit FROM penerbit";
            PreparedStatement st = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                String namaPenerbit = rs.getString("Nama_Penerbit");
                model.addElement (namaPenerbit);
            }
            cbxPenerbit.setModel(model);
            cbxPenerbit.addActionListener(e -> {
                int selectIndex = cbxPenerbit.getSelectedIndex();
                
                if(selectIndex > 0){
                  try { 
                      rs.absolute(selectIndex);
                      idPenerbit = rs.getString("ID_Penerbit");
                  } catch (SQLException ex) {
                      ex.printStackTrace();
                      
                  }
              }
        });
           
        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    private void updateData() {
    String idBuku = txtID.getText();
    String judulBuku = txtJudul.getText();
    String pengarangBuku = txtPengarang.getText();
    String tahunTerbit = txtTahun.getText();
    
    if (idBuku.isEmpty()
            || judulBuku.isEmpty()
            || pengarangBuku.isEmpty()
            || tahunTerbit.isEmpty()
            || cbxKategori.getSelectedItem().toString().equals("Pilih Kategori") 
            || cbxPenerbit.getSelectedItem().toString().equals("Pilih Penerbit")) {
        JOptionPane.showMessageDialog(this, "Semua kolom harus dipilih dan diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // PERBAIKAN: Tambah =? dan ubah urutan parameter
        String sql = "UPDATE buku SET Judul_Buku=?, Pengarang_Buku=?, Tahun_Terbit=?,ID_Kategori=?,ID_Penerbit=? ";
                sql +=  "WHERE ID_Buku=?";
                
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, judulBuku);
            st.setString(2, pengarangBuku);
            st.setString(3, tahunTerbit);
            st.setString(4, idKategori);
            st.setString(5, idPenerbit);
            st.setString(6, idBuku);  // ID di parameter terakhir

            int rowUpdated = st.executeUpdate();
            if (rowUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                resetForm();
                loadData();
                showPanel();
            }
        }
    } catch (SQLException e) {
        Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
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
    txtTahun.setText(tblData.getValueAt(row, 3).toString()); // Kolom 3: Tahun
    idKategori = tblData.getModel().getValueAt(row, 4).toString();
    idPenerbit = tblData.getModel().getValueAt(row, 6).toString();
    
    getKategoriID(idKategori);
    getPenerbitID(idPenerbit);

}
   //ini kaya ambil id dari comboboxnya buat diupdate
     private void getKategoriID(String id){
         try {
             String sql= "SELECT ID_Kategori, Nama_Kategori FROM kategori";
             PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery();
             
             while(rs.next()) {
                 String idKat = rs.getString("ID_Kategori");
                 String namaKat = rs.getString("Nama_Kategori");
                 
                 if(id.equals(idKat)) {
                    cbxKategori.setSelectedItem(namaKat);                              
                 }
             }
             
             cbxKategori.addItemListener(new ItemListener(){
             @Override
             public void itemStateChanged(ItemEvent e) {
                 if (e.getStateChange () == ItemEvent.SELECTED) {
                     String selectedKat = (String) cbxKategori.getSelectedItem().toString();
                     updateKategoriID(selectedKat);
                 }
             }
         });
        
         }catch (Exception e) {
             e.printStackTrace();
         }
     }
     
     private void updateKategoriID(String selectedKat){
         try {
             String sql = "SELECT ID_Kategori, Nama_Kategori FROM kategori WHERE Nama_Kategori = ?";
             PreparedStatement st = conn.prepareStatement(sql);
             st.setString(1, selectedKat);
             ResultSet rs = st.executeQuery();
             
             if (rs.next()) {
                 String idKat = rs.getString("ID_Kategori");
             }
            } catch (Exception e) {
                e.printStackTrace();
         }
     }
     
     private void getPenerbitID(String id){
     try {
             String sql= "SELECT ID_Penerbit, Nama_Penerbit FROM penerbit";
             PreparedStatement st = conn.prepareStatement(sql);
             ResultSet rs = st.executeQuery();
             
             while(rs.next()) {
                 String idPnb = rs.getString("ID_Penerbit");
                 String namaPnb = rs.getString("Nama_Penerbit");

                 if(id.equals(idPnb)) {
                  cbxPenerbit .setSelectedItem(namaPnb);                              
                 }
             }
             
             cbxPenerbit.addItemListener(new ItemListener(){
             @Override
             public void itemStateChanged(ItemEvent e) {
                 if (e.getStateChange () == ItemEvent.SELECTED) {
                     String selectedPenerbit = (String) cbxPenerbit.getSelectedItem().toString();
                     updatePenerbitID(selectedPenerbit);
                 }
             }
         });
        
         }catch (Exception e) {
             e.printStackTrace();
         }    
     }
     
     private void updatePenerbitID(String selectedPenerbit){
      try {
             String sql = "SELECT ID_Penerbit, Nama_Penerbit FROM penerbit WHERE Nama_Penerbit = ?";
             PreparedStatement st = conn.prepareStatement(sql);
             st.setString(1, selectedPenerbit);
             ResultSet rs = st.executeQuery();
             
             if (rs.next()) {
                 String idPnb = rs.getString("ID_Penerbit");
             }
            } catch (Exception e) {
                e.printStackTrace();
         }    
     }

private void insertData() {
    String idBuku = txtID.getText();
    String judulBuku = txtJudul.getText();
    String pengarangBuku = txtPengarang.getText();
    String tahunTerbit = txtTahun.getText();
    
    if (idBuku.isEmpty()
            || judulBuku.isEmpty()
            || pengarangBuku.isEmpty()
            || tahunTerbit.isEmpty()
            || cbxKategori.getSelectedItem().toString().equals("Pilih Kategori") 
            || cbxPenerbit.getSelectedItem().toString().equals("Pilih Penerbit")) {
        JOptionPane.showMessageDialog(this, "Semua kolom harus diisi", "Validasi", JOptionPane.ERROR_MESSAGE);
        return;
    }
           
    try {
        String sql = "INSERT INTO buku (ID_Buku, Judul_Buku, Pengarang_Buku,Tahun_Terbit, ID_Kategori, ID_Penerbit) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement st = conn.prepareStatement(sql)) {
            st.setString(1, idBuku);
            st.setString(2, judulBuku);
            st.setString(3, pengarangBuku);
            st.setString(4, tahunTerbit);
            st.setString(5, idKategori);
            st.setString(6, idPenerbit);
            
            
            int rowInserted = st.executeUpdate();
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                resetForm();
                loadData();
                showPanel();
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
        }
    } catch (Exception e) {  // TAMBAHAN: catch untuk try yang luar
        Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
    }
}
    private void resetForm() {

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
                String sql = "DELETE FROM buku WHERE ID_Buku=?";
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
                Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
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
                         SELECT bk.ID_Buku, bk.Judul_Buku, bk.Pengarang_Buku, bk.Tahun_Terbit, ktg.ID_Kategori, ktg.Nama_Kategori, pnb.ID_Penerbit, pnb.Nama_Penerbit
                                         FROM buku bk 
                                         INNER JOIN kategori ktg ON ktg.ID_Kategori = bk.ID_Kategori
                                         INNER JOIN penerbit pnb ON pnb.ID_pENERBIT = bk.ID_Penerbit
                                         WHERE bk.Judul_Buku LIKE ? OR bk.Pengarang_Buku LIKE ?""";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();

               while (rs.next()) {
                    String idBuku           = rs.getString("ID_Buku");
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
            Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(() -> {
        javax.swing.JFrame frame = new javax.swing.JFrame("Test MenuBuku");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new MenuBuku());
        frame.pack();
        frame.setLocationRelativeTo(null); // center di layar
        frame.setVisible(true);
    });
}

  
}
