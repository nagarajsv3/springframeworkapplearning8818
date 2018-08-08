package com.nsv.springframework.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ShapeCreator shapeCreator = applicationContext.getBean(ShapeCreator.class);
        Shape shape = shapeCreator.getShape();
        shape.drawShape();

        Circle circle = applicationContext.getBean(Circle.class);
        circle.drawShape();

        Rectangle rectangle = applicationContext.getBean(Rectangle.class);
        rectangle.drawShape();

        Triangle triangle = applicationContext.getBean("triangle", Triangle.class);
        triangle.drawShape();

        ((ClassPathXmlApplicationContext)applicationContext).close();

    }
}
