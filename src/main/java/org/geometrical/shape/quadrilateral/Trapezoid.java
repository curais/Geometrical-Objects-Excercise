package org.geometrical.shape.quadrilateral;

public class Trapezoid extends AbstractQuadrilateral{
    public Trapezoid(double a, double b, double c, double d, double angleA, double angleB, double angleC, double angleD) {
        super(a, b, c, d, angleA, angleB, angleC, angleD);
        if (!conditionOfExistence(a,b,c,d)) {
            throw new IllegalArgumentException("Cannot create a trapezoid of these characteristics");
        }
    }

    private boolean conditionOfExistence(double a, double b, double c, double d) {
        return Math.abs(d - c) < Math.abs(b - a) && Math.abs(b - a) < d + c;
    }

    private double getHeight() {
        double upperPart = (-this.getA() + this.getB() + this.getC() + this.getD())
                * (this.getA() - this.getB() + this.getC() + this.getD())
                * (this.getA() - this.getB() + this.getC() - this.getD())
                * (this.getA() - this.getB() - this.getC() + this.getD());

        return Math.sqrt(upperPart)/(2.0 * Math.abs(this.getB() - this.getA()));
    }

    @Override
    public double getArea() {
        return ((this.getA() + this.getB())/ 2.0) * getHeight();
    }
}
