package com.nsv.springframework.beanwiring;

public class ShapeCreator {

    private Shape shape;

    public ShapeCreator() {
    }

    public ShapeCreator(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }

    //Autowiring by name
    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
