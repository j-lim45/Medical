package com.mycompany.medical;

public class Neurologist extends Doctor {
    protected String lastName, firstName;
    protected double fee;

    public Neurologist(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fee = 10000;
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
