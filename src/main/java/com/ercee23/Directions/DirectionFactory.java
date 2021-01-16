package com.ercee23.Directions;


public class DirectionFactory {

    public Direction getDirection(char direction) throws Exception{
        Direction direc;
        switch (direction) {
            case ('N'):
                direc = new NorthDirection();
                break;
            case ('S'):
                direc = new SouthDirection();
                break;
            case ('E'):
                direc = new EastDirection();
                break;
            case ('W'):
                direc = new WestDirection();
                break;
            default:
                throw new Exception();
        }
        return direc;
    }
}
