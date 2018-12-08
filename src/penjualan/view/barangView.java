/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.view;
import penjualan.entity.barang;
import penjualan.implement.barangImplement;
import penjualan.interfc.barangInterfc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rahadian Permana
 */
public class barangView extends javax.swing.JFrame {
 //untuk menampung getall
    List<barang> record = new ArrayList<barang>();
    //untuk membuat object dari class
    barangImplement brgservis;
    //untuk membantu dalam menampilkan data
    int row;
    JTable tabelbarang = new JTable();
    /**
     * Creates new form barangView
     */
    public barangView() {
        initComponents();
        brgservis = new barangImplement();
        tblBarang.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
           row = tblBarang.getSelectedRow();
           if(row!=-1){
           isiText();
           }
            }
        });
        this.statusAwal();
    }

    void loadData(){
    try{
    record = brgservis.getAll();
        }catch (SQLException ex){
        Logger.getLogger(barangView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void isiTable(){
        Object data[][]= new Object[record.size()][4];
        int x=0;
        for (barang brg : record){
            data[x][0] = brg.getKodeBarang();
            data[x][1] = brg.getNamaBarang();
            data[x][2] = brg.getJml();
            data[x][3] = brg.getHarga();
            x++;
        }
        String judul [] ={"kode_barang","nama_barang", "jumlah", "harga"};
        tblBarang.setModel(new DefaultTableModel (data,judul));
        jScrollPane1.setViewportView(tblBarang);
    
    }
    
    void  isiText(){
        barang brg =record.get(row);
        kodeBarang.setText(brg.getKodeBarang());
        namaBarang.setText(brg.getNamaBarang());
        Jumlah.setText(brg.getJml()+" ");
        harga.setText(brg.getHarga()+" ");
    }
    
    void kosongkanText(){
        kodeBarang.setText("");
        namaBarang.setText("");
        Jumlah.setText("");
        harga.setText("");   
    }
    
    void statusAwal(){
        kosongkanText();
        loadData();
        isiTable();
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
        jLabel1 = new javax.swing.JLabel();
        kodeBarang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        namaBarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Jumlah = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Kode Barang");

        kodeBarang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nama Barang");

        namaBarang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Jumlah");

        Jumlah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Harga");

        harga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnTambah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        tblBarang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblBarang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                            .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(26, 26, 26))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(28, 28, 28)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kodeBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(namaBarang))))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTambah)
                .addGap(39, 39, 39)
                .addComponent(btnUbah)
                .addGap(39, 39, 39)
                .addComponent(btnHapus)
                .addGap(39, 39, 39)
                .addComponent(btnKeluar)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKeluar)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnTambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
         try {
            barang brg = new barang();
            brg.setKodeBarang(kodeBarang.getText());
            brg.setNamaBarang(namaBarang.getText());
            brg.setJml(Jumlah.getText());
            brg.setHarga(harga.getText());
            brgservis.insert(brg);
            this.statusAwal();
            JOptionPane.showMessageDialog(this, "barang tersimpan");
        } catch (SQLException ex){
            Logger.getLogger(barangView.class.getName()).log(Level.SEVERE, null,ex);
            JOptionPane.showMessageDialog(this, ex);
        }
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        try{
            barang brg = new barang();
            brg.setKodeBarang(kodeBarang.getText());
            brg.setNamaBarang(namaBarang.getText());
            brg.setJml(Jumlah.getText());
            brg.setHarga(harga.getText());
            brgservis.update(brg);
            this.statusAwal();
            JOptionPane.showMessageDialog(this, "barang diupdate");
        }catch (SQLException ex){
            Logger.getLogger(barangView.class.getName()).log(Level.SEVERE, null,ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        barang brg = new barang();
        String kode_barang = kodeBarang.getText();
        try{
            brgservis.delete(kode_barang);
        } catch (SQLException ex){
            Logger.getLogger(barangView.class.getName()).log(Level.SEVERE, null,ex);
            JOptionPane.showMessageDialog(this, ex);
        }
        this.statusAwal();
        JOptionPane.showMessageDialog(this, "barang terhapus");
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(barangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barangView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jumlah;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kodeBarang;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTable tblBarang;
    // End of variables declaration//GEN-END:variables
}
