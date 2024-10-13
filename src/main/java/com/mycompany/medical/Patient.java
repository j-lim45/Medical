package com.mycompany.medical;

public class Patient {
    // Medical Records
    protected String lastName, firstName, age, bloodType;
    protected String illness;
    protected boolean insured;
    
    // Hospital Records
    protected java.util.HashMap<String, TestResult> testResultsList;
    protected String prescription;
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

    public String getIllness() {
        return illness;
    }

    public String getPrescription() {
        return prescription;
    }

    public java.util.HashMap<String, TestResult> getTestResultsList() {
        return testResultsList;
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

    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public void addTestResult(TestResult testResult) { // testResultsList<"BloodTest", someObjName>
        testResultsList.put(testResult.getClass().getSimpleName(), testResult);
    }

    public void setAssignedStaff(Staff assignedStaff) {
        this.assignedStaff = assignedStaff;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }
}
