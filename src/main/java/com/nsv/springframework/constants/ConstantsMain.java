package com.nsv.springframework.constants;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstantsMain {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("constants.xml");
        Employee emp1 = applicationContext.getBean(Employee.class);
        emp1.setName("Nagaraj");
        System.out.println(emp1.getName());
        System.out.println(emp1.getCompanyName());
        System.out.println(emp1.getCompanyLocations());
        System.out.println(emp1.getCompanyLocationsGlobalMap());
        System.out.println(emp1.getCompanyLocationsLocalMap());

        Employee emp2 = applicationContext.getBean(Employee.class);
        //emp1.setName("Nagaraj");
        System.out.println(emp2.getName());
        System.out.println(emp2.getCompanyName());


        ((ClassPathXmlApplicationContext)applicationContext).close();

    }
}
