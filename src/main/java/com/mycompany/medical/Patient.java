package com.mycompany.medical;

public class Patient {
    // Medical Records
    protected String lastName, firstName, age, bloodType;
    protected java.util.ArrayList<String> illnessList;
    protected boolean insured;
    
    // Hospital Records
    protected java.util.ArrayList<TestResult> testResultsList;
    protected java.util.ArrayList<Prescription> prescriptionList;
    protected Staff assignedStaff;
    protected double bill;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getAge() {
        return age;
    }

    public String getBloodType() {
        return bloodType;
    }


    public java.util.ArrayList<TestResult> getTestResultsList() {
        return testResultsList;
    }

    public java.util.ArrayList<Prescription> getPrescription() {
        return prescriptionList;
    }

    public Staff getAssignedDoctor() {
        return assignedStaff;
    }

    public double getBill() {
        return bill;
    }



    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    public void addIllness(String illness) {
        this.illnessList.add(illness);
    }

    public void addPrescription(Prescription prescription) {
        this.prescriptionList.add(prescription);
    }

    public void setAssignedStaff(Staff assignedStaff) {
        this.assignedStaff = assignedStaff;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
}
