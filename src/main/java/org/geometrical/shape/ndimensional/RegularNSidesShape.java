package org.geometrical.shape.ndimensional;

import org.geometrical.shape.Shape;

/**
 * This class represents a regular n-gon, with n >= 5; which all of its sides have the same length
 */
public class RegularNSidesShape implements Shape {

    private final double lengthOfSides;
    private final long numberOfSides;
    private final long angle;

    public RegularNSidesShape(double lengthOfSides, long numberOfSides) {
        this.lengthOfSides = lengthOfSides;
        this.numberOfSides = numberOfSides;
        this.angle = (180 * (numberOfSides - 2)) / numberOfSides;
    }

    public double getLengthOfSides() {
        return lengthOfSides;
    }

    public long getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public double getArea() {
        return (getPerimeter() * getApothem()) / 2.0;
    }

    private double getApothem() {
        return lengthOfSides/(2.0 * Math.tan(Math.PI/numberOfSides));
    }

    @Override
    public double getPerimeter() {
        return numberOfSides * lengthOfSides;
    }
}
