/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bookshop;

import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HENDEMOGLU
 */
public class Users extends javax.swing.JFrame {

    /**
     * Creates new form Users
     */
  public Users() {// Users sınıfının constructor'ı
        initComponents();
        DisplayUsers();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        UnameTb = new javax.swing.JTextField();
        PhoneTb = new javax.swing.JTextField();
        UIdTb = new javax.swing.JTextField();
        PasswordTb = new javax.swing.JTextField();
        AddressTb = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        LogoutLbl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        SaveBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdb_books = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel5.setText("Bookstore Automation");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(242, 86, 19));
        jLabel15.setText("x");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(521, 521, 521)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Id");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Address");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Password");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setText("Phone");

        UnameTb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        UnameTb.setForeground(new java.awt.Color(242, 86, 19));

        PhoneTb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PhoneTb.setForeground(new java.awt.Color(242, 86, 19));

        UIdTb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        UIdTb.setForeground(new java.awt.Color(242, 86, 19));

        PasswordTb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PasswordTb.setForeground(new java.awt.Color(242, 86, 19));

        AddressTb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        AddressTb.setForeground(new java.awt.Color(242, 86, 19));

        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Phone", "Address", "Password"
            }
        ));
        UsersTable.setRowHeight(25);
        UsersTable.setSelectionBackground(new java.awt.Color(242, 86, 19));
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsersTable);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Users List");

        LogoutLbl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        LogoutLbl.setForeground(new java.awt.Color(204, 0, 51));
        LogoutLbl.setText("Back");
        LogoutLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLblMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        SaveBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        ResetBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ResetBtn))
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("<<      >>");

        rdb_books.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        rdb_books.setText("Books");
        rdb_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdb_booksMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(14, 14, 14))
                    .addComponent(rdb_books, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(rdb_books)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(UIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UnameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddressTb, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(69, 69, 69)))
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogoutLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(625, 625, 625)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(593, 593, 593)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UnameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddressTb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(UIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(LogoutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    private void DisplayUsers() {// Kullanıcıları görüntüleme işlemini gerçekleştiren metod
      
        try {
             // Veritabanına bağlanma ve kullanıcıları getirmek için yazılan kod 
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_table?user=root&password=fsmvu");
            St = Con.createStatement();
            Rs = St.executeQuery("SELECT * FROM user");

            // Tabloya sütunları ekleyen bir model oluştur
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Id");
            model.addColumn("Name");
            model.addColumn("Phone");
            model.addColumn("Address");
            model.addColumn("Password");

            // Veritabanındaki kullanıcıları oku ve modele ekle
            while (Rs.next()) {
                 model.addRow(new Object[]{
                    Rs.getInt("UId"),
                    Rs.getString("UName"),
                    Rs.getString("UPhone"),
                    Rs.getString("UAddress"),
                    Rs.getString("UPassword")
                });
            }

            UsersTable.setModel(model);// Tabloya modeli set et

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void Reset() {// Giriş alanlarını sıfırlayan metod
        UnameTb.setText("");
        UIdTb.setText("");
        PhoneTb.setText("");
        PasswordTb.setText("");
        AddressTb.setText("");
    }
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        // Kullanıcı adı format kontrolü
        Pattern pattern = Pattern.compile("^[A-Z][a-z]*$");
        Matcher matcher = pattern.matcher(UnameTb.getText());
        if (!matcher.find()) {
            JOptionPane.showMessageDialog(this, "Please start your name with a capital letter and do not use numbers!", "username format is invalid!", HEIGHT);
            return; 
        }
        // Şifre format kontrolü
        pattern = Pattern.compile("^(?=(?:[^0-9]*[0-9]){3,})(?!.*[;]).*$");
        matcher = pattern.matcher(PasswordTb.getText());
        if (!matcher.find()) {
            JOptionPane.showMessageDialog(this, "Please use at least 3 numbers in your password, do not use symbols such as periods or commas.!");
            return;
        }
        
        // Giriş alanlarını değişkenlere atama
        String id = UIdTb.getText();
        String naem = UnameTb.getText();
        String phone = PhoneTb.getText();
        String address = AddressTb.getText();
        String password = PasswordTb.getText();

        // Eksik bilgi kontrolü
        if (UnameTb.getText().isEmpty() || UIdTb.getText().isEmpty() || PhoneTb.getText().isEmpty() || AddressTb.getText().isEmpty() || PasswordTb.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Missing information");

        } else {
            try {
                // Veritabanına bağlanma ve kullanıcı eklemek için yazılan kod 
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_table?user=root&password=fsmvu");  // mysql tarafına bakılması lazım!!!!!
                PreparedStatement add = Con.prepareStatement("INSERT INTO user VALUES(?,?,?,?,?)");
                add.setInt(1, Integer.valueOf(UIdTb.getText()));
                add.setString(2, UnameTb.getText());
                add.setString(3, PhoneTb.getText());
                add.setString(4, AddressTb.getText());
                add.setString(5, PasswordTb.getText());
                
                
                int row = add.executeUpdate();// Kullanıcıyı ekleyip bilgi mesajı göster

                JOptionPane.showMessageDialog(this, "User Saved");

                // Eklenen kullanıcıyı tabloda görüntüleme ve giriş alanlarını sıfırlama
                DisplayUsers();
                Reset();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_SaveBtnMouseClicked

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        Reset();
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void LogoutLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLblMouseClicked
        new Login().setVisible(true);//Login sınıfına geçip ekranı kapatma
        this.dispose();
    }//GEN-LAST:event_LogoutLblMouseClicked

    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
        // Seçilen satırdaki kullanıcı bilgilerini giriş alanlarına set etme
        DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();
        int MyIndex = UsersTable.getSelectedRow();
        UIdTb.setText(model.getValueAt(MyIndex, 0).toString());
        UnameTb.setText(model.getValueAt(MyIndex, 1).toString());
        PhoneTb.setText(model.getValueAt(MyIndex, 2).toString());
        AddressTb.setText(model.getValueAt(MyIndex, 3).toString());
        PasswordTb.setText(model.getValueAt(MyIndex, 4).toString());

    }//GEN-LAST:event_UsersTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        // Kullanıcı ID'si boşsa uyarı verme
        if (UIdTb.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Missing information");
    } else {
        try {
            // Veritabanına bağlanma ve kullanıcıyı silmek için yapılan kod 
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_table?user=root&password=fsmvu");
            String UId = UIdTb.getText();
            String query = "DELETE FROM user WHERE UId=" + UId;
            Statement Delete = Con.createStatement();
            Delete.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "User Deleted");

            // Güncelleme işlemi
            updateUserId();

             // Silinen kullanıcıyı tabloda görüntüle, giriş alanlarını sıfırla
            DisplayUsers();
            Reset();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

private void updateUserId() {// Kullanıcı ID'sini güncelleme işlemi
    try {
        // Tüm kullanıcıları alma
        ResultSet allUsers = St.executeQuery("SELECT * FROM user");

        // Silinen kullanıcının ID'sini alma
        int deletedUserId = Integer.parseInt(UIdTb.getText());

        // Silinen kullanıcıdan sonraki kullanıcıların ID'lerini güncelleme
        while (allUsers.next()) {
            int currentUserId = allUsers.getInt("UId");
            if (currentUserId > deletedUserId) {
                // Güncelleme SQL sorgusu
                String updateQuery = "UPDATE user SET UId = ? WHERE UId = ?";
                PreparedStatement updateStatement = Con.prepareStatement(updateQuery);
                updateStatement.setInt(1, currentUserId - 1);
                updateStatement.setInt(2, currentUserId);
                updateStatement.executeUpdate();
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        System.exit(0);//Sistemden çıkmak için yazılan kod 
    }//GEN-LAST:event_jLabel15MouseClicked

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
       

    }//GEN-LAST:event_SaveBtnActionPerformed

    private void rdb_booksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdb_booksMouseClicked
        // TODO add your handling code here:
        new Books().setVisible(true);//Books sınıfına geçip ekranı kapatma
        this.dispose();
    }//GEN-LAST:event_rdb_booksMouseClicked

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
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel LogoutLbl;
    private javax.swing.JTextField PasswordTb;
    private javax.swing.JTextField PhoneTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JTextField UIdTb;
    private javax.swing.JTextField UnameTb;
    private javax.swing.JTable UsersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdb_books;
    // End of variables declaration//GEN-END:variables
}
