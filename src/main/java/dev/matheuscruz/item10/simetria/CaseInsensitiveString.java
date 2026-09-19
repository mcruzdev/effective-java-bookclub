package dev.matheuscruz.item10.simetria;

import java.util.Objects;

public class CaseInsensitiveString {

    private final String value;

    public CaseInsensitiveString(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) obj).value.equalsIgnoreCase(value);
    }
}
