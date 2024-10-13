package com.mycompany.medical;

public class BloodTest implements TestResult {
    private double fee = 500;

    // Blood Count
    private double sugar;           // 76.36 - 110.91 mg/dL
    private double cholesterol;     // 0.00 - 200.00 mg/dL
    private double triglycerides;   // 35.40 - 132.74 mg/dL
    private double creatinine;      // 0.40 - 1.40 mg/dL
    private double uricAcid;        // 2.40 - 8.00 mg/dL

    // Blood Chemistry
    // private double hemoglobin;      // 14.00 - 18.00 g/dl
    // private double hematocrit;      // 40.00 - 54.00 %
    // private double rbcCount;        // 4.00 - 6.10 x 10^12/L
    // private double wbcCount;        // 4.30 - 10.00 x 10^9/L

    // private double neutrophil;      // 44.20 - 80.20 %
    // private double lymphocytes;     // 28.00 - 48.00 %
    // private double monocytes;       // 3.00 - 6.00 %
    // private double eosinophils;     // 0.00 - 5.00%
    // private double plateletCount;   // 140.00 - 440.00 x 10^9/L

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
