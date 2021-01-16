package com.ercee23.MoveTests;

import com.ercee23.Moves.*;
import org.junit.Test;

public class MoveFactoryTest {

    @Test
    public void MoveFactorySimpleForward() {
        char direction = 'M';
        try {
            Move move = new MoveFactory().getMove(direction);
            assert(move instanceof ForwardMove);
        }
        catch (Exception e) {
            assert(false);
        }
    }

    @Test
    public void MoveFactorySimpleLeft() {
        char direction = 'L';
        try {
            Move move = new MoveFactory().getMove(direction);
            assert(move instanceof LeftMove);
        }
        catch (Exception e) {
            assert(false);
        }
    }

    @Test
    public void MoveFactorySimpleRight() {
        char direction = 'R';
        try {
            Move move = new MoveFactory().getMove(direction);
            assert(move instanceof RightMove);
        }
        catch (Exception e) {
            assert(false);
        }
    }

    @Test
    public void MoveFactorySimpleError() {
        char direction = 'Q';
        try {
            new MoveFactory().getMove(direction);
            assert(false);
        }
        catch (Exception e) {
            assert(true);
        }
    }
}
