package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private final ArrayList<Shape> geometricShapes = new ArrayList<Shape>();


    public ArrayList<Shape> getGeometricShapes() {
        return geometricShapes;
    }


    public void addFigure(Shape shape){
        geometricShapes.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return geometricShapes.remove(shape);
    }

    public Shape getFigure(int n){
        return geometricShapes.get(n);
    }

    public void showFigures(){
        System.out.println(geometricShapes);
    }

}
