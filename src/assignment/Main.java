package assignment;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main extends javax.swing.JFrame {

    private Component frame;
    private final String role = Login.role;
    private final String userName = Login.user;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        checkUserRole(role);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        welcomelbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        newMedicine_Btn = new javax.swing.JButton();
        modifyMedicine_Btn = new javax.swing.JButton();
        deleteMedicine_Btn = new javax.swing.JButton();
        newUser_Btn = new javax.swing.JButton();
        search_Btn = new javax.swing.JButton();
        displayBill_Btn = new javax.swing.JButton();
        datesSearch_Btn = new javax.swing.JButton();
        userRole_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        setForeground(java.awt.Color.white);
        setIconImages(null);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(950, 730));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 175, 123));
        jLabel7.setText(DateTimeFormatter.ofPattern("hh:mm     dd MMM yyyy").format(ZonedDateTime.now(ZoneId.systemDefault())));

        welcomelbl.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        welcomelbl.setForeground(new java.awt.Color(33, 175, 123));
        welcomelbl.setText("Welcome");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 255));
        jLabel10.setText("Log out");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        newMedicine_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addMedicine.png"))); // NOI18N
        newMedicine_Btn.setToolTipText("Add New Medicine");
        newMedicine_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMedicine_BtnActionPerformed(evt);
            }
        });

        modifyMedicine_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modify.png"))); // NOI18N
        modifyMedicine_Btn.setToolTipText("Modify a Medicine");
        modifyMedicine_Btn.setPreferredSize(new java.awt.Dimension(350, 350));
        modifyMedicine_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyMedicine_BtnActionPerformed(evt);
            }
        });

        deleteMedicine_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        deleteMedicine_Btn.setToolTipText("Delete a Medicine");
        deleteMedicine_Btn.setPreferredSize(new java.awt.Dimension(350, 350));
        deleteMedicine_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMedicine_BtnActionPerformed(evt);
            }
        });

        newUser_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/newUser.png"))); // NOI18N
        newUser_Btn.setToolTipText("Users Management");
        newUser_Btn.setMinimumSize(new java.awt.Dimension(350, 350));
        newUser_Btn.setPreferredSize(new java.awt.Dimension(350, 350));
        newUser_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUser_BtnActionPerformed(evt);
            }
        });

        search_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        search_Btn.setToolTipText("Search for a Medicine");
        search_Btn.setPreferredSize(new java.awt.Dimension(350, 350));
        search_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_BtnActionPerformed(evt);
            }
        });

        displayBill_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bill.png"))); // NOI18N
        displayBill_Btn.setToolTipText("Display Bill");
        displayBill_Btn.setPreferredSize(new java.awt.Dimension(350, 350));
        displayBill_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBill_BtnActionPerformed(evt);
            }
        });

        datesSearch_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/datesSearch.png"))); // NOI18N
        datesSearch_Btn.setToolTipText("List out Medicines");
        datesSearch_Btn.setPreferredSize(new java.awt.Dimension(350, 350));
        datesSearch_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datesSearch_BtnActionPerformed(evt);
            }
        });

        userRole_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userRole_lbl.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newMedicine_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newUser_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(modifyMedicine_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(welcomelbl)
                        .addGap(7, 7, 7)
                        .addComponent(userRole_lbl))
                    .addComponent(deleteMedicine_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(datesSearch_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayBill_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(welcomelbl)
                            .addComponent(userRole_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modifyMedicine_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteMedicine_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(newMedicine_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newUser_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datesSearch_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayBill_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        int dialogResult = JOptionPane.showConfirmDialog(frame,
                "Are you sure that you want to log out?",
                "Confirm Logging out!", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            Login log = new Login();
            log.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated

    }//GEN-LAST:event_formWindowDeactivated

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated


    }//GEN-LAST:event_formWindowActivated

    private void newMedicine_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMedicine_BtnActionPerformed
        NewMedicine med = new NewMedicine();
        med.setVisible(true);
        med.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_newMedicine_BtnActionPerformed

    private void newUser_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUser_BtnActionPerformed
        UsersManagement user = new UsersManagement();
        user.setVisible(true);
        user.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_newUser_BtnActionPerformed

    private void modifyMedicine_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyMedicine_BtnActionPerformed
        ModifyMedicine modMedicin = new ModifyMedicine();
        modMedicin.setVisible(true);
        modMedicin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_modifyMedicine_BtnActionPerformed

    private void deleteMedicine_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMedicine_BtnActionPerformed
        DeleteMedicine deltFrm = new DeleteMedicine();
        deltFrm.setVisible(true);
    }//GEN-LAST:event_deleteMedicine_BtnActionPerformed

    private void datesSearch_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datesSearch_BtnActionPerformed
        ListOfMedicine list = new ListOfMedicine();
        list.setVisible(true);
    }//GEN-LAST:event_datesSearch_BtnActionPerformed

    private void search_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_BtnActionPerformed
        SearchMedicine srch = new SearchMedicine();
        srch.setVisible(true);
    }//GEN-LAST:event_search_BtnActionPerformed

    private void displayBill_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBill_BtnActionPerformed
        DisplayBill dis = new DisplayBill();
        dis.setVisible(true);
    }//GEN-LAST:event_displayBill_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    //Check the role of the user and control the application functions
    /**
     * @param role the user role arguments
     */
    private void checkUserRole(String role) {
        if (role.equalsIgnoreCase("Pharmacist")) {
            userRole_lbl.setText("Pharmacist");
            newUser_Btn.setEnabled(false);
            datesSearch_Btn.setEnabled(true);
            datesSearch_Btn.setVisible(true);
            displayBill_Btn.setVisible(false);
        } else if (role.equalsIgnoreCase("Customer")) {
            userRole_lbl.setText("Customer");
            newMedicine_Btn.setEnabled(false);
            deleteMedicine_Btn.setEnabled(false);
            modifyMedicine_Btn.setEnabled(false);
            newUser_Btn.setEnabled(false);
            datesSearch_Btn.setEnabled(false);
            datesSearch_Btn.setVisible(false);
        } else if (role.equalsIgnoreCase("Admin")) {
            userRole_lbl.setText("Admin");
            newMedicine_Btn.setEnabled(false);
            deleteMedicine_Btn.setEnabled(false);
            modifyMedicine_Btn.setEnabled(false);
            newUser_Btn.setEnabled(true);
            search_Btn.setEnabled(false);
            datesSearch_Btn.setEnabled(false);
            datesSearch_Btn.setVisible(false);
            displayBill_Btn.setEnabled(false);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton datesSearch_Btn;
    private javax.swing.JButton deleteMedicine_Btn;
    private javax.swing.JButton displayBill_Btn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton modifyMedicine_Btn;
    private javax.swing.JButton newMedicine_Btn;
    private javax.swing.JButton newUser_Btn;
    private javax.swing.JButton search_Btn;
    private javax.swing.JLabel userRole_lbl;
    private javax.swing.JLabel welcomelbl;
    // End of variables declaration//GEN-END:variables

}
