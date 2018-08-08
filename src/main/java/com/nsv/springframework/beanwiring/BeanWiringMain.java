package com.nsv.springframework.beanwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanWiringMain {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanwiring.xml");
        ShapeCreator shapeCreator = applicationContext.getBean(ShapeCreator.class);
        Shape shape = shapeCreator.getShape();
        shape.drawShape();

        Circle circle = applicationContext.getBean(Circle.class);
        circle.drawShape();

        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
