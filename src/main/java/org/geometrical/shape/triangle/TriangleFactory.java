package org.geometrical.shape.triangle;

public class TriangleFactory {

    private static TriangleFactory INSTANCE;

    public synchronized static TriangleFactory getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TriangleFactory();
        }
        return INSTANCE;
    }

    private TriangleFactory() {}

    public Triangle createTriangle(double a, double b, double c, double alfa, double beta, double theta) {
        if (!triangleInequality(a, b ,c) || !conditionOfAngles(alfa, beta, theta)) {
            throw new IllegalArgumentException("Cannot create Triangle of these characteristics");
        }
        return new Triangle(a,b,c,alfa,beta,theta);
    }

    private boolean triangleInequality(double a, double b, double c) {
        return 2 * Math.max(a, Math.max(b,c)) < a + b + c;
    }

    private boolean conditionOfAngles(double alfa, double beta, double theta) {
        return (alfa > 0 && beta > 0 && theta > 0) && ((alfa + beta + theta) == 180.0);
    }

    public Triangle createRightAngledTriangle(double a, double b, double c, double alfa, double beta) {
        return this.createTriangle(a,b,c,alfa, beta, 90);
    }

    public Triangle createEquilateralTriangle(double side) {
        return this.createTriangle(side,side,side, 60, 60, 60);
    }

    public Triangle createIsoscelesTriangle(double leg, double base, double baseAngle, double vertexAngle) {
        return this.createTriangle(leg,leg,base, baseAngle, baseAngle, vertexAngle);
    }
}
