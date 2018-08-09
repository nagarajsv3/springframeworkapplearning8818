package com.nsv.springframework.javaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationSpringConfig.class);

        Author author = applicationContext.getBean(Author.class);
        author.print();
        System.out.println("title: property set using @Value(\"${}\"): "+author.getTitle());
        System.out.println("dbUserName: property set using @Value(\"${}\") : "+author.getDbUserName());

        System.out.println(author.getTitle());

        Circle circle1 = applicationContext.getBean(Circle.class);
        circle1.drawShape();
        Circle circle2 = applicationContext.getBean(Circle.class);
        Circle circle3 = applicationContext.getBean(Circle.class);

        System.out.println("*****Circle-Singleton**********");
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println("***************");




        Rectangle rectangle1 = applicationContext.getBean(Rectangle.class);
        Rectangle rectangle2 = applicationContext.getBean(Rectangle.class);
        Rectangle rectangle3 = applicationContext.getBean(Rectangle.class);
        System.out.println("*****Rectangle-Prototype**********");
        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println("***************");

        ShapeCreator shapeCreator = applicationContext.getBean(ShapeCreator.class);
        Shape shape = shapeCreator.getShape();
        shape.drawShape();

        ((AnnotationConfigApplicationContext)applicationContext).close();
    }
}
