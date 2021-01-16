package com.ercee23.DirectionTests;

import com.ercee23.Coordinate;
import com.ercee23.Directions.EastDirection;
import com.ercee23.Directions.NorthDirection;
import com.ercee23.Directions.WestDirection;
import org.junit.Test;

public class NorthDirectionTest {
    @Test
    public void NorthDirectionNextTest() {
        assert(new NorthDirection().nextDirection().getClass() == EastDirection.class);
    }

    @Test
    public void NorthDirectionPreviousTest() {
        assert(new NorthDirection().previousDirection().getClass() == WestDirection.class);
    }

    @Test
    public void NorthDirectionMoveTest() {
        Coordinate coordinate = new Coordinate(0,0);
        new NorthDirection().move(coordinate);
        assert(coordinate.getXcoord()==0);
        assert(coordinate.getYcoord()==1);
    }

    @Test
    public void NorthDirectionMoveTestError() {
        Coordinate coordinate = new Coordinate(0,5);
        new NorthDirection().move(coordinate);
        assert(coordinate.getXcoord()==0);
        assert(coordinate.getYcoord()==5);
    }
}
