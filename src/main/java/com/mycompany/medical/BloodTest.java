package com.mycompany.medical;

public class BloodTest implements TestResult {
    private double fee = 500; // if you plan on changing the fee, please change it too in PatientForm.java

    // Blood Count
    private double sugar;           // 76.36 - 110.91 mg/dL
    private double cholesterol;     // 0.00 - 200.00 mg/dL
    private double triglycerides;   // 35.40 - 132.74 mg/dL
    private double creatinine;      // 0.40 - 1.40 mg/dL
    private double uricAcid;        // 2.40 - 8.00 mg/dL

    BloodTest(double sugar, double cholesterol, double triglycerides, double creatinine, double uricAcid) {
        this.sugar = sugar;
        this.cholesterol = cholesterol;
        this.triglycerides = triglycerides;
        this.creatinine = creatinine;
        this.uricAcid = uricAcid;
    }

    //------------------------------------------Blood Count-----------------------------------------//
    public double getSugar() {
        return sugar;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public double getTriglycerides() {
        return triglycerides;
    }

    public double getCreatinine() {
        return creatinine;
    }

    public double getUricAcid() {
        return uricAcid;
    }


    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }

    public void setTriglycerides(double triglycerides) {
        this.triglycerides = triglycerides;
    }

    public void setCreatinine(double creatinine) {
        this.creatinine = creatinine;
    }



    //------------------------------------------Fee-----------------------------------------//
    @Override
    public double getFee() {
        return fee;
    }

    @Override
    public void setFee(double fee) { // use this set method if you want to adjust the default cost
        this.fee = fee;
    }
}
