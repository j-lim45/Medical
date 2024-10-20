package com.mycompany.medical;

import java.util.HashMap;

public class Patient {
    // Medical Records
    protected String lastName, firstName, age, bloodType, gender;
    protected String illness;
    protected boolean insured;
    
    // Hospital Records
    // protected java.util.HashMap<String, TestResult> testResultsList = new HashMap<String, TestResult>();
    protected BloodTest bloodTestResult;
    protected MRI mriResult;
    protected Prescription prescription;
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

    public String getGender() {
        return gender;
    }

    public String getIllness() {
        return illness;
    }

    public boolean getInsured() {
        return insured;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public BloodTest getBloodTestResult() {
        return bloodTestResult;
    }
    public MRI getMriResult() {
        return mriResult;
    }

    

    public Staff getAssignedStaff() {
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

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public void addTestResult(BloodTest testResult) {
        this.bloodTestResult = testResult;
    }

    public void addTestResult(MRI testResult) {
        this.mriResult = testResult;
    }


    public void setAssignedStaff(Staff assignedStaff) {
        this.assignedStaff = assignedStaff;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
}
