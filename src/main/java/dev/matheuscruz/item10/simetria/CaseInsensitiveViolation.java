package dev.matheuscruz.item10.simetria;

import java.util.Objects;

public class CaseInsensitiveViolation {

    private final String value;

    public CaseInsensitiveViolation(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveViolation)
            return value.equalsIgnoreCase(((CaseInsensitiveViolation) o).value);

        if (o instanceof String)
            return value.equalsIgnoreCase((String) o);
        return false;
    }
}
