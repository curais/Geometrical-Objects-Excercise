package org.geometrical.shape.quadrilateral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        Rectangle rectangle = new Rectangle(2, 5);
        assertEquals(14, rectangle.getPerimeter());
        assertEquals(10, rectangle.getArea());
    }
}