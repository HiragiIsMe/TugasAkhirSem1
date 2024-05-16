/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import Utils.dbConnection;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author hirag
 */
public class KulakanForm extends javax.swing.JPanel {
    private DefaultTableModel tbl = new DefaultTableModel();
    private List<Integer> id = new ArrayList<>();
    private List<Integer> idBrg = new ArrayList<>();
    public KulakanForm() {
        initComponents();
        DefaultTableCellRenderer headRender = new DefaultTableCellRenderer();
        headRender.setForeground(new Color(255,246,244));
        headRender.setBackground(new Color(248,111,3));
        MainTable.getTableHeader().setDefaultRenderer(headRender);
        loadTable();
        loadBarang();
        AutoCompleteDecorator.decorate(barang);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hargakul = new javax.swing.JTextField();
        jPanelLog1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        stok = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        exp = new com.toedter.calendar.JDateChooser();
        barang = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        catatan = new javax.swing.JTextArea();
        jPanelLog2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MainTable = new javax.swing.JTable();
        hapus = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 246, 244));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(248, 111, 3));
        jLabel1.setText("Kulakan");

        MainPanel.setBackground(new java.awt.Color(255, 246, 244));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 112, 4)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 111, 3));
        jLabel4.setText("Nama Barang");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 111, 3));
        jLabel5.setText("Stok Didapat");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(248, 111, 3));
        jLabel6.setText("Harga Kulakan");

        hargakul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 112, 4)));
        hargakul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hargakulKeyTyped(evt);
            }
        });

        jPanelLog1.setBackground(new java.awt.Color(248, 111, 3));
        jPanelLog1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLog1MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 246, 244));
        jLabel8.setText("Tambah");

        javax.swing.GroupLayout jPanelLog1Layout = new javax.swing.GroupLayout(jPanelLog1);
        jPanelLog1.setLayout(jPanelLog1Layout);
        jPanelLog1Layout.setHorizontalGroup(
            jPanelLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(jPanelLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLog1Layout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        jPanelLog1Layout.setVerticalGroup(
            jPanelLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanelLog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLog1Layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        stok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 112, 4)));
        stok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stokKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(248, 111, 3));
        jLabel9.setText("Tanggal Kadaluarsa");

        exp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 111, 3)));

        barang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 112, 4)));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelLog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(hargakul, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(barang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stok)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(3, 3, 3)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(barang, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hargakul)
                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanelLog1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 246, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 112, 4)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(248, 111, 3));
        jLabel7.setText("Total Harga");

        total.setEditable(false);
        total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 112, 4)));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(248, 111, 3));
        jLabel11.setText("Catatan");

        catatan.setColumns(20);
        catatan.setRows(5);
        catatan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 111, 3)));
        jScrollPane2.setViewportView(catatan);

        jPanelLog2.setBackground(new java.awt.Color(248, 111, 3));
        jPanelLog2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelLog2MouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 246, 244));
        jLabel12.setText("Submit");

        javax.swing.GroupLayout jPanelLog2Layout = new javax.swing.GroupLayout(jPanelLog2);
        jPanelLog2.setLayout(jPanelLog2Layout);
        jPanelLog2Layout.setHorizontalGroup(
            jPanelLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(jPanelLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLog2Layout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        jPanelLog2Layout.setVerticalGroup(
            jPanelLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanelLog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLog2Layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(total)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(32, 32, 32)
                        .addComponent(jPanelLog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelLog2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        MainTable.setFocusable(false);
        MainTable.setRowHeight(25);
        MainTable.setSelectionBackground(new java.awt.Color(248, 111, 3));
        MainTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        MainTable.getTableHeader().setReorderingAllowed(false);
        MainTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MainTable);

        hapus.setBackground(new java.awt.Color(255, 0, 51));
        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 246, 244));
        jLabel13.setText("Hapus");

        javax.swing.GroupLayout hapusLayout = new javax.swing.GroupLayout(hapus);
        hapus.setLayout(hapusLayout);
        hapusLayout.setHorizontalGroup(
            hapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
            .addGroup(hapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hapusLayout.createSequentialGroup()
                    .addGap(0, 27, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        hapusLayout.setVerticalGroup(
            hapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(hapusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(hapusLayout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    void loadTable(){
        tbl.addColumn("Nama Barang");
        tbl.addColumn("Harga Kulaan");
        tbl.addColumn("Stok Didapat");
        tbl.addColumn("Tanggal Kadaluarsa");
        MainTable.setModel(tbl);
    }
    void clear(){
        hargakul.setText("");
        stok.setText("");
    }
    void loadBarang(){
        DefaultComboBoxModel mdl = new DefaultComboBoxModel();
        try{
            String query = "select * from barang";
            ResultSet rs = dbConnection.getData(query);
            while(rs.next()){
                idBrg.add(rs.getInt("id"));
                mdl.addElement(rs.getString("nama") + " (" + rs.getString("kode") + ")");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString());
        }
        barang.setModel(mdl);
    }
    void Calculate(){
        DefaultTableModel tbl = (DefaultTableModel)MainTable.getModel();
        int har = 0;
        for(int i = 0; i < tbl.getRowCount(); i++){
            har += Integer.parseInt(tbl.getValueAt(i, 1).toString());
            total.setText(String.valueOf(har));
        }
    }
    private void hargakulKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hargakulKeyTyped
        char input = evt.getKeyChar();

        if(!Character.isDigit(input)){
            evt.consume();
        }
    }//GEN-LAST:event_hargakulKeyTyped
    boolean validateAdd(){
        if(hargakul.getText().equals("") || stok.getText().equals("") || exp.getDate().equals("")){
            JOptionPane.showMessageDialog(this, "Form Barang Wajib Diisi");
            return false;
        }
        
        if(stok.getText().equals("0")){
            JOptionPane.showMessageDialog(this, "Stok Tidak Boleh 0");
            return false;
        }
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date tglExp = exp.getDate();
        Calendar currentDate = Calendar.getInstance();
        Date tglNow = currentDate.getTime();
        if(tglExp.before(tglNow)){
            JOptionPane.showMessageDialog(this, "Tanggal Kadaluarsa Tidak Boleh Kurang Dari Tanggal Saat Ini");
            return false;
        }
        
        return true;
    }
    boolean CheckBar(){
        for(int i = 0; i < id.size(); i++){
            if(idBrg.get(barang.getSelectedIndex()) == id.get(i)){
                tbl.setValueAt(hargakul.getText(), i, 1);
                tbl.setValueAt(stok.getText(), i, 2);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date tgl = exp.getDate();
                String ex = sdf.format(tgl);
                tbl.setValueAt(ex, i, 3);
                Calculate();
                clear();
                return false;
            }
        }
        return true;
    }
    private void jPanelLog1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLog1MouseClicked
        if(validateAdd()){
            if(CheckBar()){
                id.add(idBrg.get(barang.getSelectedIndex()));
                String bar = barang.getSelectedItem().toString();
                String har = hargakul.getText();
                String stk = stok.getText();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date tgl = exp.getDate();
                String ex = sdf.format(tgl);
                tbl.addRow(new Object[]{bar,har,stk,ex});
                clear();
                Calculate();
            }
        }
    }//GEN-LAST:event_jPanelLog1MouseClicked

    private void stokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stokKeyTyped
        char input = evt.getKeyChar();

        if(!Character.isDigit(input)){
            evt.consume();
        }
    }//GEN-LAST:event_stokKeyTyped

    private void jPanelLog2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelLog2MouseClicked
        if(MainTable.getRowCount() > 0){
            try{
                
                LocalDateTime currentDate = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String tgl = currentDate.format(formatter);
                int tl = Integer.parseInt(total.getText());
                String ct = catatan.getText();
                String kulIn = "insert into kulaan(tanggal,total,catatan) values('"+ tgl +"', "+ tl +", '"+ ct +"')";
                Statement stkulIn = dbConnection.getConn().createStatement();
                stkulIn.executeUpdate(kulIn);
                stkulIn.close();
                
                String getId = "select id from kulaan order by id desc limit 1";
                ResultSet rs = dbConnection.getData(getId);
                rs.next();
                int idKul = rs.getInt("id");
                
                DefaultTableModel tbl = (DefaultTableModel)MainTable.getModel();
                for(int i = 0; i < MainTable.getRowCount(); i++){
                    String detKulIn = "insert into detail_kulaan(id_barang, hargaKulaan, stokDidapat, tgl_exp, id_kulaan) values("+ id.get(i) +", "+ tbl.getValueAt(i, 1) +", "+ tbl.getValueAt(i, 2) +", '"+ tbl.getValueAt(i, 3)+"', "+ idKul +")";
                    Statement stDetIn = dbConnection.getConn().createStatement();
                    stDetIn.executeUpdate(detKulIn);
                    stDetIn.close();
                    
//                    String upStok = "update barang set stok = stok + "+ tbl.getValueAt(i, 2) +" where id = "+ id.get(i) +"";
//                    Statement stUp = dbConnection.getConn().createStatement();
//                    stUp.executeUpdate(upStok);
//                    stUp.close();
                }
                
                JOptionPane.showMessageDialog(this, "Kulakan Berhasil Didata");
                tbl.setRowCount(0);
                id.clear();
                total.setText("");
                catatan.setText("");
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e.toString());
            }
        }else{
            JOptionPane.showMessageDialog(this, "Silahkan Isi Barang Kulaan Terlebih Dahulu");
        }
    }//GEN-LAST:event_jPanelLog2MouseClicked

    private void MainTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainTableMouseClicked
        
            System.out.println(MainTable.getSelectedRow());
    }//GEN-LAST:event_MainTableMouseClicked

    private void hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseClicked
        if(MainTable.getSelectedRow() >= 0){
            id.remove(MainTable.getSelectedRow());
            tbl.removeRow(MainTable.getSelectedRow());
        }
    }//GEN-LAST:event_hapusMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTable MainTable;
    private javax.swing.JComboBox<String> barang;
    private javax.swing.JTextArea catatan;
    private com.toedter.calendar.JDateChooser exp;
    private javax.swing.JPanel hapus;
    private javax.swing.JTextField hargakul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLog1;
    private javax.swing.JPanel jPanelLog2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField stok;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
