package com.nsv.springframework.xmlplusannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//@Component("shapeCreator")
public class ShapeCreator1 {

    @Autowired
    @Qualifier("circle")
    private Shape shape;

    public ShapeCreator1() {
    }

    public ShapeCreator1(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
