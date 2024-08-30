package com.dgmf.dependencyinjection.constructordi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDIDriver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationConstructorInjection.xml"
        );

        CarConstructorDI myCar = (CarConstructorDI) context.getBean("car");
        myCar.displayCarDetails();
    }
}
