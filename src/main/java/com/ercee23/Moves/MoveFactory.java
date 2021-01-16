package com.ercee23.Moves;

public class MoveFactory {

    public Move getMove(char direction) throws Exception {
        Move move;
        switch (direction) {
            case ('L'):
                move = new LeftMove();
                break;
            case ('R'):
                move = new RightMove();
                break;
            case ('M'):
                move = new ForwardMove();
                break;
            default:
                throw new Exception();
        }
        return move;
    }
}
