package assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Customer extends User implements searching {

    private TxtFile file = new TxtFile("medicine");

    public Customer(String firstName, String lastName, String email, Account account) {
        super(firstName, lastName, email, account);
    }

    public Customer() {
    }

    @Override
    public ArrayList<String> searchMedicine(String medicineId, String medicineName) {
        ArrayList<String> medicineDetails = new ArrayList<>();
        try {
            medicineDetails = file.getMedicineDetailsFromFile(medicineId,
                    medicineName);
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medicineDetails;
    }

    public ArrayList<String> displayBill(String medicineId, String medicineName, int quantity) {
        ArrayList<String> medicineDetails = new ArrayList<>();
        try {
            medicineDetails = file.getMedicineDetailsFromFile(medicineId,
                    medicineName);
            if (medicineDetails.get(0).equals("true")) {
                double total = Double.parseDouble(medicineDetails.get(7)) * quantity;
                medicineDetails.add(String.valueOf(total));
            }
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return medicineDetails;
    }
    
        @Override
    public void welocmeUserMessage() {
        JOptionPane pane = new JOptionPane("Welcome Customer to "
                + "Phramcay Managemnet System");
        JDialog dialog = pane.createDialog("Welcome");
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
                // or maybe you'll need dialog.dispose() instead?
            }
        });
        timer.setRepeats(false);
        timer.start();
        dialog.setVisible(true);
    }
}
