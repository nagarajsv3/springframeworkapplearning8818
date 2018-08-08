package com.nsv.springframework.xmlplusannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlPlusAnnotationMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("xmlplusanno.xml");
        ShapeCreator shapeCreator = applicationContext.getBean(ShapeCreator.class);
        Shape shape = shapeCreator.getShape();
        shape.drawShape();

        ShapeCreator1 shapeCreator1 = applicationContext.getBean(ShapeCreator1.class);
        Shape shape1 = shapeCreator1.getShape();
        System.out.println("*******************");
        shape1.drawShape();
        System.out.println("*******************");


        Circle circle = applicationContext.getBean(Circle.class);
        circle.drawShape();

        Rectangle rectangle = applicationContext.getBean(Rectangle.class);
        rectangle.drawShape();

        Triangle triangle = applicationContext.getBean("triangle", Triangle.class);
        triangle.drawShape();

        ((ClassPathXmlApplicationContext)applicationContext).close();

    }
}
