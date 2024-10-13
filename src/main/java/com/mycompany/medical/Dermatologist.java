package com.mycompany.medical;

public class Dermatologist extends Doctor {
    protected String lastName, firstName;
    protected double fee;

    public Dermatologist(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fee = 5000;
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