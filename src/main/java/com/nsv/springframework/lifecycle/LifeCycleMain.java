package com.nsv.springframework.lifecycle;

import com.nsv.springframework.lookupmethoddi.PrototypeClass;
import com.nsv.springframework.lookupmethoddi.SingletonClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lifecycle.xml");
        Author author = applicationContext.getBean(Author.class);
        System.out.println(author);
        System.out.println(author.getName());
        //System.out.println(author.getBook().getTitle());

        ((ClassPathXmlApplicationContext)applicationContext).close();

    }
}
