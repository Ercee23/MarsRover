package com.ercee23.DeviceTests;

import com.ercee23.Coordinate;
import com.ercee23.Device.Rover;
import com.ercee23.Directions.Direction;
import com.ercee23.Directions.NorthDirection;
import com.ercee23.Directions.WestDirection;
import com.ercee23.Map.Map;
import com.ercee23.Moves.ForwardMove;
import com.ercee23.Moves.LeftMove;
import com.ercee23.Moves.Move;
import org.junit.Test;

import java.util.ArrayList;

public class RoverTest {

    @Test
    public void RoverStartTest() throws Exception {
        Map.getMap(5,5);
        Coordinate coordinate = new Coordinate(0,0);
        Direction direction = new NorthDirection();
        ArrayList<Move> moves = new ArrayList<>();
        moves.add(new ForwardMove());
        moves.add(new ForwardMove());
        moves.add(new LeftMove());
        moves.add(new ForwardMove());
        Rover rover = new Rover(coordinate, direction, moves);
        rover.start();
        assert(rover.direction.getClass() == WestDirection.class);
        assert(rover.coordinate.getXcoord() == 0 && rover.coordinate.getYcoord() == 2);
    }
}
