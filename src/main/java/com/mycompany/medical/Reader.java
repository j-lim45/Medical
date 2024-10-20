/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medical;

/**
 *
 * @author Adriane
 */
import java.io.FileReader; 
import java.io.BufferedReader; 
import java.io.BufferedWriter; 
import java.io.FileWriter; 
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;
public class Reader {

    public static ArrayList<Patient> readPatientsDatabase() { // returns an arraylist of all of the patients after reading patients.txt, bloodtest.txt, and mri.txt
        ArrayList<Patient> patientsList = new ArrayList<Patient>();
        HashMap<String, BloodTest> bloodTestList = new HashMap<String, BloodTest>();
        HashMap<String, MRI> mriList = new HashMap<String, MRI>();

        // Reads every blood test result in bloodtest.txt identifiable by "LASTNAME,FIRSTNAME" as the key
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(new File("bloodtest.txt")));

            // for storing blood test results
            String line = bReader.readLine();
            while (line != null) {                      
                    String[] currentLine = line.split(";");

                    bloodTestList.put(currentLine[0], 
                    new BloodTest(Double.parseDouble(currentLine[1].split(",")[0]), 
                        Double.parseDouble(currentLine[1].split(",")[1]), 
                        Double.parseDouble(currentLine[1].split(",")[2]), 
                        Double.parseDouble(currentLine[1].split(",")[3]), 
                        Double.parseDouble(currentLine[1].split(",")[4])));
                    line = bReader.readLine(); // read next line
            }
            bReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Reads every MRI result in mri.text identifiable by "LASTNAME,FIRSTNAME" as the key
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(new File("mri.txt")));

            // for storing blood test results
            String line = bReader.readLine();
            while (line != null) {                      
                    String[] currentLine = line.split(";");
                    
                    mriList.put(currentLine[0], new MRI(currentLine[1], currentLine[2])); // Key: LASTNAME,FIRSTNAME | Value: MRI Object(Findings,Impressions)
                    line = bReader.readLine();  // read next line
            }
            bReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Reads every line in patient.txt to parse as a Patient object stored in patientsList
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(new File("patients.txt")));

            String line = bReader.readLine();
            while (line != null) {                      
                    String[] currentLine = line.split(";");
                    double currentPatientbill = 0;

                    // Checks if the patient is a senior citizen
                    if      (Integer.parseInt(currentLine[2]) >= 65)    patientsList.add(new SeniorCitizenPatient());
                    else if (Boolean.parseBoolean(currentLine[5]))      patientsList.add(new InsuredPatient());
                    else                                                patientsList.add(new Patient());

                    // sets instance variables for the current patient
                    patientsList.get(patientsList.size()-1).setLastName(currentLine[0]);
                    patientsList.get(patientsList.size()-1).setFirstName(currentLine[1]);
                    patientsList.get(patientsList.size()-1).setAge(currentLine[2]);
                    patientsList.get(patientsList.size()-1).setBloodType(currentLine[3]);
                    patientsList.get(patientsList.size()-1).setGender(currentLine[4]);
                    patientsList.get(patientsList.size()-1).setInsured(Boolean.parseBoolean(currentLine[5]));

                    // locates the staff assigned to the patient in doctors.txt
                    for (Staff o : readDoctorsDatabase()) {
                        if (o.getLastName().equals(currentLine[6].split(",")[0]) && 
                            o.getFirstName().equals(currentLine[6].split(",")[1])) {
                                patientsList.get(patientsList.size()-1).setAssignedStaff(o);
                                break;
                            }
                    }
                    
                    patientsList.get(patientsList.size()-1).setIllness(currentLine[7]);
                    patientsList.get(patientsList.size()-1).setPrescription(new Prescription(currentLine[8], Double.parseDouble(currentLine[9])));

                    //---------------SET BILL-------------//

                    // Looks for a matching test result in each of the test result text files
                    try {

                        // Looks for a matching "LASTNAME,FIRSTNAME" key in the mriList HashMap
                        MRI patientmri = mriList.get(currentLine[0] + "," + currentLine[1]);
                        patientsList.get(patientsList.size()-1).addTestResult(patientmri);

                        // Adds mri test fee to bill if it has result (15000)
                        currentPatientbill += patientsList.get(patientsList.size()-1).getMriResult().getFee();
                    } catch (Exception e) {
                    //    Didn't find a mri test for this patient in bloodtest.txt
                    }

                    try {
                        BloodTest patientBloodTest = bloodTestList.get(currentLine[0] + "," + currentLine[1]);
                        patientsList.get(patientsList.size()-1).addTestResult(patientBloodTest);

                        // Adds blood test result fee to bill if it has result (500)
                        currentPatientbill += patientsList.get(patientsList.size()-1).getBloodTestResult().getFee();
                    } catch (Exception e) {
                    //    Didn't find a blood test for this patient in bloodtest.txt
                    }

                    currentPatientbill += patientsList.get(patientsList.size()-1).getPrescription().getPrice();
                    // adds specific doctor fee to bill
                    currentPatientbill += patientsList.get(patientsList.size()-1).getAssignedStaff().getFee();

                    // sets the bill to patient

                    patientsList.get(patientsList.size()-1).setBill(currentPatientbill);
                    

                    line = bReader.readLine(); // read next line
            }
            
            bReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        return patientsList;
    }
    
    public static ArrayList<Staff> readDoctorsDatabase() {              // Returns an arraylist of all of the staff after reading the text file
        
        ArrayList<Staff> doctorsList = new ArrayList<Staff>();
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(new File("doctors.txt")));

            String line = bReader.readLine(); // The first line

            while (line != null) {
                    String[] currentLine = line.split(",");
                    
                    if (currentLine[2].equals("Nurse"))                  doctorsList.add(new Nurse(currentLine[0], currentLine[1]));
                    else if (currentLine[2].equals("Cardiologist"))      doctorsList.add(new Cardiologist(currentLine[0], currentLine[1]));
                    else if (currentLine[2].equals("Neurologist"))       doctorsList.add(new Neurologist(currentLine[0], currentLine[1]));
                    else if (currentLine[2].equals("Oncologist"))        doctorsList.add(new Oncologist(currentLine[0], currentLine[1]));
                    line = bReader.readLine(); // read next line
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return doctorsList;
    }

    public static DefaultTableModel initPatientsTableModel() {          // Initializes the Patient Table Data
        DefaultTableModel patientsTableModel = new DefaultTableModel();

        patientsTableModel.setColumnIdentifiers(new String[]{
            "Last Name", "First Name", "Age", "Gender", "Blood Type", "Illness", "Prescription", "Insured", "Assigned Staff", "Bill", "TEST RESULTS"});

            for (Patient o : readPatientsDatabase()) {
                patientsTableModel.addRow(new Object[]{
                    o.getLastName(), 
                    o.getFirstName(), 
                    o.getAge(),
                    o.getGender(), 
                    o.getBloodType(), 
                    o.getIllness(), 
                    o.getPrescription().getName(), 
                    o.getInsured(), 
                    o.getAssignedStaff().getLastName() + ", " + o.getAssignedStaff().getFirstName(), 
                    "₱" + new java.text.DecimalFormat("0.00").format(o.getBill()), "CHECK"});
            }

            return patientsTableModel;
    }
    

    public static DefaultTableModel initDoctorsTableModel() {           // gets the entire doctors.txt to display when you open the Doctors table frame
        DefaultTableModel doctorsTableModel = new DefaultTableModel();  // The model data to be used for the table
                
        doctorsTableModel.setColumnIdentifiers(new String[]{"Last Name", "First Name", "Occupation"});
        
        for (Staff o : readDoctorsDatabase()) {
            // System.out.println(o.getLastName());
            doctorsTableModel.addRow(new Object[]{o.getLastName(), o.getFirstName(), o.getClass().getSimpleName()});
        }
        
        return doctorsTableModel;
    }

    public static DefaultTableModel getPatientBillTableModel(Patient patient) {           // gets the individual fees to put into a bill table of a patient
        DefaultTableModel patientBillModel = new DefaultTableModel();  // The model data to be used for the table
        java.text.DecimalFormat twoPlaces = new java.text.DecimalFormat("0.00");
        double originalFee = 0;

        double doctorFee = patient.getAssignedStaff().getFee(); originalFee += doctorFee;
        double prescriptionFee = patient.getPrescription().getPrice(); originalFee += prescriptionFee;

        patientBillModel.setColumnIdentifiers(new String[]{"DESCRIPTION", "COST"});

        patientBillModel.addRow(new Object[]{patient.getAssignedStaff().getClass().getSimpleName(), "₱" + twoPlaces.format(doctorFee)});

        if (patient.getBloodTestResult() != null) {
            double bloodTestFee = patient.getBloodTestResult().getFee();

            patientBillModel.addRow(new Object[]{"Blood Test", "₱" + twoPlaces.format(bloodTestFee)});
            originalFee += bloodTestFee;
        }
        if (patient.getMriResult() != null) {
            double mriFee = patient.getMriResult().getFee();

            patientBillModel.addRow(new Object[]{"MRI Scan", "₱" + twoPlaces.format(mriFee)});
            originalFee += mriFee;
        }

        patientBillModel.addRow(new Object[]{patient.getPrescription().getName(), "₱" + twoPlaces.format(prescriptionFee)});

        if      (patient.getClass().getSimpleName().equals("InsuredPatient"))       patientBillModel.addRow(new Object[]{"Insurance", "-₱" + twoPlaces.format(originalFee - patient.getBill())});
        else if (patient.getClass().getSimpleName().equals("SeniorCitizenPatient")) patientBillModel.addRow(new Object[]{"Senior Discount", "-₱" + twoPlaces.format(originalFee - patient.getBill())});

        return patientBillModel;
    }
    
    public static int countOccupations(String occupation) {             // used solely to identify number of rows for 2d array row size by counting how many occupations in the database
        int counter = 0;
        for (Staff o : readDoctorsDatabase()) {
            if (o.getClass().getSimpleName().equals(occupation))    counter++;
        }
        
        return counter;
    }
    
    public static String[][] updateDoctors() {                          // used to update Doctors database table to show every staff
        String[][] objArr = new String[readDoctorsDatabase().size()][3];

        int i = 0;
        for (Staff o : readDoctorsDatabase()) {
            objArr[i][0] = o.getLastName();
            objArr[i][1] = o.getFirstName();
            objArr[i][2] = o.getClass().getSimpleName();
            i++;
        }

        return objArr;                                                  // setDataVactor() asks for String[][] so i cant use a resizable array
    }
    
    public static String[][] updateDoctors(String occupation) {         // updates Doctors database table to only show specific occupation
        String[][] objArr = new String[countOccupations(occupation)][3];// number of rows is calculated by method to identify how many occupations in the database
        
        int i = 0;
        for (Staff o : readDoctorsDatabase()) {                         
            if (o.getClass().getSimpleName().equals(occupation)) {
                objArr[i][0] = o.getLastName();
                objArr[i][1] = o.getFirstName();
                objArr[i][2] = o.getClass().getSimpleName();
                i++;
                
            }
        }

        return objArr;                                                  // setDataVactor() asks for String[][] so i cant use a resizable array
    }

    //       
    public static Staff assignDoctor(String occupation) {               // returns a random doctor based on a specified occupation
        ArrayList<Staff> occupationList = new ArrayList<Staff>();
        for (Staff o : readDoctorsDatabase()) {
            if (o.getClass().getSimpleName().equals(occupation))    occupationList.add(o);
        }

        return occupationList.get(new java.util.Random().nextInt(occupationList.size()));
    }
    
    public static void writeToDoctors(String lineToWrite) {                        // Use this when adding a new doctor to the database (it needs a staff object parameter)
        BufferedReader br = null; BufferedWriter bw = null;
        // String lineToWrite =  o.getLastName() + "," + o.getFirstName() + "," + o.getClass().getSimpleName();

        try {
            br = new BufferedReader(new FileReader(new File("doctors.txt")));
            bw = new BufferedWriter(new FileWriter(new File("doctors.txt"), true));

               int rowIndex = 0;
            while ((br.readLine()) != null) { // while (bufferedreader does not read a line that doesnt contain nothing) { add number of lines read by the bufferedreader by 1 }
                rowIndex++; 
            }

            if (rowIndex > 0) bw.newLine(); // writes a new line after the last row of content so that it doesnt overwrite it
            bw.write(lineToWrite); br.close(); bw.close(); // writes the actual line

        } catch (Exception e) {
             e.printStackTrace();
        }

    }

    public static void writeToPatients(String lineToWrite) { // ur supposed to have the line ready for writing
        BufferedReader br = null; BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File("patients.txt")));
            bw = new BufferedWriter(new FileWriter(new File("patients.txt"), true));

               int rowIndex = 0;
            while ((br.readLine()) != null) { // while (bufferedreader does not read a line that doesnt contain nothing) { add number of lines read by the bufferedreader by 1 }
                rowIndex++; 
            }

            if (rowIndex > 0) bw.newLine(); // writes a new line after the last row of content so that it doesnt overwrite it
            bw.write(lineToWrite); br.close(); bw.close(); // writes the actual line

        } catch (Exception e) {
             e.printStackTrace();
        }
    }

    public static void writeToBloodTest(String lineToWrite) { // ur supposed to have the line ready for writing
        BufferedReader br = null; BufferedWriter bw = null;
        System.out.println(lineToWrite);
        try {
            br = new BufferedReader(new FileReader(new File("bloodtest.txt")));
            bw = new BufferedWriter(new FileWriter(new File("bloodtest.txt"), true));

               int rowIndex = 0;
            while ((br.readLine()) != null) { // while (bufferedreader does not read a line that doesnt contain nothing) { add number of lines read by the bufferedreader by 1 }
                rowIndex++; 
            }

            if (rowIndex > 0) bw.newLine(); // writes a new line after the last row of content so that it doesnt overwrite it
            bw.write(lineToWrite); br.close(); bw.close(); // writes the actual line

        } catch (Exception e) {
             e.printStackTrace();
        }
    }

    public static void writeToMRI(String lineToWrite) {
        BufferedReader br = null; BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(new File("mri.txt")));
            bw = new BufferedWriter(new FileWriter(new File("mri.txt"), true));

               int rowIndex = 0;
            while ((br.readLine()) != null) { // while (bufferedreader does not read a line that doesnt contain nothing) { add number of lines read by the bufferedreader by 1 }
                rowIndex++; 
            }

            if (rowIndex > 0) bw.newLine(); // writes a new line after the last row of content so that it doesnt overwrite it
            bw.write(lineToWrite); br.close(); bw.close(); // writes the actual line

        } catch (Exception e) {
             e.printStackTrace();
        }
    }

    // use this to test your reader functions
    // public static void main(String[] args) {
    //     ArrayList<Patient> test = readPatientsDatabase();

    //     for (Patient o : test) {
    //         System.out.println(o.getAssignedStaff().getClass().getSimpleName());
    //     }
    // }
}
