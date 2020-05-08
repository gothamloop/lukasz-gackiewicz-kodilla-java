package com.kodilla.testing.shape;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite {

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
        Shape shape = new Circle(1);
        shapeCollector.addFigure(shape);
        assertEquals(1, shapeCollector.getGeometricShapes().size());
    }
}

