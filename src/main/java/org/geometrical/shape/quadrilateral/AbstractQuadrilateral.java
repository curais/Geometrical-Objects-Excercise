package org.geometrical.shape.quadrilateral;

import org.geometrical.shape.Shape;

public abstract class AbstractQuadrilateral implements Shape {
    private final double a, b, c, d;
    private final double angleA, angleB, angleC, angleD;

    protected AbstractQuadrilateral(double a, double b, double c, double d, double angleA, double angleB, double angleC, double angleD) {
        if (!existenceOfQuadrilateralByAngles(angleA, angleB, angleC, angleD)) {
            throw new IllegalArgumentException("Angles of quadrilateral should sum 360");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;
        this.angleD = angleD;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getAngleA() {
        return angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    public double getAngleC() {
        return angleC;
    }

    public double getAngleD() {
        return angleD;
    }

    private boolean existenceOfQuadrilateralByAngles(double angleA, double angleB, double angleC, double angleD) {
        return (angleA + angleB + angleC + angleD) == 360.0;
    }

    public abstract double getArea();

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }
}
