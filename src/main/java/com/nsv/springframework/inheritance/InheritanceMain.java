package com.nsv.springframework.inheritance;

import com.nsv.springframework.propertyreader.Author;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("inheritance.xml");
        Contractor contractor = applicationContext.getBean("contractor", Contractor.class);
        System.out.println(contractor.getCompanyName());
        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
