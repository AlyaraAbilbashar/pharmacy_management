/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author alyar
 */
public class Customers extends javax.swing.JFrame {
    Connection con = null;
    Statement st = null, st1 = null;
    ResultSet rs = null, rs1 = null;
    /**
     * Creates new form Company
     */
    public Customers() {
        initComponents();
        SelectMed();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        c_id = new javax.swing.JTextField();
        c_firstName = new javax.swing.JTextField();
        c_lastName = new javax.swing.JTextField();
        c_age = new javax.swing.JTextField();
        c_gender = new javax.swing.JTextField();
        c_add = new javax.swing.JButton();
        c_delete = new javax.swing.JButton();
        c_update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cust_table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        c_address = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        c_emailAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(198, 209, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(15, 27, 7));
        jLabel5.setText("MANAGE CUSTOMERS' INFORMATION");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(92, 130, 26));
        jLabel6.setText("ID");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(15, 27, 7));
        jLabel7.setText("FIRST NAME");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(15, 27, 7));
        jLabel8.setText("GENDER");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(92, 130, 26));
        jLabel9.setText("LAST NAME");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(92, 130, 26));
        jLabel10.setText("AGE");

        c_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_idActionPerformed(evt);
            }
        });

        c_firstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_firstNameActionPerformed(evt);
            }
        });

        c_lastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_lastNameActionPerformed(evt);
            }
        });

        c_age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_ageActionPerformed(evt);
            }
        });

        c_gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_genderActionPerformed(evt);
            }
        });

        c_add.setBackground(new java.awt.Color(255, 255, 255));
        c_add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        c_add.setForeground(new java.awt.Color(15, 27, 7));
        c_add.setText("ADD");
        c_add.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(198, 209, 102), null));
        c_add.setContentAreaFilled(false);
        c_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_addMouseClicked(evt);
            }
        });
        c_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_addActionPerformed(evt);
            }
        });

        c_delete.setBackground(new java.awt.Color(255, 255, 255));
        c_delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        c_delete.setForeground(new java.awt.Color(15, 27, 7));
        c_delete.setText("DELETE");
        c_delete.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(198, 209, 102), null));
        c_delete.setContentAreaFilled(false);
        c_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_deleteMouseClicked(evt);
            }
        });
        c_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_deleteActionPerformed(evt);
            }
        });

        c_update.setBackground(new java.awt.Color(255, 255, 255));
        c_update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        c_update.setForeground(new java.awt.Color(15, 27, 7));
        c_update.setText("UPDATE");
        c_update.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(198, 209, 102), null));
        c_update.setContentAreaFilled(false);
        c_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_updateMouseClicked(evt);
            }
        });
        c_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_updateActionPerformed(evt);
            }
        });

        cust_table.setForeground(new java.awt.Color(15, 27, 7));
        cust_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CUST_ID", "FIRST_NAME", "LAST_NAME", "GENDER", "AGE", "ADDRESS", "CUST_EMAIL", "CUST_PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        cust_table.setSelectionBackground(new java.awt.Color(92, 130, 26));
        cust_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cust_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cust_table);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(92, 130, 26));
        jLabel11.setText("CUSTOMERS LIST");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(15, 27, 7));
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(15, 27, 7));
        jLabel13.setText("ADDRESS");

        c_address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_addressActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(92, 130, 26));
        jLabel14.setText("EMAIL ADDRESS");

        c_emailAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        c_emailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_emailAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_id)
                    .addComponent(c_lastName)
                    .addComponent(c_gender)
                    .addComponent(c_age)
                    .addComponent(c_address)
                    .addComponent(c_firstName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(c_update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(c_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addComponent(c_emailAddress))
                .addGap(66, 66, 66))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(c_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(c_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(c_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(92, 130, 26));
        jLabel2.setText("Pharmacists");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(92, 130, 26));
        jLabel3.setText("Sells");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(92, 130, 26));
        jLabel4.setText("Medicines");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void SelectMed(){
        try{
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:pharmacy", "system", "password");
            st = con.createStatement();
            rs = st.executeQuery("Select * from SYSTEM.CUSTOMER");
            cust_table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    private void c_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_idActionPerformed

    private void c_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_firstNameActionPerformed

    private void c_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_lastNameActionPerformed

    private void c_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_ageActionPerformed

    private void c_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_genderActionPerformed

    private void c_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_addActionPerformed

    private void c_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_deleteActionPerformed

    private void c_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_updateActionPerformed

    private void c_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_addressActionPerformed

    private void c_emailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_emailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_emailAddressActionPerformed

    private void c_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_addMouseClicked
        // TODO add your handling code here:
        try{
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:pharmacy", "system", "password");
            PreparedStatement add = con.prepareStatement("insert into CUSTOMER(FIRST_NAME, LAST_NAME, GENDER, AGE, ADDRESS, CUST_EMAIL) values(?,?,?,?,?,?)");
            //add.setInt(1, Integer.valueOf(m_id.getText()));
            add.setString(1, c_firstName.getText());
            add.setString(2, c_lastName.getText());
            add.setString(3, c_gender.getText());
            add.setInt(4, Integer.valueOf(c_age.getText()));
            add.setString(5, c_address.getText());
            add.setString(6, c_emailAddress.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Customer info successfully added");
            con.close();
            SelectMed();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_c_addMouseClicked

    private void c_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_deleteMouseClicked
        // TODO add your handling code here:
        if(c_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the customer's id to be deleted");
        }
        else{
            try{
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:pharmacy", "system", "password");
                String id = c_id.getText();
                String Query = "Delete from SYSTEM.CUSTOMER where CUST_ID="+id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                SelectMed();
                JOptionPane.showMessageDialog(this, "Customer info deleted successfully");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_c_deleteMouseClicked

    private void cust_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cust_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)cust_table.getModel();
        int index = cust_table.getSelectedRow();
        c_id.setText(model.getValueAt(index, 0).toString());
        c_firstName.setText(model.getValueAt(index, 1).toString());
        c_lastName.setText(model.getValueAt(index, 2).toString());
        c_gender.setText(model.getValueAt(index, 3).toString());
        c_age.setText(model.getValueAt(index, 4).toString());
        c_address.setText(model.getValueAt(index, 5).toString());
        c_emailAddress.setText(model.getValueAt(index, 6).toString());
    }//GEN-LAST:event_cust_tableMouseClicked

    private void c_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_updateMouseClicked
        // TODO add your handling code here:
        if(c_id.getText().isEmpty() || c_firstName.getText().isEmpty() || c_lastName.getText().isEmpty() || c_gender.getText().isEmpty()|| c_age.getText().isEmpty() || c_address.getText().isEmpty() || c_emailAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing information");
        }
        else{
            try{
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:pharmacy", "system", "password");
 String updateQuery = "Update SYSTEM.CUSTOMER set FIRST_NAME = '"+c_firstName.getText()+"'"+",LAST_NAME = '"+c_lastName.getText()+"'"+",GENDER = '"+c_gender.getText()+"'"+",AGE = '"+c_age.getText()+"'" +",ADDRESS = '"+c_address.getText()+ "'" +",CUST_EMAIL = '"+c_emailAddress.getText()+"'"+ "where CUST_ID = "+c_id.getText();
                Statement add = con.createStatement();
                add.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(this, "Customer's info updated successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            SelectMed();
        }

    }//GEN-LAST:event_c_updateMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Pharmacists().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        new Sells().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton c_add;
    private javax.swing.JTextField c_address;
    private javax.swing.JTextField c_age;
    private javax.swing.JButton c_delete;
    private javax.swing.JTextField c_emailAddress;
    private javax.swing.JTextField c_firstName;
    private javax.swing.JTextField c_gender;
    private javax.swing.JTextField c_id;
    private javax.swing.JTextField c_lastName;
    private javax.swing.JButton c_update;
    private javax.swing.JTable cust_table;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}