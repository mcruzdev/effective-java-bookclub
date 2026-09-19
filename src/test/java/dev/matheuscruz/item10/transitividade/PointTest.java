package dev.matheuscruz.item10.transitividade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PointTest {

    // simetria
    @Test
    void x_y_z() {
        Point x = new Point(10, 10);
        Point y = new Point(10, 10);
        Point z = new Point(10, 10);

        Assertions.assertTrue(x.equals(y));
        Assertions.assertTrue(y.equals(z));
        Assertions.assertTrue(z.equals(x));
    }
}