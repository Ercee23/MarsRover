package com.ercee23.Moves;

import com.ercee23.Device.Device;

public class RightMove implements Move{
    public void makeMove(Device device) {
        device.direction = device.direction.nextDirection();
    }
}
