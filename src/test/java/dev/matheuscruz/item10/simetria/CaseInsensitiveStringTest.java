package dev.matheuscruz.item10.simetria;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CaseInsensitiveStringTest {
    CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
    CaseInsensitiveString s = new CaseInsensitiveString("polish");

    // OK

    @Test
    void cis_equals_s() {
        Assertions.assertTrue(cis.equals(s));
    }

    @Test
    void s_equals_cis() {
        Assertions.assertTrue(s.equals(cis));
    }
}