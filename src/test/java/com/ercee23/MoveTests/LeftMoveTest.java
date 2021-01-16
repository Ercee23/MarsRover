package com.ercee23.MoveTests;

import com.ercee23.Coordinate;
import com.ercee23.Device.Rover;
import com.ercee23.Directions.Direction;
import com.ercee23.Directions.NorthDirection;
import com.ercee23.Directions.WestDirection;
import com.ercee23.Map.Map;
import com.ercee23.Moves.LeftMove;
import com.ercee23.Moves.Move;
import org.junit.Test;

import java.util.ArrayList;

public class LeftMoveTest {

    @Test
    public void LeftMoveMakeMove() throws Exception {
        Map.getMap(5,5);
        Coordinate coordinate = new Coordinate(0,0);
        Direction direction = new NorthDirection();
        ArrayList<Move> moves = new ArrayList<>();
        moves.add(new LeftMove());
        Rover rover = new Rover(coordinate, direction, moves);
        rover.moves.get(0).makeMove(rover);
        assert(rover.direction.getClass() == WestDirection.class);
        assert(rover.coordinate.getXcoord() == 0 && rover.coordinate.getYcoord() == 0);
    }
}
