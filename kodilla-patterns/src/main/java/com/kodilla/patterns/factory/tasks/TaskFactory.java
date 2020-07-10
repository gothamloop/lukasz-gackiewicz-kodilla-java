package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Buy this", "Water pomp",1.0);
            case PAINTING:
                return new PaintingTask("Paint this", "White","Wall");
            case DRIVING:
                return new DrivingTask("Drive there", "Shop", "Car");
            default:
                return null;
        }

    }
}
