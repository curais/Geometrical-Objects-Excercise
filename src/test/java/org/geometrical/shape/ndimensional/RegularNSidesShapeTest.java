package org.geometrical.shape.ndimensional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularNSidesShapeTest {

    @Test
    void pentagonTest() {
        RegularNSidesShape pentagon = new RegularNSidesShape(2, 5);
        assertEquals(10, pentagon.getPerimeter());
        assertEquals(688, Math.round(pentagon.getArea() * 100));
    }

    @Test
    void hexagonTest() {
        RegularNSidesShape hexagon = new RegularNSidesShape(3, 6);
        assertEquals(18, hexagon.getPerimeter());
        assertEquals(2338, Math.round(hexagon.getArea() * 100));
    }

    @Test
    void octagonTest() {
        RegularNSidesShape octagon = new RegularNSidesShape(4, 8);
        assertEquals(32, octagon.getPerimeter());
        assertEquals(7725, Math.round(octagon.getArea() * 100));
    }

    @Test
    void decagonTest() {
        RegularNSidesShape octagon = new RegularNSidesShape(10, 10);
        assertEquals(100, octagon.getPerimeter());
        assertEquals(76942, Math.round(octagon.getArea() * 100));
    }

}