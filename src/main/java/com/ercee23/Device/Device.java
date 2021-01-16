package com.ercee23.Device;

import com.ercee23.Coordinate;
import com.ercee23.Directions.Direction;
import com.ercee23.Moves.Move;

import java.util.ArrayList;

public abstract class Device {

    public Coordinate coordinate;
    public Direction direction;
    public ArrayList<Move> moves;

    public abstract void start();
}
