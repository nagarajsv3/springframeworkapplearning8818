package com.nsv.springframework.springjdbcjavaconfigduplicateforpractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.List;

public class SpringJdbcJavaConfigMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppJavaConfig.class);
        ClerkRepositoy clerkRepositoy = applicationContext.getBean(ClerkRepositoy.class);
        Clerk clerk = new Clerk("888-45-6888","Nagaraja",new Date(),null,true);
        Clerk clerk2 = new Clerk("888-45-6799","Varnekar",new Date(),null,true);

        int iclerk1 = clerkRepositoy.createClerk(clerk);
        int iclerk2 = clerkRepositoy.createClerk(clerk2);

        System.out.println(iclerk1);

        Clerk readclerk1 = clerkRepositoy.readClerk("888-45-6888");
        System.out.println("clerk read:"+readclerk1);

        System.out.println("****Read All-BEGIN*****");
        List<Clerk> clerks = clerkRepositoy.readAllClerk();
        clerks.forEach(c -> {
            System.out.println(c);
        });
        System.out.println("****Read All-END*****");

        clerkRepositoy.updateClerk("NSV","888-45-6888");
        System.out.println("Updated Clerk"+clerkRepositoy.readClerk("888-45-6888"));

        clerkRepositoy.deleteClerk("888-45-6888");
        System.out.println("After Delete");
        clerks = clerkRepositoy.readAllClerk();
        clerks.forEach(c -> {
            System.out.println(c);
        });


        ((AnnotationConfigApplicationContext)applicationContext).close();

    }
}
