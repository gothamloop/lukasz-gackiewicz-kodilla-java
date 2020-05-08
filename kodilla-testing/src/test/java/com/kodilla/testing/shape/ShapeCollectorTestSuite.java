package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {

    private Shape shape;

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testAddFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        assertEquals(1, shapeCollector.getGeometricShapes().size());
    }

    @Test
    public void testRemoveFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        boolean result = shapeCollector.removeFigure(shape);
        Assert.assertTrue(result);
        assertEquals(0, shapeCollector.getGeometricShapes().size());
    }

    @Test
    public void testShowFigures(){

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        ArrayList<Shape> geometricShapes = new ArrayList<Shape>();
        geometricShapes.add(shape);
        ArrayList<Shape> shapesFinalList = shapeCollector.getGeometricShapes();
        assertEquals(geometricShapes.toString(), shapesFinalList.toString());
    }


}

