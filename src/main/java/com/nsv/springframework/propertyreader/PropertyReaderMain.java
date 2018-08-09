package com.nsv.springframework.propertyreader;

import com.nsv.springframework.loosecoupling.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyReaderMain {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("propertyReader.xml");
        Author author = applicationContext.getBean("author", Author.class);
        System.out.println(author.getTitle());
        System.out.println(author.getDbUserName());
        ((ClassPathXmlApplicationContext)applicationContext).close();

    }
}
