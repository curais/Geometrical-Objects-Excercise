package org.geometrical.shape.quadrilateral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void getArea() {
        Square square = new Square(3);
        assertEquals(9, square.getArea());
    }
}