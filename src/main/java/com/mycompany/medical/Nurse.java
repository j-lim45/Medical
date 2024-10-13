package com.mycompany.medical;

public class Nurse extends Staff {
    private String lastName, firstName;
    private double fee;

    public Nurse(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fee = 2000;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public double getFee() {
        return fee;
    }
}
