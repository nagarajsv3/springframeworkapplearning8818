package com.nsv.springframework.xmlplusannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("shapeCreator")
public class ShapeCreator {

    @Autowired
    @Qualifier("rectangle")
    private Shape shape;

    public ShapeCreator() {
    }

    public ShapeCreator(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
