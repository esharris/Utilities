package com.earl.utilities;

import java.util.Objects;

/**
 *
 * @author earlharris
 *
 */
public final class Coordinate {

    public static final Coordinate ORIGIN = new Coordinate(0, 0);

    private final int x;
    private final int y;

    /**
     *
     * @param x
     * @param y
     */
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate add(Coordinate coordinate) {
        return new Coordinate(x + coordinate.getX(), y + coordinate.getY());
    }

    public Coordinate subtract(Coordinate coordinate) {
        return new Coordinate(x - coordinate.getX(), y - coordinate.getY());
    }

    public Coordinate mult(int i) {
        return new Coordinate(i * this.x, i * this.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append(Coordinate.class);
        stringBuffer.append("(");
        stringBuffer.append(x);
        stringBuffer.append(", ");
        stringBuffer.append(y);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Coordinate other = (Coordinate) obj;
        return x == other.x && y == other.y;
    }
}
