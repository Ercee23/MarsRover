package com.ercee23.Directions;

import com.ercee23.Coordinate;

public class WestDirection implements Direction{

    private final int border = 0;

    public Direction nextDirection() {
        return new NorthDirection();
    }

    public Direction previousDirection() {
        return new SouthDirection();
    }

    public void move(Coordinate coordinate) {
        if (coordinate.getXcoord() > this.border) {
            coordinate.setXcoord(coordinate.getXcoord() - 1);
        }
    }

    public String toString() {
        return "W";
    }
}
