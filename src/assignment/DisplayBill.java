package assignment;

import java.awt.Color;
import java.awt.Component;
import java.io.IOException;
import java.text.ParseException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DisplayBill extends javax.swing.JFrame {

    private Component frame;
    double total = 0;

    /**
     * Creates new form DisplayBill
     */
    public DisplayBill() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        bill_txtArea.setVisible(false);
        bill_txtArea.append("Customer Name: " + Login.user + "\nDate : " + DateTimeFormatter.ofPattern("dd MMM yyyy").format(ZonedDateTime.now(ZoneId.systemDefault())));
        bill_txtArea.append("\n-------------------------------------------------------");
        bill_txtArea.append("\nMedicine:" + "\tQuantity: " + "\tPrice:");
        bill_txtArea.append("\n-------------------------------------------------------");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        medicineId_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        medicineName_txt = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        close_btn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bill_txtArea = new javax.swing.JTextArea();
        quantity_spn = new javax.swing.JSpinner();
        display_btn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Display Bill");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Display Bill");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel11.setText("Medicine ID");

        medicineId_txt.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        medicineId_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineId_txtActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel12.setText("Medicine Name");

        medicineName_txt.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        medicineName_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineName_txtActionPerformed(evt);
            }
        });

        add_btn.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        add_btn.setText("Add");
        add_btn.setFocusable(false);
        add_btn.setPreferredSize(new java.awt.Dimension(104, 37));
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        close_btn.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        close_btn.setText("Close");
        close_btn.setFocusable(false);
        close_btn.setPreferredSize(new java.awt.Dimension(104, 37));
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel13.setText("Quantity");

        bill_txtArea.setColumns(20);
        bill_txtArea.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        bill_txtArea.setRows(5);
        jScrollPane1.setViewportView(bill_txtArea);

        quantity_spn.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        quantity_spn.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        quantity_spn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        display_btn1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        display_btn1.setText("Display");
        display_btn1.setFocusable(false);
        display_btn1.setPreferredSize(new java.awt.Dimension(104, 37));
        display_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(medicineId_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(medicineName_txt, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(quantity_spn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(display_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(close_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(medicineId_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(medicineName_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(quantity_spn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(display_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void medicineId_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineId_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineId_txtActionPerformed

    private void medicineName_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineName_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineName_txtActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        bill_txtArea.setVisible(false);
        try {
            if ((total += generateBill()) != 0) {
                bill_txtArea.setVisible(true);

            } else {
                bill_txtArea.setVisible(false);
                JOptionPane.showMessageDialog(frame, "Can't find the medicine.\n"
                        + "Please, make sure that you have entered a correct "
                        + "medicine ID and Name",
                        "Invalid Entry!",
                        JOptionPane.ERROR_MESSAGE);

            }
        } catch (IOException ex) {
            Logger.getLogger(DisplayBill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(DisplayBill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_btnActionPerformed

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_close_btnActionPerformed

    private void display_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_btn1ActionPerformed
        add_btn.setEnabled(false);
        display_btn1.setEnabled(false);
        bill_txtArea.append("\n-------------------------");
        bill_txtArea.append("\nTotal : " + total);
    }//GEN-LAST:event_display_btn1ActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayBill().setVisible(true);
            }
        });
    }

    private double generateBill() throws IOException, ParseException {
        double amount = 0;
        ArrayList<String> details = new ArrayList();
        Customer cus = new Customer();
        details = cus.displayBill(medicineId_txt.getText(),
                medicineName_txt.getText(), (Integer) quantity_spn.getValue());
        if (details.get(0).equals("true")) {
            amount = Double.parseDouble(details.get(9));
            bill_txtArea.append("\n" + details.get(2) + "\t"
                    + quantity_spn.getValue() + "\t" + amount);
        }
        return amount;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextArea bill_txtArea;
    private javax.swing.JButton close_btn;
    private javax.swing.JButton display_btn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medicineId_txt;
    private javax.swing.JTextField medicineName_txt;
    private javax.swing.JSpinner quantity_spn;
    // End of variables declaration//GEN-END:variables
}
