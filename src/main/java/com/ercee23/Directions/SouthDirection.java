package com.ercee23.Directions;

import com.ercee23.Coordinate;

public class SouthDirection implements Direction{

    private final int border = 0;

    public Direction nextDirection() {
        return new WestDirection();
    }

    public Direction previousDirection() {
        return new EastDirection();
    }

    public void move(Coordinate coordinate) {
        if (coordinate.getYcoord() > this.border) {
            coordinate.setYcoord(coordinate.getYcoord() - 1);
        }
    }

    public String toString() {
        return "S";
    }
}
