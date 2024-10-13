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
import javax.swing.table.DefaultTableModel;
public class Reader {
    
    public static ArrayList<Staff> readDoctorsDatabase() {
        
        ArrayList<Staff> doctorsList = new ArrayList<Staff>();
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(new File("doctors.txt")));

            String line = bReader.readLine(); // The first line?

            while (line != null) {
                    String[] currentLine = line.split(",");
                    
                    if (currentLine[2].equals("Nurse"))                  doctorsList.add(new Nurse(currentLine[0], currentLine[1]));
                    else if (currentLine[2].equals("Cardiologist"))      doctorsList.add(new Cardiologist(currentLine[0], currentLine[1]));
                    else if (currentLine[2].equals("Dermatologist"))     doctorsList.add(new Dermatologist(currentLine[0], currentLine[1]));
                    else if (currentLine[2].equals("Neurologist"))       doctorsList.add(new Neurologist(currentLine[0], currentLine[1]));
                    else if (currentLine[2].equals("Oncologist"))        doctorsList.add(new Oncologist(currentLine[0], currentLine[1]));
                    else if (currentLine[2].equals("Opthalmologist"))    doctorsList.add(new Ophthalmologist(currentLine[0], currentLine[1]));
                    line = bReader.readLine(); // read next line
            }
            
//            for (Patient o : theArr) {
//                System.out.println(o.patientAge);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return doctorsList;
    }
    
    
    public static DefaultTableModel initDoctorsTableModel() {
        DefaultTableModel doctorsTableModel = new DefaultTableModel();  // The model data to be used for the table
                
        doctorsTableModel.setColumnIdentifiers(new String[]{"Last Name", "First Name", "Occupation"});
        
        for (Staff o : readDoctorsDatabase()) {
            System.out.println(o.getLastName());
            doctorsTableModel.addRow(new Object[]{o.getLastName(), o.getFirstName(), o.getClass().getSimpleName()});
        }
        
        return doctorsTableModel;
    }
    
    public static int countOccupations(String occupation) {
        int counter = 0;
        for (Staff o : readDoctorsDatabase()) {
            if (o.getClass().getSimpleName().equals(occupation))    counter++;
        }
        
        return counter;
    }
    
    public static String[][] updateDoctors() {
        String[][] objArr = new String[readDoctorsDatabase().size()][3];

        int i = 0;
        for (Staff o : readDoctorsDatabase()) {
            objArr[i][0] = o.getLastName();
            objArr[i][1] = o.getFirstName();
            objArr[i][2] = o.getClass().getSimpleName();
            i++;
        }

        return objArr;
    }
    
    public static String[][] updateDoctors(String occupation) {
        String[][] objArr = new String[countOccupations(occupation)][3];
        
        int i = 0;
        for (Staff o : readDoctorsDatabase()) {
            if (o.getClass().getSimpleName().equals(occupation)) {
                objArr[i][0] = o.getLastName();
                objArr[i][1] = o.getFirstName();
                objArr[i][2] = o.getClass().getSimpleName();
                i++;
                
            }
        }

        return objArr;
    }

    //       
    public static Staff assignDoctor(String occupation) {
        ArrayList<Staff> occupationList = new ArrayList<Staff>();
        for (Staff o : readDoctorsDatabase()) {
            if (o.getClass().getSimpleName().equals(occupation))    occupationList.add(o);
        }

        // returns a random staff specified from occupationList
        return occupationList.get(new java.util.Random().nextInt(occupationList.size()));
    }
    
}
