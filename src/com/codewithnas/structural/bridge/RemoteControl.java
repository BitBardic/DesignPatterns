package com.codewithnas.structural.bridge;

// Basic Remote Control (turnOn, turnOff)
// Advanced Remote Control (setChannel)
// Movie Remote Control (play, pause, rewind)

// Remote Control
//      SonyRemoteControl
//      SamsungRemoteControl
//      AdvancedRemoteControl
//          SonyAdvancedRemoteControl
//          SamsungAdvancedRemoteControl

// at the moment 2 types of remote controls -> 2 new classes but as vendors increase class hirarchy become more complex
// to cater above problem we use bridge pattern to keep hirarchy flexible.

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}
