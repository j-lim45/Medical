package com.mycompany.medical;

public abstract class TestResult {

    // BAND AID SOLUTION
    public abstract double getSugar();
    public abstract double getCholesterol();
    public abstract double getTriglycerides();
    public abstract double getCreatinine();
    public abstract double getUricAcid();
    public abstract void setSugar(double sugar);
    public abstract void setCholesterol(double cholesterol);
    public abstract void setTriglycerides(double triglycerides);
    public abstract void setCreatinine(double creatinine);


    public abstract String getFindings();

    public abstract String getImpression();



    public abstract void setFindings(String findings);

    public abstract void setImpression(String impression);



    public abstract void setFee(double fee);
    public abstract double getFee();
}