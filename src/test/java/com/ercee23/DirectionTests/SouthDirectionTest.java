package com.ercee23.DirectionTests;

import com.ercee23.Coordinate;
import com.ercee23.Directions.EastDirection;
import com.ercee23.Directions.SouthDirection;
import com.ercee23.Directions.WestDirection;
import org.junit.Test;

public class SouthDirectionTest {
    @Test
    public void SouthDirectionNextTest() {
        assert(new SouthDirection().nextDirection().getClass() == WestDirection.class);
    }

    @Test
    public void SouthDirectionPreviousTest() {
        assert(new SouthDirection().previousDirection().getClass() == EastDirection.class);
    }

    @Test
    public void SouthDirectionMoveTest() {
        Coordinate coordinate = new Coordinate(0,1);
        new SouthDirection().move(coordinate);
        assert(coordinate.getXcoord()==0);
        assert(coordinate.getYcoord()==0);
    }

    @Test
    public void NorthDirectionMoveTestError() {
        Coordinate coordinate = new Coordinate(0,0);
        new SouthDirection().move(coordinate);
        assert(coordinate.getXcoord()==0);
        assert(coordinate.getYcoord()==0);
    }
}
