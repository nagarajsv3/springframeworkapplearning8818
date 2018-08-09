package com.nsv.springframework.javaconfigurationduplicateforpractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaApplicationMain {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Triangle triangle = applicationContext.getBean(Triangle.class);
        triangle.drawShape();

        ShapeCreator shapeCreator = applicationContext.getBean(ShapeCreator.class);
        Shape shape = shapeCreator.getShape();
        shape.drawShape();
        ((AnnotationConfigApplicationContext)applicationContext).close();

    }
}
