package ru.bfu;

public class ELLIPSE {
    protected double[] centreOfEllipse = new double[2];
    protected double semi_major_axis, semi_minor_axis; //большая и малая полуоси соответственно

    ELLIPSE() {
    }

    ELLIPSE(double centreOfEllipseX, double centreOfEllipseY, double semi_major_axis, double semi_minor_axis) {
        centreOfEllipse[0] = centreOfEllipseX;
        centreOfEllipse[1] = centreOfEllipseY;
        this.semi_major_axis = semi_major_axis;
        this.semi_minor_axis = semi_minor_axis;
    }

    public double getArea() {
        return Math.PI * semi_major_axis * semi_minor_axis;
    }

    public double getPerimeter() {
        return 4 * ((getArea() + (semi_major_axis - semi_minor_axis)) / (semi_major_axis + semi_minor_axis));
    }

    public ShapeType getType() {
        return ShapeType.ELLIPSE;
    }
}
