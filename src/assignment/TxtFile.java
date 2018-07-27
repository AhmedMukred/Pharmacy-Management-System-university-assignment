package assignment;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TxtFile {

    private String mTxtFileName;
    private Component frame;

    public TxtFile(String txtFileName) {
        mTxtFileName = txtFileName;
    }

    public String getTxtFileName() {
        return mTxtFileName;
    }

    public boolean findTxtFile() {
        boolean success = false;
        if (!mTxtFileName.endsWith(".txt")) {
            mTxtFileName += ".txt";
        }

        File file = new File(mTxtFileName);

        if (file.exists()) {
            success = true;
        } else {
            try {
                file.createNewFile();
                success = true;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Please, try again. "
                        + "Currently, Can not access to users data", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        return success;
    }

    /**
     *
     * @param username refers to the entered username
     * @param password refers to the entered password
     * @return return an boolean value that determines if the entered user's
     * details match with the stored users' roles or not
     */
    public String verifyUserWithinFile(String username, String password) {
        String role = "";
        if (findTxtFile() == true) {
            String line;
            File file = new File(mTxtFileName);
            try (BufferedReader scan = new BufferedReader(new FileReader(file))) {
                while ((line = scan.readLine()) != null) {
                    if (username.equals(line.substring(9))) {
                        line = scan.readLine();
                        if (password.equals(line.substring(9))) {
                            line = scan.readLine();
                            role = line.substring(5);
                            scan.close();
                            break;
                        } else {
                            scan.readLine();
                        }
                    } else {
                        for (int i = 0; i <= 1; i++) {
                            scan.readLine();
                        }
                    }
                }
                scan.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Please, try again. The file not found",
                    "Error on accessing the file", JOptionPane.ERROR_MESSAGE);
        }
        return role;
    }

    private boolean checkUsernameWithinFile(String username) {
        boolean success = false;

        if (findTxtFile() == true) {
            String line;
            File file = new File(mTxtFileName);
            try (BufferedReader scan = new BufferedReader(new FileReader(file))) {
                while ((line = scan.readLine()) != null) {
                    if (username.equalsIgnoreCase(line.substring(9))) {
                        success = true;
                        break;
                    } else {
                        for (int i = 0; i <= 1; i++) {
                            scan.readLine();
                        }
                    }
                }
                scan.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Please, try again. The text file can not be accessed",
                    "Error on accessing to text file", JOptionPane.ERROR_MESSAGE);
        }

        return success;
    }

    /**
     *
     * @param username refers to the entered new username
     * @param password refers to the entered user's password
     * @param role refers to the chosen role of the new user
     * @return will return a boolean value that confirm adding new user role
     * successfully
     * @throws FileNotFoundException
     * @throws IOException
     */
    public boolean addNewRoleToUserFile(String username, String password, String role)
            throws FileNotFoundException, IOException {
        boolean success = false;

        if (checkUsernameWithinFile(username) != true) {
            if (findTxtFile() == true) {
                File file = new File(mTxtFileName);
                try (BufferedWriter record
                        = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), true))) {
                    record.write("username:" + username);
                    record.newLine();
                    record.write("password:" + password);
                    record.newLine();
                    record.write("role:" + role);
                    record.newLine();
                    record.close();
                    success = true;
                }

            } else {
                JOptionPane.showMessageDialog(frame, "Please, try again. "
                        + "Can not access to users data currently",
                        "Faild accessing to text file",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Please, try to add different username. The entered "
                    + "username is already existing",
                    "Invalid Username Entry", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    /**
     *
     * @param medicineID refers to the medicine id
     * @param medicineName refers to the medicine name
     * @return will return a boolean value that determine if the medicine is
     * already exist in the medicines file or not
     * @throws IOException
     */
    public boolean checkMedicineInFile(String medicineID, String medicineName) 
            throws IOException {
        boolean success = false;
        if (findTxtFile() == true) {
            String line;
            File file = new File(mTxtFileName);
            try (BufferedReader scan = new BufferedReader(new FileReader(file))) {
                while ((line = scan.readLine()) != null) {
                    if ("Medicine ID:".concat(medicineID).equalsIgnoreCase(line)) {
                        line = scan.readLine();
                        if ("Medicine Name:".concat(medicineName).equalsIgnoreCase(line)) {
                            success = true;
                            break;
                        } else {
                            for (int i = 0; i <= 5; i++) {
                                scan.readLine();
                            }
                        }
                    } else {
                        for (int i = 0; i <= 6; i++) {
                            scan.readLine();
                        }
                    }
                }
                scan.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Please, try again. The text file can not be accessed",
                    "Error on accessing to text file", JOptionPane.ERROR_MESSAGE);
        }

        return success;
    }
    
    
    public boolean checkMedicineInFile(String medicineID) {
        boolean success = false;

        if (findTxtFile() == true) {
            String line;
            File file = new File(mTxtFileName);
            try (BufferedReader scan = new BufferedReader(new FileReader(file))) {
                while ((line = scan.readLine()) != null) {
                    if ("Medicine ID:".concat(medicineID).equalsIgnoreCase(line)) {
                        success = true;
                        break;
                    } else {
                        for (int i = 0; i < 7; i++) {
                            scan.readLine();
                        }
                    }
                }
                scan.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Please, try again. The text file can not be accessed",
                    "Error on accessing to text file", JOptionPane.ERROR_MESSAGE);
        }

        return success;
    }
        
    /**
     *
     * @param medicineID refers to the medicine id
     * @param medicineName refers to the medicine name
     * @return will return an ArrayList that will contains all of the medicines'
     * details such as id, name, quantity, price,etc.
     * @throws IOException
     */
    public ArrayList<String> getMedicineDetailsFromFile(String medicineID,
            String medicineName) throws IOException {
        ArrayList<String> medicineDetails = new ArrayList();
        int[] subNo = {12, 14, 13, 6, 4, 4, 6, 9};
        if (findTxtFile() == true) {
            if (checkMedicineInFile(medicineID, medicineName) == true) {
                medicineDetails.add("true");
                String line;
                File file = new File(mTxtFileName);
                try (BufferedReader scan = new BufferedReader(new FileReader(file))) {
                    while ((line = scan.readLine()) != null) {
                        if ("Medicine ID:".concat(medicineID).equalsIgnoreCase(line)) {
                            for (int i = 0; i <= 7; i++) {
                                medicineDetails.add(line.substring(subNo[i]));
                                line = scan.readLine();
                            }
                            break;
                        } else {
                            for (int i = 0; i <= 6; i++) {
                                scan.readLine();
                            }
                        }
                    }
                    scan.close();
                } catch (Exception e) {
                    e.getStackTrace();
                }
            } else {
                medicineDetails.add("false");
            }
        } else {
            medicineDetails.add("false");
            JOptionPane.showMessageDialog(frame,
                    "Please, try again. The text file can not be accessed",
                    "Error on Accessing to Text File", JOptionPane.ERROR_MESSAGE);
        }

        return medicineDetails;
    }

    public ArrayList<String> allMedicineDetailsInsideFile() throws IOException {
        ArrayList<String> medicineDetails = new ArrayList();
        if (findTxtFile() == true) {
            String line;
            File file = new File(mTxtFileName);
            try (BufferedReader scan = new BufferedReader(new FileReader(file))) {
                while ((line = scan.readLine()) != null) {
                    medicineDetails.add(line);
                }
                scan.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        } else {
            medicineDetails.add("false");
            JOptionPane.showMessageDialog(frame,
                    "Please, try again. The text file can not be accessed",
                    "Error on Accessing to Text File", JOptionPane.ERROR_MESSAGE);
        }

        return medicineDetails;
    }

    public boolean removeMedicineFromFile(String medicineId, String medicineName) throws IOException {
        boolean success = false;
        ArrayList<String> medicines = new ArrayList<>();
        medicines = allMedicineDetailsInsideFile();
        if (findTxtFile() == true) {
            if (checkMedicineInFile(medicineId, medicineName) == true) {
                for (int i = 0; i < medicines.size(); i += 8) {
                    if ("Medicine ID:".concat(medicineId).equalsIgnoreCase(medicines.get(i))) {
                        for (int index = 0; index < 8; index++) {
                            medicines.remove(i);
                        }
                        File file = new File(mTxtFileName);
                        try (BufferedWriter record
                                = new BufferedWriter(new FileWriter(file))) {
                            for (int item = 0; item < medicines.size(); item++) {
                                record.write(medicines.get(item));
                                record.newLine();
                            }
                            record.close();
                            success = true;
                            return success;
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(frame,
                        "Please, try again. The text file can not be accessed",
                        "Error on Accessing to Text File", JOptionPane.ERROR_MESSAGE);
            }
        }
        return success;
    }

    public boolean modifyMedicine(String oldMedicineId, String oldMedicineName,
            String newMedicineId, String newMedicineName, String companyName,
            int batch, String DOM, String DOE, double price,
            int quantity) throws IOException {
        boolean success = false;
        if (checkMedicineInFile(newMedicineId) == false) {
            if (removeMedicineFromFile(oldMedicineId, oldMedicineName) == true
                    && addNewMedicineToMedicineFile(newMedicineId, newMedicineName,
                            companyName, batch, DOM, DOE, price, quantity) == true) {
                success = true;
            }
        }
        return success;
    }

    /**
     *
     * @param medicineId refers to the new medicine id
     * @param medicineName refers to the new medicine name
     * @param companyName refers to the new medicine manufactured company
     * @param batch refers to the new medicine batch
     * @param DOM refers to the new medicine Date of Manufacture
     * @param DOE refers to the new medicine Date of Expired
     * @param price refers to the new medicine price
     * @param quantity refer to the new medicine quantity
     * @return will return a boolean value that will confirm if the medicine
     * details has recorded successfully or not
     * @throws FileNotFoundException
     * @throws IOException
     */
    public boolean addNewMedicineToMedicineFile(String medicineId,
            String medicineName, String companyName, int batch, String DOM,
            String DOE, double price, int quantity) throws FileNotFoundException, IOException {
        boolean success = false;
        if (findTxtFile() == true) {
            File file = new File(mTxtFileName);

            try (BufferedWriter record
                    = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), true))) {
                record.write("Medicine ID:" + medicineId);
                record.newLine();
                record.write("Medicine Name:" + medicineName);
                record.newLine();
                record.write("Company Name:" + companyName);
                record.newLine();
                record.write("Batch:" + batch);
                record.newLine();
                record.write("DOM:" + DOM);
                record.newLine();
                record.write("DOE:" + DOE);
                record.newLine();
                record.write("Price:" + price);
                record.newLine();
                record.write("Quantity:" + quantity);
                record.newLine();
                record.close();
                success = true;
            } catch (Exception e) {
                e.getStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Please, try again. The text file can not be accessed",
                    "Error on accessing to text file", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }

    /**
     *
     * @return will return an ArrayList that contains all of the usernames those
     * exist in the users text file
     * @throws FileNotFoundException
     * @throws IOException
     */
    public ArrayList<String> getUsersListFromFile() throws FileNotFoundException, IOException {
        ArrayList<String> list = new ArrayList<>();
        String line;
        if (findTxtFile() == true) {
            File file = new File(mTxtFileName);
            try (BufferedReader scan = new BufferedReader(new FileReader(file))) {
                while ((line = scan.readLine()) != null) {
                    list.add(line);
                }
                scan.close();
            } catch (Exception e) {
                e.getStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Please, try again. The text file can not be accessed",
                    "Error on accessing to text file", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }

    public boolean removeUserFromFile(String username) throws IOException {
        boolean success = false;
        ArrayList<String> users = new ArrayList<>();
        users = getUsersListFromFile();
        if (findTxtFile() == true) {
            for (int i = 0; i < users.size(); i += 3) {
                if ("username:".concat(username).equalsIgnoreCase(users.get(i))) {
                    for (int index = 0; index < 3; index++) {
                        users.remove(i);
                    }
                    File file = new File(mTxtFileName);
                    try (BufferedWriter record
                            = new BufferedWriter(new FileWriter(file))) {
                        for (int item = 0; item < users.size(); item++) {
                            record.write(users.get(item));
                            record.newLine();
                        }
                        record.close();
                        success = true;
                    }
                    return success;
                }
            }
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Please, try again. The text file can not be accessed",
                    "Error on Accessing to Text File", JOptionPane.ERROR_MESSAGE);
        }
        return success;
    }
    
   

    public ArrayList<String> expiryDatesOfMedicines(int month, int year) throws IOException, ParseException {
        ArrayList<String> allMedicines = new ArrayList<>();
        allMedicines = allMedicineDetailsInsideFile();
        ArrayList<String> expiryMedicines = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String date;
        for (int i = 5; i < allMedicines.size(); i += 8) {
            date = allMedicines.get(i).substring(4);
            LocalDate localDate = LocalDate.parse(date, formatter);
            if (month == localDate.getMonthValue() && year == localDate.getYear()) {
                expiryMedicines.add(allMedicines.get(i - 5).substring(12));
                expiryMedicines.add(allMedicines.get(i - 4).substring(14));
                expiryMedicines.add(allMedicines.get(i).substring(4));
            }
        }
        return expiryMedicines;
    }

}
