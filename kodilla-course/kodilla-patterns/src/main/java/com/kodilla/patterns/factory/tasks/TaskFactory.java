package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task makeTask(String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Weekend shopping", "clothes", 4);
            case PAINTING:
                return new PaintingTask("Bedroom renovation", "pink", "walls");
            case DRIVING:
                return new DrivingTask("Standard night route", "Warszawa-Centrum", "BMW");
            default:
                return null;
        }
    }
}