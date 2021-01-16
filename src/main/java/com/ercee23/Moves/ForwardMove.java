package com.ercee23.Moves;

import com.ercee23.Device.Device;

public class ForwardMove implements Move{

    public void makeMove(Device device) {
        device.direction.move(device.coordinate);
    }
}
