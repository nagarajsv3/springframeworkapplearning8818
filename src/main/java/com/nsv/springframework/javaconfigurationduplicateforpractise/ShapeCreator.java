package com.nsv.springframework.javaconfigurationduplicateforpractise;

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

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
