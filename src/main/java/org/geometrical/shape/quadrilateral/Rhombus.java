package org.geometrical.shape.quadrilateral;

public class Rhombus extends AbstractQuadrilateral {

    public Rhombus(double a, double alfa, double beta) {
        super(a, a, a, a, alfa, beta, alfa, beta);
    }

    @Override
    public double getArea() {
        return (this.getA() * this.getA()) * Math.sin(Math.toRadians(this.getAngleA()));
    }
}
