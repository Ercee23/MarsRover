package com.ercee23.MoveTests;

import com.ercee23.Coordinate;
import com.ercee23.Device.Rover;
import com.ercee23.Directions.Direction;
import com.ercee23.Directions.NorthDirection;
import com.ercee23.Map.Map;
import com.ercee23.Moves.ForwardMove;
import com.ercee23.Moves.Move;
import org.junit.Test;

import java.util.ArrayList;

public class ForwardMoveTest {

    @Test
    public void ForwardMoveMakeMove() throws Exception {
        Map.getMap(5,5);
        Coordinate coordinate = new Coordinate(0,0);
        Direction direction = new NorthDirection();
        ArrayList<Move> moves = new ArrayList<>();
        moves.add(new ForwardMove());
        Rover rover = new Rover(coordinate, direction, moves);
        rover.moves.get(0).makeMove(rover);
        assert(rover.direction.getClass() == NorthDirection.class);
        assert(rover.coordinate.getXcoord() == 0 && rover.coordinate.getYcoord() == 1);
    }
}
