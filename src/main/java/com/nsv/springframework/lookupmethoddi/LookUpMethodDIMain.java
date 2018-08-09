package com.nsv.springframework.lookupmethoddi;

import com.nsv.springframework.loosecoupling.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookUpMethodDIMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lookupmethoddi.xml");
        SingletonClass singletonClass = applicationContext.getBean(SingletonClass.class);
        //PrototypeClass prototypeClassInstance = singletonClass.getPrototypeClass();
        PrototypeClass prototypeClassInstance = singletonClass.getPrototypeClassInstance();
        prototypeClassInstance.print();
        System.out.println(singletonClass);
        System.out.println(prototypeClassInstance);

        SingletonClass singletonClass1 = applicationContext.getBean(SingletonClass.class);
        //PrototypeClass prototypeClassInstance1= singletonClass.getPrototypeClass();
        PrototypeClass prototypeClassInstance1 = singletonClass1.getPrototypeClassInstance();
        prototypeClassInstance1.print();
        System.out.println(singletonClass1);
        System.out.println(prototypeClassInstance1);

        ((ClassPathXmlApplicationContext)applicationContext).close();

    }
}
