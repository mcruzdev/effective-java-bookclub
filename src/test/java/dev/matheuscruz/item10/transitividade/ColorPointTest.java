package dev.matheuscruz.item10.transitividade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.Color;

class ColorPointTest {


    // simetria
    @Test
    void x_y() {

        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);

        Assertions.assertTrue(p.equals(cp), "p must be equal to cp");
        Assertions.assertTrue(cp.equals(p), "cp must be equal to p");

    }

    // transitividade
    @Test
    void x_y_z() {
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);


        Assertions.assertTrue(p1.equals(p2), "p1 must be equal to p2");
        Assertions.assertTrue(p2.equals(p3), "p1 must be equal to p3");
        Assertions.assertTrue(p1.equals(p3), "p1 must be equal to p3");
    }
}