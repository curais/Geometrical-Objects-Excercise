package org.geometrical.shape.quadrilateral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RhombusTest {

    @Test
    void getArea() {
        Rhombus rhombus = new Rhombus(6, 60, 120);
        assertEquals(24, rhombus.getPerimeter());
        assertEquals(3117, Math.floor(rhombus.getArea() * 100));
    }
}