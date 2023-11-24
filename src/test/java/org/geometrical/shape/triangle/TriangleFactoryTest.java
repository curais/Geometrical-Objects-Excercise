package org.geometrical.shape.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleFactoryTest {

    TriangleFactory factory = TriangleFactory.getInstance();

    @Test
    void createRightAngledTriangle() {
        Triangle triangle = factory.createRightAngledTriangle(3,4, 36.87, 53.13);
        assertEquals(12, triangle.getPerimeter());
        assertEquals(6, triangle.getArea());
    }

    @Test
    void createEquilateralTriangle() {
        Triangle triangle = factory.createEquilateralTriangle(9);
        assertEquals(27, triangle.getPerimeter());
        double expectedArea = (9 * 9) * (Math.sqrt(3) / 4.0);
        assertEquals(expectedArea, triangle.getArea());
    }

    @Test
    void createIsoscelesTriangle() {
        Triangle triangle = factory.createIsoscelesTriangle(22, 15, 71, 38);
        assertEquals(59, triangle.getPerimeter());
        double expectedArea = ((Math.sqrt(Math.pow(triangle.getA(),2) - (Math.pow(triangle.getC(), 2)/4.0))) * triangle.getC()) / 2.0;
        //Had to do a rounding because there was a difference of 0.000005 between the two areas, mostly because of the usage of different methods
        assertEquals(Math.round(expectedArea * 1000), Math.round(triangle.getArea() * 1000));
    }

    @Test()
    void invalidTriangle() {
        assertThrows(IllegalArgumentException.class, () -> factory.createRightAngledTriangle(1,1, 60, 60));
    }
}