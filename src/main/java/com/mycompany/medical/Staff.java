package com.mycompany.medical;

public abstract class Staff { // extended to Doctor and Nurse
    protected String lastName, firstName;
    protected double fee;

    public abstract String getLastName();

    public abstract String getFirstName();

    public abstract double getFee();
}
