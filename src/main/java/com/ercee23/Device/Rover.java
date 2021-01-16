package com.ercee23.Device;

import com.ercee23.Coordinate;
import com.ercee23.Directions.Direction;
import com.ercee23.Moves.Move;

import java.util.ArrayList;

public class Rover extends Device{

    public Rover(Coordinate coordinate, Direction direction, ArrayList<Move> moves) {
        this.coordinate = coordinate;
        this.direction = direction;
        this.moves = moves;
    }

    public String toString() {
        return this.coordinate.toString() + " " + this.direction.toString();
    }

    public void start() {
        this.moves.forEach(move -> move.makeMove(this));
    }
}
