package com.dgmf.dependencyinjection.constructordi;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayCarDetails() {
        System.out.println("Car Details : " + specification);
    }
}
