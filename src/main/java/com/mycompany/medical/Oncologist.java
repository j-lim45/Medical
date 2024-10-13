package com.mycompany.medical;

public class Oncologist extends Doctor {
    protected String lastName, firstName;
    protected double fee;

    public Oncologist(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fee = 15000;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    public double getFee() {
        return fee;
    }
}
