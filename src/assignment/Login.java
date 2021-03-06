package assignment;

import java.awt.Color;
import java.awt.Component;
import javax.swing.*;

public class Login extends javax.swing.JFrame {

    private static Component frame;
    static final String userFile = "users.txt";
    public static String user, role;

    /**
     * Creates new form Main
     */
    public Login() {
        initComponents();
        Color backGround = new Color(0, 179, 134);
        this.getContentPane().setBackground(backGround);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        pharmacyLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        pswTxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(112, 226, 185));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(480, 330));
        setResizable(false);

        loginBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.setFocusable(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        closeBtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.setFocusable(false);
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeBtnMousePressed(evt);
            }
        });
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        pharmacyLbl.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 30)); // NOI18N
        pharmacyLbl.setForeground(new java.awt.Color(255, 255, 255));
        pharmacyLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pharmacyLbl.setText("Pharmacy Managment System");
        pharmacyLbl.setAutoscrolls(true);
        pharmacyLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pharmacyLbl.setFocusable(false);
        pharmacyLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        userNameTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        pswTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(closeBtn))
                            .addComponent(pswTxt)
                            .addComponent(userNameTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pharmacyLbl)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(pharmacyLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pswTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(closeBtn))
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        if (chceckFields() == true) {
            Account acc = new Account();
            if (!(role = acc.login(userNameTxt.getText(), String.valueOf(pswTxt.getPassword()))).isEmpty()) {
                if (role.equalsIgnoreCase("admin")) {
                    Admin ad = new Admin();
                    ad.welocmeUserMessage();
                }
                else if (role.equalsIgnoreCase("customer")){
                    Customer cus = new Customer();
                    cus.welocmeUserMessage();
                }
                else {
                    Pharmacist phr = new Pharmacist();
                    phr.welocmeUserMessage();
                }
                user = userNameTxt.getText();
                Main mainFrame = new Main();
                mainFrame.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(frame,
                        "Please, try again. The entered username or password is incorrect",
                        "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(frame,
                "Are you sure that you want to close the programme",
                "Confirm Close!", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            System.exit(WIDTH);
        }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void closeBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeBtnMousePressed

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        
    }//GEN-LAST:event_closeBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel pharmacyLbl;
    private javax.swing.JPasswordField pswTxt;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables

    private boolean chceckFields() {
        boolean success = false;
        if (userNameTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please, make sure that you have entered the username",
                    "Invalid Entry!",
                    JOptionPane.ERROR_MESSAGE);
            userNameTxt.requestFocusInWindow();
        } else if (pswTxt.getPassword().length == 0) {
            JOptionPane.showMessageDialog(frame, "Please, make sure that you have entered the password",
                    "Invalid Entry!",
                    JOptionPane.ERROR_MESSAGE);
            pswTxt.requestFocusInWindow();

        } else {
            success = true;
        }
        return success;
    }
}
