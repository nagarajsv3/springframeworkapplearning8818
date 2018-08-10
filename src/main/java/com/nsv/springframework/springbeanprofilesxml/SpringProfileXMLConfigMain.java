package com.nsv.springframework.springbeanprofilesxml;

import com.nsv.springframework.springjdbcxmlconfig.Clerk;
import com.nsv.springframework.springjdbcxmlconfig.ClerkRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

public class SpringProfileXMLConfigMain {

    public static void main(String[] args) {

        System.setProperty("spring.profiles.active","prod");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springbeanprofile.xml");
        Author author = applicationContext.getBean(Author.class);
        Book book = applicationContext.getBean(Book.class);
        System.out.println(author.getTitle());
        System.out.println(book.getName());


        ((ClassPathXmlApplicationContext)applicationContext).close();

    }

}
