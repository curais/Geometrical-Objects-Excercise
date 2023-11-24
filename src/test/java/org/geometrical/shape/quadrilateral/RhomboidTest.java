package org.geometrical.shape.quadrilateral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RhomboidTest {

    @Test
    void getArea() {
        Rhomboid rhomboid = new Rhomboid(8, 5, 60, 120);
        assertEquals(26, rhomboid.getPerimeter());
        assertEquals(3464, Math.round(rhomboid.getArea() * 100));
    }
}