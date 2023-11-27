/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;
import Utils.dbConnection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hirag
 */
public class DashboardForm extends javax.swing.JPanel {
    public DashboardForm() {
        initComponents();
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setForeground(new Color(255,246,244));
        headRender.setBackground(new Color(248,111,3));
        MainTableExp.getTableHeader().setDefaultRenderer(headRender);
        MainTableHab.getTableHeader().setDefaultRenderer(headRender);
        loadPeg();
        loadTran();
        loadKul();
        loadExp();
        loadHab();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hapus1 = new javax.swing.JPanel();
        peg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MainTableExp = new javax.swing.JTable();
        hapus2 = new javax.swing.JPanel();
        keluar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hapus3 = new javax.swing.JPanel();
        masuk = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        MainTableHab = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 246, 244));

        hapus1.setBackground(new java.awt.Color(248, 111, 3));

        peg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        peg.setForeground(new java.awt.Color(255, 246, 244));
        peg.setText("10");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Jumlah Pegawai");

        javax.swing.GroupLayout hapus1Layout = new javax.swing.GroupLayout(hapus1);
        hapus1.setLayout(hapus1Layout);
        hapus1Layout.setHorizontalGroup(
            hapus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hapus1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hapus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(peg)
                    .addComponent(jLabel2))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        hapus1Layout.setVerticalGroup(
            hapus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hapus1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(peg)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 111, 3));
        jLabel3.setText("List Barang Hampir Habis");

        MainTableExp.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(MainTableExp);

        hapus2.setBackground(new java.awt.Color(248, 111, 3));

        keluar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        keluar.setForeground(new java.awt.Color(255, 246, 244));
        keluar.setText("10");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Uang Keluar Dari Kulakan");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rp.");

        javax.swing.GroupLayout hapus2Layout = new javax.swing.GroupLayout(hapus2);
        hapus2.setLayout(hapus2Layout);
        hapus2Layout.setHorizontalGroup(
            hapus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hapus2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hapus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(hapus2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keluar)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        hapus2Layout.setVerticalGroup(
            hapus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hapus2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hapus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(keluar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        hapus3.setBackground(new java.awt.Color(248, 111, 3));

        masuk.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        masuk.setForeground(new java.awt.Color(255, 246, 244));
        masuk.setText("10");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Uang Masuk Dari Transaksi");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rp.");

        javax.swing.GroupLayout hapus3Layout = new javax.swing.GroupLayout(hapus3);
        hapus3.setLayout(hapus3Layout);
        hapus3Layout.setHorizontalGroup(
            hapus3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hapus3Layout.createSequentialGroup()
                .addGroup(hapus3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hapus3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(hapus3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masuk)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        hapus3Layout.setVerticalGroup(
            hapus3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hapus3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(hapus3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(masuk))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(248, 111, 3));
        jLabel8.setText("List Barang Hampir Kadaluarsa");

        MainTableHab.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(MainTableHab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(hapus2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70)
                            .addComponent(hapus3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(hapus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane2)))
                .addGap(0, 109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hapus2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapus3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(hapus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void loadPeg(){
        String query = "select count(*) as jumlah from users where role = 2";
        try{
            ResultSet rs = dbConnection.getData(query);
            rs.next();
            peg.setText(String.valueOf(rs.getInt("jumlah")));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }
    private void loadTran(){
        String query = "select sum(total_harga) as jumlah from transaksi";
        try{
            ResultSet rs = dbConnection.getData(query);
            rs.next();
            masuk.setText(String.valueOf(rs.getInt("jumlah")));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }
    private void loadKul(){
        String query = "select sum(total) as jumlah from kulaan";
        try{
            ResultSet rs = dbConnection.getData(query);
            rs.next();
            keluar.setText(String.valueOf(rs.getInt("jumlah")));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }
    private void loadExp(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Tanggal Kadaluarsa");
        
        String query = "SELECT barang.nama, detail_kulaan.tgl_exp FROM barang join detail_kulaan on barang.id = detail_kulaan.id_barang WHERE detail_kulaan.tgl_exp BETWEEN CURDATE() AND DATE_ADD(CURDATE(), INTERVAL 1 MONTH)";
        try{
            ResultSet rs = dbConnection.getData(query);
            while(rs.next()){
                tbl.addRow(new Object[]{rs.getString("nama"), rs.getDate("tgl_exp")});
            }
            MainTableExp.setModel(tbl);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }
    
    private void loadHab(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Sisa Stok");
        
        String query = "SELECT nama, stok from barang where stok < 20 ";
        try{
            ResultSet rs = dbConnection.getData(query);
            while(rs.next()){
                tbl.addRow(new Object[]{rs.getString("nama"), String.valueOf(rs.getInt("stok"))});
            }
            MainTableHab.setModel(tbl);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MainTableExp;
    private javax.swing.JTable MainTableHab;
    private javax.swing.JPanel hapus1;
    private javax.swing.JPanel hapus2;
    private javax.swing.JPanel hapus3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel keluar;
    private javax.swing.JLabel masuk;
    private javax.swing.JLabel peg;
    // End of variables declaration//GEN-END:variables
}
