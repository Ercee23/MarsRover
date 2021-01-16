package com.ercee23.MoveTests;

import com.ercee23.Coordinate;
import com.ercee23.Device.Rover;
import com.ercee23.Directions.Direction;
import com.ercee23.Directions.EastDirection;
import com.ercee23.Directions.NorthDirection;
import com.ercee23.Map.Map;
import com.ercee23.Moves.Move;
import com.ercee23.Moves.RightMove;
import org.junit.Test;

import java.util.ArrayList;

public class RightMoveTest {

    @Test
    public void RightMoveMakeMove() throws Exception {
        Map.getMap(5,5);
        Coordinate coordinate = new Coordinate(0,0);
        Direction direction = new NorthDirection();
        ArrayList<Move> moves = new ArrayList<>();
        moves.add(new RightMove());
        Rover rover = new Rover(coordinate, direction, moves);
        rover.moves.get(0).makeMove(rover);
        assert(rover.direction.getClass() == EastDirection.class);
        assert(rover.coordinate.getXcoord() == 0 && rover.coordinate.getYcoord() == 0);
    }
}
