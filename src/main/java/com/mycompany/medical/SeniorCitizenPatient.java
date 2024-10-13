package com.mycompany.medical;

public class SeniorCitizenPatient extends Patient {
    
    @Override
    public void setBill(double bill) {
        super.setBill(bill * 0.75); // deducts 25% from total bill
    }

    @Override
    public double getBill() {
        return super.getBill();
    }
}
