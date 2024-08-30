package com.dgmf.dependencyinjection.constructordi;

public class CarConstructorDI {
    private SpecificationConstructorDI specificationConstructorDI;

    public CarConstructorDI(SpecificationConstructorDI specificationConstructorDI) {
        this.specificationConstructorDI = specificationConstructorDI;
    }

    public void displayCarDetails() {
        System.out.println("Car Details : " + specificationConstructorDI);
    }
}
