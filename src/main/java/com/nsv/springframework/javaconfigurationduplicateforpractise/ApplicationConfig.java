package com.nsv.springframework.javaconfigurationduplicateforpractise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Circle getCircle(){
        return new Circle();
    }

    @Bean
    public Rectangle getRectangle(){
        return new Rectangle();
    }

    @Bean
    public Triangle getTriangle(){
        return new Triangle();
    }

    @Bean
    public ShapeCreator getShapeCreator(){
        return new ShapeCreator(getRectangle());
    }


}
