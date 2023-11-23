package org.geometrical.shape.triangle;

import org.geometrical.shape.Shape;

public class Triangle implements Shape {
    protected final double a, b, c; //Sides of the triangle
    protected final double alfa, beta, theta; //angles

    protected Triangle(double a, double b, double c, double alfa, double beta, double theta) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.alfa = alfa;
        this.beta = beta;
        this.theta = theta;
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

    public double getAlfa() {
        return alfa;
    }

    public double getBeta() {
        return beta;
    }

    public double getTheta() {
        return theta;
    }



    @Override
    public double getArea() {
        double semiperimeter = this.getPerimeter()/2.0;
        return Math.sqrt(semiperimeter * (semiperimeter - this.a)  * (semiperimeter - this.b) * (semiperimeter - this.c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
