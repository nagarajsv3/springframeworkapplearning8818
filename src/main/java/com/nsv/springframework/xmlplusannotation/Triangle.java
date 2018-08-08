package com.nsv.springframework.xmlplusannotation;

import org.springframework.stereotype.Component;

@Component("triangle")
public class Triangle implements Shape {
    public void drawShape() {
        System.out.println("Drawing-Triangle");
    }
}
