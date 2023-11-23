package org.geometrical.shape.quadrilateral;

public class Rhomboid extends AbstractQuadrilateral{

    public Rhomboid(double a, double b, double alfa, double beta) {
        super(a, b, a, b, alfa, beta, alfa, beta);
    }

    @Override
    public double getArea() {
        return (this.getA() * this.getA()) * Math.sin(Math.toRadians(this.getAngleA()));
    }
}