package ru.bfu;

public class Circle extends ELLIPSE implements WithRadius {

    Circle() {
    }

    Circle(int centreOfCircleX, int centreOfCircleY, double radiusOfCircle) {
        this.centreOfEllipse[0] = centreOfCircleX;
        this.centreOfEllipse[1] = centreOfCircleY;
        this.semi_major_axis = radiusOfCircle;
    }

    @Override
    public double getRadius() {
        return semi_major_axis;
    }

    static Circle fromArea(double area) {
        return new Circle(0, 0, Math.sqrt(area/Math.PI));
    }

}
