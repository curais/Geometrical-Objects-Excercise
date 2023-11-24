package org.geometrical.shape.quadrilateral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezoidTest {

    @Test
    void testGetArea1() {
        Trapezoid trapezoid = new Trapezoid(30, 55, 15, 20, 60.0, 120.0, 60.0, 120.0 );
        assertEquals(120, trapezoid.getPerimeter());
        assertEquals(510, trapezoid.getArea());
    }
}