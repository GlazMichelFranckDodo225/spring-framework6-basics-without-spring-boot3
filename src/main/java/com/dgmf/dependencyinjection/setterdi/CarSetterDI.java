package com.dgmf.dependencyinjection.setterdi;

public class CarSetterDI {
    private SpecificationSetterDI specificationSetterDI;

    public void setSpecificationSetterDI(SpecificationSetterDI specificationSetterDI) {
        this.specificationSetterDI = specificationSetterDI;
    }

    public void displayCarDetails() {
        System.out.println("Car Details | - Setter DI : " + specificationSetterDI);
    }
}
