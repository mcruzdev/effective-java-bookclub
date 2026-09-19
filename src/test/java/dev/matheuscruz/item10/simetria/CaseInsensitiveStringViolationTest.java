package dev.matheuscruz.item10.simetria;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CaseInsensitiveStringViolationTest {

    String s = "polish";
    CaseInsensitiveViolation cis = new CaseInsensitiveViolation("Polish");

    // Viola a reflexidade
    // x.equals(y) deve retornar true
    // y.equals(x) deve retornar true

    @Test
    void cis_equals_s() {
        Assertions.assertTrue(cis.equals(s));
    }

    @Test
    void s_equals_cis() {
        Assertions.assertTrue(s.equals(cis));
    }

    @Test
    void contains() {

        List<CaseInsensitiveViolation> objects = new ArrayList<>();
        objects.add(cis);
        //
        Assertions.assertFalse(objects.contains(s));

    }
}