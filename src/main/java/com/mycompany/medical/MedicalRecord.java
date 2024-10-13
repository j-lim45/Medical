package com.mycompany.medical;

public class MedicalRecord {
    int age;
    double weight; // kg
    double height; // cm
    java.util.List<String> illnessList;

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public java.util.List<String> getIllness() {
        return illnessList;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public void addIllness(String illness) {
        this.illnessList.add(illness);
    }
}
