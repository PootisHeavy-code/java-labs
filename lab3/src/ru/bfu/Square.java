package ru.bfu;

public class Square extends RECTANGLE {
    Square() {
    }

    Square(double Ax, double Ay, double Bx, double By, double Cx, double Cy, double Dx, double Dy) {
        this.pointA[0] = Ax;
        this.pointA[1] = Ay;
        this.pointB[0] = Bx;
        this.pointB[1] = By;
        this.pointC[0] = Cx;
        this.pointC[1] = Cy;
        this.pointD[0] = Dx;
        this.pointD[1] = Dy;
    }

    static Square fromArea(double area) {
        return new Square(0, 0, Math.sqrt(area), 0,
                Math.sqrt(area), Math.sqrt(area), 0, Math.sqrt(area));
    }
}
