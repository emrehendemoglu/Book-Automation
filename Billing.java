/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bookshop;

import java.sql.ClientInfoStatus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HENDEMOGLU
 */
public class Billing extends javax.swing.JFrame {

    public Billing() {
        initComponents();

    }
   
    // Kullanıcı bilgisiyle Billing penceresini başlatmak için kullanılan constructor
    public Billing(String UN) {

        initComponents();
        UserLbl.setText(UN);// Kullanıcı adı etiketini ayarla
        DisplayBooks();// Mevcut kitapları göster
        BooknameTb.setEditable(false);
        PrıceTb.setEditable(false);
        
    }
      // Billing penceresini kapatmak için kullanılan metod
      public void closeBillingFrame() {
        this.dispose();}// Billing penceresini kapat

    // Veritabanı bağlantısı ve kitapları tabloda gösterme  
    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;

    private void DisplayBooks() {

        try {
            // Veritabanı bağlantısını kurma
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_table?user=root&password=fsmvu");
            St = Con.createStatement();
            Rs = St.executeQuery("Select * from book_table");

             // Kitapları göstermek için bir tablo modeli oluşturma
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("BId");
            model.addColumn("Title");
            model.addColumn("Author");
            model.addColumn("Category");
            model.addColumn("Quantity");
            model.addColumn("Price");

            // Tablo modelini kitap verisiyle doldurma
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getInt("BId"), Rs.getString("Title"),
                    Rs.getString("Author"), Rs.getString("Category"),
                    Rs.getInt("Quantity"), Rs.getInt("Price")});
            }

            // Modeli BooksTable'a ayarla
            BooksTable.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();// Bir istisna durumunda stack trace'i yazdır
        }
    }
      // soldBooksFrame'e referansı tutan özellik  
      private booksSold soldBooksFrame;
   
    // Kullanıcı bilgisi ve Books penceresine referansla Billing penceresini başlatmak için kullanılan constructor  
    public Billing(String UN, Books booksFrame) {
     initComponents();
        this.soldBooksFrame = soldBooksFrame;// Referansı soldBooksFrame özelliğine ata
        UserLbl.setText(UN);// Kullanıcı adı etiketini ayarla
        DisplayBooks();// Mevcut kitapları göster
        BooknameTb.setEditable(false);
        PrıceTb.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        bckBsld_Item = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        UserLbl = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        LogoutLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_evaluate = new javax.swing.JLabel();
        CB1 = new javax.swing.JCheckBox();
        CB2 = new javax.swing.JCheckBox();
        CB3 = new javax.swing.JCheckBox();
        CB4 = new javax.swing.JCheckBox();
        CB5 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        BooknameTb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PrıceTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        QtyTb = new javax.swing.JTextField();
        AddToBillBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPopupMenu1.setComponentPopupMenu(jPopupMenu1);

        bckBsld_Item.setText("backBill");
        bckBsld_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckBsld_ItemActionPerformed(evt);
            }
        });
        jPopupMenu1.add(bckBsld_Item);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(540, 540, 540)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        UserLbl.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        UserLbl.setText("Users");
        UserLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserLblMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setText("Book List");

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
                "Bıd", "Tıtle", "Author", "Category", "Quantity", "Prıce"
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

        BillTxt.setColumns(20);
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("Book Bill");

        LogoutLbl.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        LogoutLbl.setForeground(new java.awt.Color(255, 0, 51));
        LogoutLbl.setText("Back");
        LogoutLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutLblMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("USERS >>");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("<<     >>");

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        lbl_evaluate.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        lbl_evaluate.setText("How Many of the Books Have You Read?");

        CB1.setText("1");
        CB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB1ActionPerformed(evt);
            }
        });

        CB2.setText("2");
        CB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB2ActionPerformed(evt);
            }
        });

        CB3.setText("3");
        CB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB3ActionPerformed(evt);
            }
        });

        CB4.setText("4");
        CB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB4ActionPerformed(evt);
            }
        });

        CB5.setText("4+");
        CB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(CB1)
                        .addGap(18, 18, 18)
                        .addComponent(CB2)
                        .addGap(18, 18, 18)
                        .addComponent(CB3)
                        .addGap(18, 18, 18)
                        .addComponent(CB4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_evaluate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_evaluate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB5)
                    .addComponent(CB4)
                    .addComponent(CB3)
                    .addComponent(CB2)
                    .addComponent(CB1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setText("How about a few questions? =>");

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton1.setText("Of Courseee");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("Book Name");

        BooknameTb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BooknameTb.setForeground(new java.awt.Color(242, 86, 19));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("Price");

        PrıceTb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        PrıceTb.setForeground(new java.awt.Color(242, 86, 19));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel6.setText("Quantity");

        QtyTb.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        QtyTb.setForeground(new java.awt.Color(242, 86, 19));

        AddToBillBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        AddToBillBtn.setText("Add To Bill");
        AddToBillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBillBtnMouseClicked(evt);
            }
        });
        AddToBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToBillBtnActionPerformed(evt);
            }
        });

        ResetBtn.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(AddToBillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BooknameTb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(PrıceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BooknameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrıceTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddToBillBtn)
                    .addComponent(ResetBtn))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(269, 269, 269))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LogoutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(LogoutLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked
    // Formu sıfırlamak için kullanılan metod
    private void Reset() {
        BooknameTb.setText("");
        PrıceTb.setText("");
        QtyTb.setText("");
        BillTxt.setText("");
        i = 0;

    }
    int BId;// Güncellenecek kitabın kimliğini tutan değişken

    // Kitabı güncellemek için kullanılan metod
    private void UpdateBook() {
            // Yeni miktarı hesapla
            int newQty = Stock - Integer.valueOf(QtyTb.getText());
    try {
         // Veritabanına bağlan
        Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_table?user=root&password=fsmvu");
        String query = "Update book_table set Quantity =" + newQty + " where BId=" + BId;
        Statement Update = Con.createStatement();
        Update.executeUpdate(query);
        JOptionPane.showMessageDialog(this, "Book Updated");

        // Tabloyu güncelleme
        DefaultTableModel model = (DefaultTableModel) BooksTable.getModel();
        int selectedRow = BooksTable.getSelectedRow();
        model.setValueAt(newQty, selectedRow, 4);

        DisplayBooks(); // Kitapları tekrar gösterme
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    int i = 0, Total = 0;// Değişkenlerim 
    private void AddToBillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBillBtnMouseClicked
          // Kitap ve miktar bilgilerini kontrol eden kısım
          if (QtyTb.getText().isEmpty() || BooknameTb.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Missing Information");
    } else if (Integer.valueOf(QtyTb.getText()) > Stock) {
        JOptionPane.showMessageDialog(this, "Not Enough Books In Stock");
    } else {
        // Tablodan seçilen satırı al
        DefaultTableModel model = (DefaultTableModel) BooksTable.getModel();
        int selectedRow = BooksTable.getSelectedRow();

        if (selectedRow != -1) {
            // Seçilen kitabın adını, fiyatını ve miktarını alma
            String bookName = model.getValueAt(selectedRow, 1).toString();
            String price = model.getValueAt(selectedRow, 5).toString();
            int quantity = Integer.parseInt(QtyTb.getText());
            int total = Integer.parseInt(price) * quantity;

            //Fatura başlığını oluşturma
            if (i == 0) {
                BillTxt.setText("************ BOOK SHOP **************\n"
                        + " Product     Price     Quantity     Total\n");
                i = 1;
            }
            // Faturaya satır ekleme
            BillTxt.append(String.format("%-11s%-9s%-11d%-6d\n", bookName, price, quantity, total));
            Total += total;
            BillTxt.append("\nTotal: " + Total + "\n");

            UpdateBook();// Kitabı güncelleme

            // booksSold sınıfından bir örnek oluşturup, onu kullanarak metodu çağırıyoruz.
            booksSold soldBooksFrame = new booksSold();
            soldBooksFrame.appendToBooksSoldTxt(BillTxt.getText());
            soldBooksFrame.setBillingFrame(this); // Billing sınıfını set etme
            soldBooksFrame.setVisible(true); // booksSold penceresini görünür yapma

            // Billing sınıfını kapat
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a book from the list.");
        }
    }

    }//GEN-LAST:event_AddToBillBtnMouseClicked

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        Reset();//Reset metodunu çağırma 
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void UserLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLblMouseClicked
        new Users().setVisible(true);//Users sınıfına geçip ekranı kapatma 
        this.dispose();
    }//GEN-LAST:event_UserLblMouseClicked
    int Stock = 0;
    private void BooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksTableMouseClicked
        // Tablo modelini al ve seçili satırın indisini alma
        DefaultTableModel model = (DefaultTableModel) BooksTable.getModel();
        int MyIndex = BooksTable.getSelectedRow();
        
        // Seçili satırların  bilgilerini almak için yazılan kod 
        BId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        BooknameTb.setText(model.getValueAt(MyIndex, 1).toString());
        Stock = Integer.valueOf(model.getValueAt(MyIndex, 4).toString());
        PrıceTb.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_BooksTableMouseClicked

    private void LogoutLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutLblMouseClicked
        new Login().setVisible(true);//Login sınıfına geçip ekranı kapatma
        this.dispose();
    }//GEN-LAST:event_LogoutLblMouseClicked

    private void CB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB1ActionPerformed
        if (CB1.isSelected()) // CB1 seçili ise diğerleri seçili değil yapmak için yazılan kod 
            CB2.setSelected(false);
            CB3.setSelected(false);
            CB4.setSelected(false);
            CB5.setSelected(false);
    }//GEN-LAST:event_CB1ActionPerformed

    private void CB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB2ActionPerformed
               if (CB2.isSelected()) // CB2 seçili ise diğerleri seçili değil yapmak için yazılan kod 
            CB1.setSelected(false);
            CB3.setSelected(false);
            CB4.setSelected(false);
            CB5.setSelected(false);
    }//GEN-LAST:event_CB2ActionPerformed

    private void CB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB3ActionPerformed
                if (CB3.isSelected()) // CB3 seçili ise diğerleri seçili değil yapmak için yazılan kod 
            CB2.setSelected(false);
            CB1.setSelected(false);
            CB4.setSelected(false);
            CB5.setSelected(false);
    }//GEN-LAST:event_CB3ActionPerformed

    private void CB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB4ActionPerformed
                 if (CB4.isSelected()) // CB4 seçili ise diğerleri seçili değil yapmak için yazılan kod 
            CB2.setSelected(false);
            CB3.setSelected(false);
            CB1.setSelected(false);
            CB5.setSelected(false);
    }//GEN-LAST:event_CB4ActionPerformed

    private void CB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB5ActionPerformed
                if (CB5.isSelected()) // CB5 seçili ise diğerleri seçili değil yapmak için yazılan kod 
            CB2.setSelected(false);
            CB3.setSelected(false);
            CB4.setSelected(false);
            CB1.setSelected(false);
    }//GEN-LAST:event_CB5ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new Evaluation().setVisible(true);//Evaluation sınıfına geçip ekranı kapatma
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void AddToBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBillBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToBillBtnActionPerformed

    private void bckBsld_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckBsld_ItemActionPerformed
        // TODO add your handling code here:
        new booksSold().setVisible(true);//booksSold sınıfına geçip ekranı kapatma
        this.dispose();
    }//GEN-LAST:event_bckBsld_ItemActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing("harun").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToBillBtn;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JTextField BooknameTb;
    private javax.swing.JTable BooksTable;
    private javax.swing.JCheckBox CB1;
    private javax.swing.JCheckBox CB2;
    private javax.swing.JCheckBox CB3;
    private javax.swing.JCheckBox CB4;
    private javax.swing.JCheckBox CB5;
    private javax.swing.JLabel LogoutLbl;
    private javax.swing.JTextField PrıceTb;
    private javax.swing.JTextField QtyTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel UserLbl;
    private javax.swing.JMenuItem bckBsld_Item;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_evaluate;
    // End of variables declaration//GEN-END:variables
}
