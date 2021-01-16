package com.ercee23.Moves;

import com.ercee23.Device.Device;

public class LeftMove implements Move{

    public void makeMove(Device device) {
        device.direction = device.direction.previousDirection();
    }
}
