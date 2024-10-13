package com.mycompany.medical;

public class CTScan implements TestResult {
    private double fee = 12000;
    private String findings;
    private String impression;

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
