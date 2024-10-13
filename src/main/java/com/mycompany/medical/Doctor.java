package com.mycompany.medical;

public abstract class Doctor extends Staff {
    protected String lastName, firstName;
    protected double fee;

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
