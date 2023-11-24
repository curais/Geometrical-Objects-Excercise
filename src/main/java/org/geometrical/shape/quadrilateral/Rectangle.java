package org.geometrical.shape.quadrilateral;

public class Rectangle extends AbstractQuadrilateral{
    protected Rectangle(double a, double b) {
        super(a, b, a, b, 90, 90, 90, 90);
    }

    @Override
    public double getArea() {
        return this.getA() * this.getB();
    }
}
