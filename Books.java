/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bookshop;

import static java.awt.AWTEventMulticaster.add;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author HENDEMOGLU
 */
public class Books extends javax.swing.JFrame {

    // Books sınıfının constructor'ı
    public Books() {
        initComponents();
        DisplayBooks();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        NameTb = new javax.swing.JTextField();
        AuthorTb = new javax.swing.JTextField();
        BookIdTb = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        PriceTb = new javax.swing.JTextField();
        QuantityTb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CatCb = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        LogoutLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        rdb_users = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        DeleteBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 255));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(629, 629, 629)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Quantity");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Price");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setText("Categories");

        NameTb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        NameTb.setForeground(new java.awt.Color(242, 86, 19));

        AuthorTb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        AuthorTb.setForeground(new java.awt.Color(242, 86, 19));

        BookIdTb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BookIdTb.setForeground(new java.awt.Color(242, 86, 19));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Book List");

        PriceTb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PriceTb.setForeground(new java.awt.Color(242, 86, 19));

        QuantityTb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        QuantityTb.setForeground(new java.awt.Color(242, 86, 19));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Id");

        CatCb.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CatCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comedy", "Science", "Romantic", "Engineer" }));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel14.setText("Author");

        LogoutLbl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        LogoutLbl.setForeground(new java.awt.Color(204, 0, 0));
        LogoutLbl.setText("Back");
        LogoutLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLblMouseClicked(evt);
            }
        });

        BooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "BId", "Title", "Author", "Category", "Quantity", "Prıce"
            }
        ));
        BooksTable.setRowHeight(28);
        BooksTable.setSelectionBackground(new java.awt.Color(242, 86, 19));
        BooksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BooksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BooksTable);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        rdb_users.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rdb_users.setText("Users");
        rdb_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdb_usersMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("<<     >>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rdb_users, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(rdb_users)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        DeleteBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        ResetBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        SaveBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ResetBtn)
                    .addComponent(EditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel8)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel7)
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(AuthorTb, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(149, 149, 149)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(151, 151, 151)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(QuantityTb, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(70, 86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(LogoutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(242, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(690, 690, 690)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(658, 658, 658)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(BookIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(NameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1170, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AuthorTb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CatCb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QuantityTb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LogoutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(251, 251, 251)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(NameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BookIdTb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(382, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        System.exit(0);//Ekranı kapatmak için yazılan kod 
    }//GEN-LAST:event_jLabel15MouseClicked
    // Veritabanı bağlantısı için değişkenler
    Connection Con = null;//Bağlantı kurmak için 
    Statement St = null;
    ResultSet Rs = null;

    // Veritabanından kitapları görüntülemek için kullanılan metod
    private void DisplayBooks() {
        try {
             // Veritabanına bağlanma
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_table?user=root&password=fsmvu");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from book_table");

            // Tablo modeli oluşturma
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("BId");
            model.addColumn("Title");
            model.addColumn("Author");
            model.addColumn("Category");
            model.addColumn("Quantity");
            model.addColumn("Price");

            while (Rs.next()) {// Kitapları tabloya ekleme
                model.addRow(new Object[]{Rs.getInt("BId"), Rs.getString("Title"),
                    Rs.getString("Author"), Rs.getString("Category"),
                    Rs.getInt("Quantity"), Rs.getInt("Price")});
            }

            BooksTable.setModel(model);// Tablo modelini BooksTable'a ayarla
        } catch (Exception e) {
            e.printStackTrace(); // Hata durumunda stack trace'i yazdır
        }
    }
    // Giriş alanlarını sıfırlamak için kullanılan metod
    private void Reset() {
        BookIdTb.setText("");
        NameTb.setText("");
        AuthorTb.setText("");
        PriceTb.setText("");
        QuantityTb.setText("");
        CatCb.setSelectedIndex(0);

    }
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
      // name için regex kontrolü
        Pattern namePattern = Pattern.compile("^[A-Z][a-z]*$");
        Matcher nameMatcher = namePattern.matcher(NameTb.getText());

// Author için regex kontrolü
        Pattern authorPattern = Pattern.compile("^[A-Z][a-z]*$");
        Matcher authorMatcher = authorPattern.matcher(AuthorTb.getText());
        
        

// Name kontrolü regexler doğru mu diye 
        if (!nameMatcher.find()) {
            JOptionPane.showMessageDialog(this, "Name should start with a capital letter and should not contain numbers!", "Invalid Name Format", JOptionPane.ERROR_MESSAGE);
            return;
        }

// Author kontrolü regexler doğru mu diye 
        if (!authorMatcher.find()) {
            JOptionPane.showMessageDialog(this, "Author should start with a capital letter and should not contain numbers!", "Invalid Author Format", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (BookIdTb.getText().isEmpty() || NameTb.getText().isEmpty() || AuthorTb.getText().isEmpty()
                || CatCb.getSelectedIndex() == -1 || QuantityTb.getText().isEmpty() || PriceTb.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Missing information");

        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_table?user=root&password=fsmvu");
                PreparedStatement add = Con.prepareStatement("insert into book_table values(?,?,?,?,?,?)");
                add.setInt(1, Integer.valueOf(BookIdTb.getText()));
                add.setString(2, NameTb.getText());
                add.setString(3, AuthorTb.getText());
                add.setString(4, CatCb.getSelectedItem().toString());
                add.setInt(5, Integer.valueOf(QuantityTb.getText()));
                add.setInt(6, Integer.valueOf(PriceTb.getText()));
               
                // Veritabanına kitabı ekleme ve kaydedilen satır sayısını alma
                int row = add.executeUpdate();

                JOptionPane.showMessageDialog(this, "Book Saved");

                // BooksTable'da güncel veriyi görüntüle
                DisplayBooks();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        BookIdTb.setEnabled(false);// BookIdTb'nin etkileşimini devre dışı bırakma
    }//GEN-LAST:event_SaveBtnMouseClicked

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        Reset();
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if (BookIdTb.getText().isEmpty()) {// Kitap ID'si eksikse uyarı mesajı gösterme 
            JOptionPane.showMessageDialog(this, "Missing information");
        } else {
            try {
                // Veritabanına bağlanma ve kitabı silmek için yapılan kod.
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_table?user=root&password=fsmvu");
                String BId = BookIdTb.getText();
                String query = "DELETE FROM book_table WHERE BId=" + BId;
                Statement Delete = Con.createStatement();
                Delete.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Book Deleted");

                // Kitap ID'sini güncelle
                updateBookId();

                DisplayBooks();// Güncel veriyi BooksTable'da görüntüle
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    // Kitap ID'sini güncellemek için kullanılan metod
    private void updateBookId() {
        try {
            // Tüm kitapları alma
            ResultSet allBooks = St.executeQuery("SELECT * FROM book_table");

            // Silinen kitabın ID'sini alma
            int deletedBookId = Integer.parseInt(BookIdTb.getText());

            // Silinen kitaptan sonraki kitapların ID'lerini güncelleme
            while (allBooks.next()) {
                int currentBookId = allBooks.getInt("BId");
                if (currentBookId > deletedBookId) {
                    // Güncelleme SQL sorgusu
                    String updateQuery = "UPDATE book_table SET BId = ? WHERE BId = ?";
                    PreparedStatement updateStatement = Con.prepareStatement(updateQuery);
                    updateStatement.setInt(1, currentBookId - 1);
                    updateStatement.setInt(2, currentBookId);
                    updateStatement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void LogoutLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLblMouseClicked
        new Login().setVisible(true);//Login sınıfına geçip ekranı kapatma
        this.dispose();
    }//GEN-LAST:event_LogoutLblMouseClicked

    private void BooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksTableMouseClicked
        // BooksTable'dan seçilen satırın bilgilerini alma ve giriş alanlarına yerleştirme
        DefaultTableModel model = (DefaultTableModel) BooksTable.getModel();
        int MyIndex = BooksTable.getSelectedRow();
        
        // Seçili satırların  bilgilerini almak için yazılan kod 
        BookIdTb.setText(model.getValueAt(MyIndex, 0).toString());
        NameTb.setText(model.getValueAt(MyIndex, 1).toString());
        AuthorTb.setText(model.getValueAt(MyIndex, 2).toString());
        CatCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
        QuantityTb.setText(model.getValueAt(MyIndex, 4).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_BooksTableMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        // Eksik bilgi kontrolü
        if (BookIdTb.getText().isEmpty() || NameTb.getText().isEmpty() || AuthorTb.getText().isEmpty()
                || CatCb.getSelectedIndex() == -1 || QuantityTb.getText().isEmpty() || PriceTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing information");
        } else {
            try {
                // Veritabanına bağlanma ve kitabı güncellemek için yazılan kod 
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_table?user=root&password=fsmvu");
                String BId = BookIdTb.getText();
                String query = "Update book_table set Tıtle=?, Author=?, Category=?, Quantity=?, Price=? where BId=?";
                PreparedStatement update = Con.prepareStatement(query);

                // Parametreleri set etmek için yazılan kod
                update.setString(1, NameTb.getText());
                update.setString(2, AuthorTb.getText());
                update.setString(3, CatCb.getSelectedItem().toString());
                update.setInt(4, Integer.parseInt(QuantityTb.getText()));
                update.setInt(5, Integer.parseInt(PriceTb.getText()));
                update.setInt(6, Integer.parseInt(BId));

                int row = update.executeUpdate();// Güncelleme işlemini gerçekleştir

                if (row > 0) {
                    JOptionPane.showMessageDialog(this, "Book Updated");

                    DisplayBooks();// Güncel veriyi görüntüleme

                    Reset();// Giriş alanlarını sıfırlama
                } else {
                    JOptionPane.showMessageDialog(this, "Update failed");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void rdb_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdb_usersMouseClicked
        // TODO add your handling code here:
        new Users().setVisible(true);//Users sınıfına geçip ekranı kapatma
        this.dispose();
    }//GEN-LAST:event_rdb_usersMouseClicked

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
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AuthorTb;
    private javax.swing.JTextField BookIdTb;
    private javax.swing.JTable BooksTable;
    private javax.swing.JComboBox<String> CatCb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel LogoutLbl;
    private javax.swing.JTextField NameTb;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JTextField QuantityTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdb_users;
    // End of variables declaration//GEN-END:variables
}
