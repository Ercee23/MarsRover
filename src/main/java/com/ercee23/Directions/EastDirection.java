package com.ercee23.Directions;

import com.ercee23.Coordinate;
import com.ercee23.Map.Map;

public class EastDirection implements Direction{

    private final int border = Map.getMap().width;

    public Direction nextDirection() {
        return new SouthDirection();
    }

    public Direction previousDirection() {
        return new NorthDirection();
    }

    public void move(Coordinate coordinate) {
        if (coordinate.getXcoord() < this.border) {
            coordinate.setXcoord(coordinate.getXcoord() + 1);
        }
    }

    public String toString() {
        return "E";
    }
}
