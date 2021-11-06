package ru.bfu;
import java.lang.Math;
import java.awt.*;
public class TRIANGLE implements Shape {
    private double[] pointA = new double[2];
    private double[] pointB = new double[2];
    private double[] pointC = new double[2];
    TRIANGLE(){}
    TRIANGLE(double a,double b,double c,double x,double y,double z){
        pointA[0] = a;
        pointA[1] = x;
        pointB[0] = b;
        pointB[1] = y;
        pointC[0] = c;
        pointC[1] = z;

    }

    @Override
    public double getArea() {
        double[] rectangleSides = new double[2];
        rectangleSides[0] = rectangleSideLength(pointA, pointB);
        rectangleSides[1] = rectangleSideLength(pointB, pointC);
        return rectangleSides[0] * rectangleSides[1];
    }
    private double rectangleSideLength(double[] firstPoint, double[] secondPoint) {
        return Math.sqrt(Math.pow(firstPoint[0] - secondPoint[0], 2)
                + Math.pow(firstPoint[1] - secondPoint[1], 2));
    }

    @Override
    public double getPerimeter() {
        double[] rectangleSides = new double[2];
        rectangleSides[0] = rectangleSideLength(pointA, pointB);
        rectangleSides[1] = rectangleSideLength(pointB, pointC);
        return 2 * (rectangleSides[0] + rectangleSides[1]);
    }

    @Override
    public ShapeType getType() {
        return ShapeType.RECTANGLE;
    }
}
