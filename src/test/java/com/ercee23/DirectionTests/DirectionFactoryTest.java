package com.ercee23.DirectionTests;

import com.ercee23.Directions.*;
import org.junit.Test;

public class DirectionFactoryTest {

    @Test
    public void DirectionFactoryTestSimpleNorth() throws Exception {
        char directionKey = 'N';
        DirectionFactory directionFactory = new DirectionFactory();
        Direction direction = directionFactory.getDirection(directionKey);
        assert(direction.getClass() == NorthDirection.class);
    }

    @Test
    public void DirectionFactoryTestSimpleSouth() throws Exception {
        char directionKey = 'S';
        DirectionFactory directionFactory = new DirectionFactory();
        Direction direction = directionFactory.getDirection(directionKey);
        assert(direction.getClass() == SouthDirection.class);
    }

    @Test
    public void DirectionFactoryTestSimpleWest() throws Exception {
        char directionKey = 'W';
        DirectionFactory directionFactory = new DirectionFactory();
        Direction direction = directionFactory.getDirection(directionKey);
        assert(direction.getClass() == WestDirection.class);
    }

    @Test
    public void DirectionFactoryTestSimpleEast() throws Exception {
        char directionKey = 'E';
        DirectionFactory directionFactory = new DirectionFactory();
        Direction direction = directionFactory.getDirection(directionKey);
        assert(direction.getClass() == EastDirection.class);
    }

    @Test
    public void DirectionFactoryTestError() {
        char directionKey = 'Q';
        DirectionFactory directionFactory = new DirectionFactory();
        try {
            directionFactory.getDirection(directionKey);
            assert(false);
        } catch (Exception e) {
            assert(true);
        }
    }
}
