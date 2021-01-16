package com.ercee23.DirectionTests;

import com.ercee23.Coordinate;
import com.ercee23.Directions.EastDirection;
import com.ercee23.Directions.NorthDirection;
import com.ercee23.Directions.SouthDirection;
import org.junit.Test;

public class EastDirectionTest {

    @Test
    public void EastDirectionNextTest() {
        assert(new EastDirection().nextDirection().getClass() == SouthDirection.class);
    }

    @Test
    public void EastDirectionPreviousTest() {
        assert(new EastDirection().previousDirection().getClass() == NorthDirection.class);
    }

    @Test
    public void EastDirectionMoveTest() {
        Coordinate coordinate = new Coordinate(0,0);
        new EastDirection().move(coordinate);
        assert(coordinate.getXcoord()==1);
        assert(coordinate.getYcoord()==0);
    }

    @Test
    public void EastDirectionMoveTestError() {
        Coordinate coordinate = new Coordinate(5,0);
        new EastDirection().move(coordinate);
        assert(coordinate.getXcoord()==5);
        assert(coordinate.getYcoord()==0);
    }
}
