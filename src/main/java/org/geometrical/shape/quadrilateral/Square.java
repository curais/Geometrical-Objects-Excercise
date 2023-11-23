package org.geometrical.shape.quadrilateral;

public class Square extends AbstractQuadrilateral{

    public Square(double a) {
        super(a, a, a, a, 90, 90, 90, 90);
    }

    @Override
    public double getArea() {
        return this.getA() * this.getA();
    }
}
