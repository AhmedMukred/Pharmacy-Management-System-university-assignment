package assignment;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Admin extends User {

    private TxtFile file = new TxtFile("users");
    private Component frame;

    public Admin(String firstName, String lastName, String email, Account account) {
        super(firstName, lastName, email, account);
    }

    public Admin() {

    }

    public boolean addNewUser(String firstName, String lastName, String email,
            String username, String password, String userRole) throws IOException {
        boolean success = false;
        Account newAcc = new Account(username, password, userRole);
        if (userRole.equals("pharmacist")) {
            Pharmacist phar = new Pharmacist(firstName, lastName, email, newAcc);
            if (file.addNewRoleToUserFile(phar.getUsername(),
                    phar.getPassword(), phar.getUserRole()) == true) {
                success = true;
            }
        } else {
            Customer cus = new Customer(username, password, userRole, newAcc);
            if (file.addNewRoleToUserFile(cus.getUsername(),
                    cus.getPassword(), cus.getUserRole()) == true) {
                success = true;
            }
        }

        return success;
    }

    public boolean removeUser(String username) throws IOException {
        boolean success = false;
        if (file.removeUserFromFile(username) == true) {
            success = true;
        }
        return success;
    }

    @Override
    public void welocmeUserMessage() {
        JOptionPane pane = new JOptionPane("Welcome Admin to "
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
