package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name = "Triangle";
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {

        return ((side * height)/2);
    }
}
