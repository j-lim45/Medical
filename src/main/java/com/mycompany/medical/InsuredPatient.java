package com.mycompany.medical;

public class InsuredPatient extends Patient {

    @Override
    public void setBill(double bill) {
        super.setBill(bill * 0.8); // deducts 20% from total bill
    }

    @Override
    public double getBill() {
        return super.getBill();
    }
}
