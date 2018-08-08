package com.nsv.springframework.tightcoupling.factorydesignpattern;

public class ShapeFactory {

    public static Shape getShape(String shape){
        if(shape.equals("circle")){
            return new Circle();
        }else if(shape.equals("rectangle")){
            return new Rectangle();
        }else{
            return new Triangle();
        }
    }

}
