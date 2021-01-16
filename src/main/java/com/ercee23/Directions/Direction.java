package com.ercee23.Directions;

import com.ercee23.Coordinate;

public interface Direction {

    Direction nextDirection();
    Direction previousDirection();
    void move(Coordinate coordinate);
}
