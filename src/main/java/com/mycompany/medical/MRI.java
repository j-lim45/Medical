package com.mycompany.medical;

public class MRI implements TestResult {
    protected double fee = 15000;
    protected String findings;
    protected String impression;

    MRI(String findings, String impressions) {
        this.findings = findings;
        this.impression = impressions;
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
