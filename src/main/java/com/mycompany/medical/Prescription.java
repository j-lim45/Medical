package com.mycompany.medical;

public class Prescription {
    private String genericName;
    private double price;

    public String getGenericName() {
        return genericName;
    }

    public double getPrice() {
        return price;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}