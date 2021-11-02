package ru.bfu;

public class RECTANGLE implements Shape {
    //Задаём 4 точки, потому что стороны не обязательно перпендикулярны координатным осям
    protected double[] pointA = new double[2];
    protected double[] pointB = new double[2];
    protected double[] pointC = new double[2];
    protected double[] pointD = new double[2];

    RECTANGLE() {
    }

    RECTANGLE(double Ax, double Ay, double Bx, double By, double Cx, double Cy, double Dx, double Dy) {
        pointA[0] = Ax;
        pointA[1] = Ay;
        pointB[0] = Bx;
        pointB[1] = By;
        pointC[0] = Cx;
        pointC[1] = Cy;
        pointD[0] = Dx;
        pointD[1] = Dy;
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
