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
public class Pharmacists extends javax.swing.JFrame {
    
    Connection con = null;
    Statement st = null, st1 = null;
    ResultSet rs = null, rs1 = null;
    /**
     * Creates new form Pharmacists
     */
    public Pharmacists() {
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
        p_id = new javax.swing.JTextField();
        p_firstName = new javax.swing.JTextField();
        p_lastName = new javax.swing.JTextField();
        p_age = new javax.swing.JTextField();
        p_gender = new javax.swing.JTextField();
        p_add = new javax.swing.JButton();
        p_delete = new javax.swing.JButton();
        p_update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        phar_table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        p_address = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        p_emailAddress = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(198, 209, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(15, 27, 7));
        jLabel5.setText("MANAGE PHARMACISTS' INFORMATION");

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

        p_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        p_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_idActionPerformed(evt);
            }
        });

        p_firstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        p_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_firstNameActionPerformed(evt);
            }
        });

        p_lastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        p_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_lastNameActionPerformed(evt);
            }
        });

        p_age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        p_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_ageActionPerformed(evt);
            }
        });

        p_gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        p_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_genderActionPerformed(evt);
            }
        });

        p_add.setBackground(new java.awt.Color(255, 255, 255));
        p_add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p_add.setForeground(new java.awt.Color(15, 27, 7));
        p_add.setText("ADD");
        p_add.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(198, 209, 102), null));
        p_add.setContentAreaFilled(false);
        p_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_addMouseClicked(evt);
            }
        });
        p_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_addActionPerformed(evt);
            }
        });

        p_delete.setBackground(new java.awt.Color(255, 255, 255));
        p_delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p_delete.setForeground(new java.awt.Color(15, 27, 7));
        p_delete.setText("DELETE");
        p_delete.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(198, 209, 102), null));
        p_delete.setContentAreaFilled(false);
        p_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_deleteMouseClicked(evt);
            }
        });
        p_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_deleteActionPerformed(evt);
            }
        });

        p_update.setBackground(new java.awt.Color(255, 255, 255));
        p_update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        p_update.setForeground(new java.awt.Color(15, 27, 7));
        p_update.setText("UPDATE");
        p_update.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(198, 209, 102), null));
        p_update.setContentAreaFilled(false);
        p_update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_updateMouseClicked(evt);
            }
        });
        p_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_updateActionPerformed(evt);
            }
        });

        phar_table.setForeground(new java.awt.Color(15, 27, 7));
        phar_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "PHAR_ID", "FIRST_NAME", "LAST_NAME", "GENDER", "AGE", "ADDRESS", "PHAR_EMAIL", "PHAR_PASSWORD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        phar_table.setGridColor(new java.awt.Color(15, 27, 7));
        phar_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        phar_table.setSelectionBackground(new java.awt.Color(92, 130, 26));
        phar_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phar_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(phar_table);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(92, 130, 26));
        jLabel11.setText("PHARMACISTS LIST");

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

        p_address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        p_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_addressActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(92, 130, 26));
        jLabel14.setText("EMAIL ADDRESS");

        p_emailAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        p_emailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_emailAddressActionPerformed(evt);
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
                            .addComponent(p_add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_id)
                    .addComponent(p_lastName)
                    .addComponent(p_gender)
                    .addComponent(p_age)
                    .addComponent(p_address)
                    .addComponent(p_firstName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(p_update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(p_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addComponent(p_emailAddress))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(296, 296, 296))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
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
                    .addComponent(p_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(p_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(p_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(p_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(92, 130, 26));
        jLabel2.setText("Customers");
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void SelectMed(){
        try{
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:pharmacy", "system", "password");
            st = con.createStatement();
            rs = st.executeQuery("Select * from SYSTEM.PHARMACIST");
            phar_table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    private void p_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_idActionPerformed

    private void p_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_firstNameActionPerformed

    private void p_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_lastNameActionPerformed

    private void p_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_ageActionPerformed

    private void p_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_genderActionPerformed

    private void p_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_updateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_updateActionPerformed

    private void p_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_addressActionPerformed

    private void p_emailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_emailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_emailAddressActionPerformed

    private void p_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_addActionPerformed

    private void p_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_deleteActionPerformed

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
        // TODO add your handling code here:
        try{
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:pharmacy", "system", "password");
            PreparedStatement add = con.prepareStatement("insert into PHARMACIST(FIRST_NAME, LAST_NAME, GENDER, AGE, ADDRESS, PHAR_EMAIL) values(?,?,?,?,?,?)");
            //add.setInt(1, Integer.valueOf(m_id.getText()));
            add.setString(1, p_firstName.getText());
            add.setString(2, p_lastName.getText());
            add.setString(3, p_gender.getText());
            add.setInt(4, Integer.valueOf(p_age.getText()));
            add.setString(5, p_address.getText());
            add.setString(6, p_emailAddress.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Pharmacist info successfully added");
            con.close();
            SelectMed();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_p_addMouseClicked

    private void p_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_deleteMouseClicked
        // TODO add your handling code here:
        if(p_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter the pharmacist's id to be deleted");
        }
        else{
            try{
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:pharmacy", "system", "password");
                String id = p_id.getText();
                String Query = "Delete from SYSTEM.PHARMACIST where PHAR_ID="+id;
                Statement add = con.createStatement();
                add.executeUpdate(Query);
                SelectMed();
                JOptionPane.showMessageDialog(this, "Pharmacist info deleted successfully");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_p_deleteMouseClicked

    private void phar_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phar_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)phar_table.getModel();
        int index = phar_table.getSelectedRow();
        p_id.setText(model.getValueAt(index, 0).toString());
        p_firstName.setText(model.getValueAt(index, 1).toString());
        p_lastName.setText(model.getValueAt(index, 2).toString());
        p_gender.setText(model.getValueAt(index, 3).toString());
        p_age.setText(model.getValueAt(index, 4).toString());
        p_address.setText(model.getValueAt(index, 5).toString());
        p_emailAddress.setText(model.getValueAt(index, 6).toString());
        
    }//GEN-LAST:event_phar_tableMouseClicked

    private void p_updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_updateMouseClicked
        // TODO add your handling code here:
        if(p_id.getText().isEmpty() || p_firstName.getText().isEmpty() || p_lastName.getText().isEmpty() || p_gender.getText().isEmpty()|| p_age.getText().isEmpty() || p_address.getText().isEmpty() || p_emailAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing information");
        }
        else{
            try{
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:pharmacy", "system", "password");
 String updateQuery = "Update SYSTEM.PHARMACIST set FIRST_NAME = '"+p_firstName.getText()+"'"+",LAST_NAME = '"+p_lastName.getText()+"'"+",GENDER = '"+p_gender.getText()+"'"+",AGE = '"+p_age.getText()+"'" +",ADDRESS = '"+p_address.getText()+ "'" +",PHAR_EMAIL = '"+p_emailAddress.getText()+"'"+ "where PHAR_ID = "+p_id.getText();
                Statement add = con.createStatement();
                add.executeUpdate(updateQuery);
                JOptionPane.showMessageDialog(this, "Pharmacist's info updated successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            SelectMed();
        }
         
    }//GEN-LAST:event_p_updateMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new Customers().setVisible(true);
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
            java.util.logging.Logger.getLogger(Pharmacists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pharmacists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pharmacists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pharmacists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pharmacists().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton p_add;
    private javax.swing.JTextField p_address;
    private javax.swing.JTextField p_age;
    private javax.swing.JButton p_delete;
    private javax.swing.JTextField p_emailAddress;
    private javax.swing.JTextField p_firstName;
    private javax.swing.JTextField p_gender;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextField p_lastName;
    private javax.swing.JButton p_update;
    private javax.swing.JTable phar_table;
    // End of variables declaration//GEN-END:variables
}
