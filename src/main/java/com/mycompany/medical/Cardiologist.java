package com.mycompany.medical;

public class Cardiologist extends Doctor {
    protected String lastName, firstName;
    protected double fee;

    public Cardiologist(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fee = 7500;
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