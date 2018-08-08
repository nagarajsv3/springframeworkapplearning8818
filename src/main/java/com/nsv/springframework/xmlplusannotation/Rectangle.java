package com.nsv.springframework.xmlplusannotation;

import org.springframework.stereotype.Component;

@Component("rectangle")
public class Rectangle implements Shape {
    public void drawShape() {
        System.out.println("Drawing- Rectangle");
    }
}
