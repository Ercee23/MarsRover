package com.ercee23.Directions;

import com.ercee23.Coordinate;
import com.ercee23.Map.Map;

public class NorthDirection implements Direction{

    private final int border = Map.getMap().height;

    public Direction nextDirection() {
        return new EastDirection();
    }

    public Direction previousDirection() {
        return new WestDirection();
    }

    public void move(Coordinate coordinate) {
        if (coordinate.getYcoord() < this.border) {
            coordinate.setYcoord(coordinate.getYcoord() + 1);
        }
    }

    public String toString() {
        return "N";
    }
}
