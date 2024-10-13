package com.mycompany.medical;

public class Ophthalmologist extends Doctor {
    protected String lastName, firstName;
    protected double fee;

    public Ophthalmologist(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fee = 8000;
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
