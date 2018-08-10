package com.nsv.springframework.springbeanprofilesjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


public class SpringProfileJavaConfigMain {

    public static void main(String[] args) {

        System.setProperty("spring.profiles.active","dev");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Author author = applicationContext.getBean(Author.class);
        System.out.println(author.getTitle());


        ((AnnotationConfigApplicationContext)applicationContext).close();

    }

}
