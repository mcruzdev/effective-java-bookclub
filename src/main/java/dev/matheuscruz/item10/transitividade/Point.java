package dev.matheuscruz.item10.transitividade;

public class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point point)) return false;
        return point.x == this.x && point.y == this.y;
    }
}
