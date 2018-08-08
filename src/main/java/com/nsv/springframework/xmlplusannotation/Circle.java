package com.nsv.springframework.xmlplusannotation;

import org.springframework.stereotype.Component;

@Component("circle")
public class Circle implements Shape {
    public void drawShape() {
        System.out.println("Drawing - Circle");
    }
}
