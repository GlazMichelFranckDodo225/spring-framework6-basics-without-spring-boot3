package com.dgmf.xmlbasedConfig.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MyFirstBean myFirstBean = (MyFirstBean) context.getBean("myFirstBean");
        System.out.println(myFirstBean);
    }
}
