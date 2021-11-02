package ru.bfu;

public interface ShapeCalculator {
    default double getArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) sum += shape.getArea();
        return sum;
    }
}
