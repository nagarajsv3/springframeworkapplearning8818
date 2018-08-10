package com.nsv.springframework.springjdbcxmlconfigduplicateforpractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class SpringJdbcXMLMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springjdbcxmlconfigduplicateforpractise.xml");
        ClerkRepositoy clerkRepositoy = applicationContext.getBean(ClerkRepositoy.class);
        Clerk clerk = new Clerk("456-45-6789","Nagaraja",new Date(),null,true);
        Clerk clerk2 = new Clerk("456-45-6799","Varnekar",new Date(),null,true);

        int iclerk1 = clerkRepositoy.createClerk(clerk);
        int iclerk2 = clerkRepositoy.createClerk(clerk2);

        System.out.println(iclerk1);

        Clerk readclerk1 = clerkRepositoy.readClerk("456-45-6789");
        System.out.println("clerk read:"+readclerk1);

        System.out.println("****Read All-BEGIN*****");
        List<Clerk> clerks = clerkRepositoy.readAllClerk();
        clerks.forEach(c -> {
            System.out.println(c);
        });
        System.out.println("****Read All-END*****");

        clerkRepositoy.updateClerk("NSV","456-45-6789");
        System.out.println("Updated Clerk"+clerkRepositoy.readClerk("456-45-6789"));

        clerkRepositoy.deleteClerk("456-45-6789");
        System.out.println("After Delete");
        clerks = clerkRepositoy.readAllClerk();
        clerks.forEach(c -> {
            System.out.println(c);
        });


        ((ClassPathXmlApplicationContext)applicationContext).close();

    }
}
