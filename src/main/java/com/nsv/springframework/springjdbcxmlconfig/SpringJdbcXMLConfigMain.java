package com.nsv.springframework.springjdbcxmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class SpringJdbcXMLConfigMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springjdbc.xml");
        ClerkRepository clerkRepository = applicationContext.getBean(ClerkRepository.class);

        //Create Clerk
        Clerk clerk = new Clerk("James","456-45-6789",new Date(),null,true);
        int clerkId = clerkRepository.createClerk(clerk);
        System.out.println("ID Generated After Inserting Clerk: "+ clerkId);

        System.out.println("********READ clerk-BEGIN******");
        Clerk readClerk = clerkRepository.readClerk("456-45-6789");
        System.out.println(readClerk);
        System.out.println("********READ clerk-END******");


        //Create Clerk
        Clerk clerk1 = new Clerk("John","456-45-6799",new Date(),null,false);
        int clerkId1 = clerkRepository.createClerk(clerk1);
        System.out.println("ID Generated After Inserting Clerk: "+ clerkId1);

        //Read All Clerks
        List<Clerk> clerks = clerkRepository.readAllClerk();

        printAllClerks(clerks);

        System.out.println("********Update-BEGIN**********");

        //Update Clerk
        clerkRepository.updateClerk("Nagaraj","456-45-6789");
        clerkRepository.updateClerk("Varnekar","456-45-6799");

        clerks = clerkRepository.readAllClerk();
        printAllClerks(clerks);
        System.out.println("********Update-END**********");
        System.out.println("********Delete-BEGIN**********");
        //Delete Clerk
        clerkRepository.deleteClerk("456-45-6789");

        System.out.println("********Delete-END**********");
        clerks = clerkRepository.readAllClerk();
        printAllClerks(clerks);

        ((ClassPathXmlApplicationContext)applicationContext).close();

    }

    private static void printAllClerks(List<Clerk> clerks) {
        System.out.println("************************************");
        clerks.forEach(clerkObj -> {
            System.out.println(clerkObj);
        });
        System.out.println("************************************");
        clerks.forEach(clerktestObj -> {
            System.out.println(clerktestObj);
        });
        System.out.println("************************************");
    }
}
