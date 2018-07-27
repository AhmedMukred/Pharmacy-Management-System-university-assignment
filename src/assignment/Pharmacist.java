package assignment;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Pharmacist extends User implements searching {

    private Component frame;
    private TxtFile file = new TxtFile("medicine");

    public Pharmacist(String firstName, String lastName, String email,
            Account account) {
        super(firstName, lastName, email, account);
    }

    public Pharmacist() {
    }

    public boolean addMedicine(String medicineId, String medicineName,
            String companyName, int batch, String DOM, String DOE,
            double price, int quantity) {
        boolean success = false;
        Medicine newMedicine = new Medicine(medicineId, medicineName,
                companyName, batch, DOM, DOE, price, quantity);
        try {
            if (file.addNewMedicineToMedicineFile(newMedicine.getMedicineId(),
                    newMedicine.getMedicineName(), newMedicine.getCompanyName(),
                    newMedicine.getBatch(), newMedicine.getDOM(),
                    newMedicine.getDOE(), newMedicine.getPrice(),
                    newMedicine.getQuantity()) == true) {
                success = true;
            } else {
                JOptionPane.showMessageDialog(frame,
                        "Please, try again. Can not record the new medicine currently",
                        "Error on recording the new medicine", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            Logger.getLogger(Pharmacist.class.getName()).log(Level.SEVERE, null, ex);
        }

        return success;
    }

    public boolean modifyMedicine(String oldMedicineId, String oldMedicineName,
            String newMedicineId, String newMedicineName, String companyName,
            int batch, String DOM, String DOE, double price,
            int quantity) throws IOException {
        return file.modifyMedicine(oldMedicineId, oldMedicineName,
                newMedicineId, newMedicineName, companyName, batch, DOM,
                DOE, price, quantity);
    }

    public boolean deleteMedicine(String medicineID, String medicineName) throws IOException {
        boolean success = false;
        if (file.removeMedicineFromFile(medicineID, medicineName) == true) {
            success = true;
        }
        return success;
    }

    public ArrayList<String> listOfMedicinesBasedOnExpiryMonths(int month, int year) throws IOException, ParseException {
        return file.expiryDatesOfMedicines(month, year);
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

    @Override
    public void welocmeUserMessage() {
        JOptionPane pane = new JOptionPane("Welcome Pharmacist to "
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
