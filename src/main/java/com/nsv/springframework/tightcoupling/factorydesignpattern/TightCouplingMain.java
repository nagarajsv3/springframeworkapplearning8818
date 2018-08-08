package com.nsv.springframework.tightcoupling.factorydesignpattern;

public class TightCouplingMain {

    public static void main(String[] args) {

        Circle c1= new Circle();
        Circle c2 = new Circle();
        Shape s1 = new Circle();
        Shape s2 = new Triangle();


        Shape s3 = ShapeFactory.getShape("circle");
        Shape s4 = ShapeFactory.getShape("circle");




    }
}
