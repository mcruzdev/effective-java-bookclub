package dev.matheuscruz.item10.transitividade;

import java.awt.Color;

public class ColorPoint extends Point {

    public final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
//        A.
//        if (!(obj instanceof ColorPoint c)) return false;
//        return super.equals(obj) && c.color == this.color;

        // B.
//        if (!(obj instanceof Point p)) return false;
//        // é Point
//        if (!(obj instanceof ColorPoint)) return obj.equals(this);
//        // é ColorPoint, faça uma comparação completa
//        return super.equals(obj) && ((ColorPoint) obj).color == color;

// C. Olhar apenas para a getClass(); Quebra o principio de Liskov
        if (obj == null || obj.getClass() != getClass()) return false;
        Point p = (Point) obj;
        return p.x == x && p.y == y;
    }
}
