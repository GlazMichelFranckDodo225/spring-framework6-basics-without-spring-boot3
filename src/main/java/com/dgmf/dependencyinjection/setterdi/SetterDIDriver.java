package com.dgmf.dependencyinjection.setterdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDIDriver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationSetterInjection.xml"
        );

        CarSetterDI myCar = (CarSetterDI) context.getBean("carSetterDI");
        myCar.displayCarDetails();
    }
}
