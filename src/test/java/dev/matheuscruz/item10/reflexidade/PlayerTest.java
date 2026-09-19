package dev.matheuscruz.item10.reflexidade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerTest {

    @Test
    void x_equals_x() {
        Player skywalker = new Player("skywalker");
        Assertions.assertTrue(skywalker.equals(skywalker));
    }
}