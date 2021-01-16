package com.ercee23.DirectionTests;

import com.ercee23.Coordinate;
import com.ercee23.Directions.NorthDirection;
import com.ercee23.Directions.SouthDirection;
import com.ercee23.Directions.WestDirection;
import org.junit.Test;

public class WestDirectionTest {

    @Test
    public void WestDirectionNextTest() {
        assert(new WestDirection().nextDirection().getClass() == NorthDirection.class);
    }

    @Test
    public void WestDirectionPreviousTest() {
        assert(new WestDirection().previousDirection().getClass() == SouthDirection.class);
    }

    @Test
    public void WestDirectionMoveTest() {
        Coordinate coordinate = new Coordinate(1,0);
        new WestDirection().move(coordinate);
        assert(coordinate.getXcoord()==0);
        assert(coordinate.getYcoord()==0);
    }

    @Test
    public void WestDirectionMoveTestError() {
        Coordinate coordinate = new Coordinate(0,0);
        new WestDirection().move(coordinate);
        assert(coordinate.getXcoord()==0);
        assert(coordinate.getYcoord()==0);
    }
}
