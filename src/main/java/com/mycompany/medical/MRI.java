package com.mycompany.medical;

public class MRI extends TestResult {
    protected double fee = 15000; // if you plan on changing the fee, please change it too in PatientForm.java
    protected String findings;
    protected String impression;


    MRI(String findings, String impressions) {
        this.findings = findings;
        this.impression = impressions;
    }

    // TO DO : VERY BANDAID SOLUTION PLEASE FIXXXXXXXXXXXXXXXXXXXXXXXX
    public double getSugar() {
        return 1;
    }

    public double getCholesterol() {
        return 1;
    }

    public double getTriglycerides() {
        return 1;
    }

    public double getCreatinine() {
        return 1;
    }

    public double getUricAcid() {
        return 1;
    }


    public void setSugar(double sugar) {
        
    }

    public void setCholesterol(double cholesterol) {
    }

    public void setTriglycerides(double triglycerides) {
    }

    public void setCreatinine(double creatinine) {
    }

    @Override
    public double getFee() {
        return fee;
    }

    public String getFindings() {
        return findings;
    }

    public String getImpression() {
        return impression;
    }

    @Override
    public void setFee(double fee) { // use this set method if you want to adjust the default cost
        this.fee = fee;
    }

    public void setFindings(String findings) {
        this.findings = findings;
    }

    public void setImpression(String impression) {
        this.impression = impression;
    }
}
